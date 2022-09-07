package com.example.mongodbbestpractice.repository.person;

import com.example.mongodbbestpractice.model.person.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

//crud jpa

public interface PersonRepository extends MongoRepository<Person, String> {
    //List<Person> findBySalary(final int salary);
    //jpa -> crud -> save, update, delete, list
}
