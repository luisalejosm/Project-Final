package org.ironhack.projectfinalworkout.Controller;

import org.ironhack.projectfinalworkout.dto.RoleToUserDto;
import org.ironhack.projectfinalworkout.model.Role;
import org.ironhack.projectfinalworkout.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/role")
    @ResponseStatus(HttpStatus.CREATED)
    public void SaveRole(@RequestBody Role role){
        roleService.saveRole(role);
    }
    @PostMapping("/roles/add-to-user")
    public void addRoleToUser(@RequestBody RoleToUserDto roleToUserDto){
        roleService.addRoleToUser(roleToUserDto.getUsername(), roleToUserDto.getRoleName());
    }


}
