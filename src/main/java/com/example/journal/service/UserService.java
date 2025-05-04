package com.example.journal.service;

import org.springframework.stereotype.Service;
import com.example.journal.entity.UserEntity;
import com.example.journal.repository.UserRepo;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;

    }

    public void saveAllValues(UserEntity userEntity) {

        userRepo.save(userEntity);

    }

}
