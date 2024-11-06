package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
