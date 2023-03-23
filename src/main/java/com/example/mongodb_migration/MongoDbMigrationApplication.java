package com.example.mongodb_migration;

import com.example.mongodb_migration.entities.Customer;
import com.example.mongodb_migration.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.mongodb_migration.repositories")
public class MongoDbMigrationApplication implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;
    public static void main(String[] args) {
        SpringApplication.run(MongoDbMigrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerRepository.save(new Customer("Deepak", "Chhikara"));
    }
}
