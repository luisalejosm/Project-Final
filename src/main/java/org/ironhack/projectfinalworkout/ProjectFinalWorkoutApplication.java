package org.ironhack.projectfinalworkout;

import org.ironhack.projectfinalworkout.model.Role;
import org.ironhack.projectfinalworkout.model.User;
import org.ironhack.projectfinalworkout.service.RoleService;
import org.ironhack.projectfinalworkout.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class ProjectFinalWorkoutApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectFinalWorkoutApplication.class, args);
    }

    // To centralize configuration and allow to use it through dependency injection in our application
    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    // To have some data to start with, it's executed automatically
    @Bean
    CommandLineRunner run(UserService userService, RoleService roleService) {
        return args -> {
            roleService.saveRole(new Role(null, "ROLE_USER"));
            roleService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "John Doe", "john", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "James Smith", "james", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Jane Carry", "jane", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Chris Anderson", "chris", "1234", new ArrayList<>()));

            roleService.addRoleToUser("john", "ROLE_USER");
            roleService.addRoleToUser("james", "ROLE_ADMIN");
            roleService.addRoleToUser("jane", "ROLE_USER");
            roleService.addRoleToUser("chris", "ROLE_ADMIN");
            roleService.addRoleToUser("chris", "ROLE_USER");
        };
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
