package com.example.accesingdatamongodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/usuario")
public class PersonController {

    //Adding the REST Endpoints
    //The @Autowired annotation creates an instance of the movieRepository
    // object that will allow us to access and modify the movies database.
    @Autowired
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Person addNewUsers(@RequestBody Person person) {

        log.info(String.valueOf(person));
        return personRepository.save(person);
    }
    @PostMapping(value = "/save")
    public Person addPerson(@RequestBody Person person) {
        log.info("Saving movie.");
        return personRepository.save(person);
    }
    @GetMapping(value = "/list")
    public List<Person> getAllMovies() {
        log.info("Getting all movies.");
        return personRepository.findAll();
    }

    @PutMapping(value = "/update/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody Person person) {
        log.info("Updating movie with ID: {}", id);
        return personRepository.save(person);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteMovie(@PathVariable String id) {
        log.info("Deleting movie with ID: {}", id);
        personRepository.deleteById(id);
    }
}
