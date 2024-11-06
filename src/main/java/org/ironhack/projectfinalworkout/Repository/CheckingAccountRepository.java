package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {
}
