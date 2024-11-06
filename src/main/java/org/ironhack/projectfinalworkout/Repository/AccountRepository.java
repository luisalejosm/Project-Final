package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
