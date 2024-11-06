package org.ironhack.projectfinalworkout.Service;

import org.ironhack.projectfinalworkout.Repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
}