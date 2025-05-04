package com.example.journal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.journal.entity.UserEntity;

@Repository
public interface UserRepo extends MongoRepository<UserEntity, String> {
    
}
