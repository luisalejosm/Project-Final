package org.ironhack.projectfinalworkout.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    private String username;
    private String password;
}
