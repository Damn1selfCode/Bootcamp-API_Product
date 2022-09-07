package com.example.mongodbbestpractice.service.person;

import com.example.mongodbbestpractice.model.person.Person;
import com.example.mongodbbestpractice.repository.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findByPersontNumber(long idPerson) {
        return null;
    }


    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePersonById(String id) {
        personRepository.deleteById(id);
    }

}
