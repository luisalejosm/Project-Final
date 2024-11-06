package org.ironhack.projectfinalworkout.Repository;

import org.ironhack.projectfinalworkout.Model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {
}
