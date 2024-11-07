package org.ironhack.projectfinalworkout.service;

import lombok.RequiredArgsConstructor;
import org.ironhack.projectfinalworkout.repository.RoleRepository;
import org.ironhack.projectfinalworkout.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
}
