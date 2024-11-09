package org.ironhack.projectfinalworkout.security;

import org.ironhack.projectfinalworkout.security.filters.CustomAuthenticationFilter;
import org.ironhack.projectfinalworkout.security.filters.CustomAuthorizationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.*;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManagerBuilder authManagerBuilder;



    @Bean
    public PasswordEncoder encoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        CustomAuthenticationFilter customAuthenticationFilter = new CustomAuthenticationFilter(authManagerBuilder.getOrBuild());

        customAuthenticationFilter.setFilterProcessesUrl("/api/login");

        http.csrf().disable();

        http.sessionManagement().sessionCreationPolicy(STATELESS);

        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/api/login/**").permitAll()

                .requestMatchers(GET, "/api/users").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
                .requestMatchers(POST, "/api/users").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(POST, "/api/roles").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(POST, "/api/roles/add-to-user").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(POST, "/api/workouts").hasAnyAuthority("ROLE_TRAINER", "ROLE_ADMIN")
                .requestMatchers(POST, "/api/workouts").hasAnyAuthority("ROLE_TRAINER", "ROLE_ADMIN")
                .requestMatchers(GET, "/api/routine").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN", "ROLE_TRAINER")
                .requestMatchers(GET, "/api/exercises").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN", "ROLE_TRAINER")
                .requestMatchers(POST, "/api/routine").hasAnyAuthority( "ROLE_ADMIN", "ROLE_TRAINER")
                .requestMatchers(POST, "/api/exercises").hasAnyAuthority( "ROLE_ADMIN", "ROLE_TRAINER")
                .anyRequest().authenticated()); // any other endpoints require authentication

        http.addFilter(customAuthenticationFilter);

        http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
