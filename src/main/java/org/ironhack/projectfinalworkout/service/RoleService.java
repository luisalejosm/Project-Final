package org.ironhack.projectfinalworkout.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ironhack.projectfinalworkout.model.Role;
import org.ironhack.projectfinalworkout.repository.RoleRepository;
import org.ironhack.projectfinalworkout.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
@Slf4j
public class RoleService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Role saveRole(Role role){
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }


    //public void addRoleToUser()
}
