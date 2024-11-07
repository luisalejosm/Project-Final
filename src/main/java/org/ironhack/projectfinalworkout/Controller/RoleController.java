package org.ironhack.projectfinalworkout.Controller;

import org.ironhack.projectfinalworkout.model.Role;
import org.ironhack.projectfinalworkout.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    public void SaveRole(@RequestBody Role role){
        roleService.saveRole(role);
    }


}
