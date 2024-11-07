package org.ironhack.projectfinalworkout.repository;

import org.ironhack.projectfinalworkout.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
