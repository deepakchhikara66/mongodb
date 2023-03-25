package com.example.mongodb_migration.repositories;

import com.example.mongodb_migration.entities.SimpleActivity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SimpleActivityRepository extends MongoRepository<SimpleActivity, String> {
}