package org.ironhack.projectfinalworkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.ironhack.projectfinalworkout.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
