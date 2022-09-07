package com.example.mongodbbestpractice.controller.person;

import com.example.mongodbbestpractice.model.person.Person;
import com.example.mongodbbestpractice.service.person.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Person> listPerson() {
        log.info("List person from db");
        return personService.findAll();
    }


    @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
    public Person save(@RequestBody Person person){ // postman --> body(json)
        log.info("Save person in db");


        return personService.savePerson(person);
    }

   /*
   @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
   public Person save( Person person){ // research for an error in the output
        log.info("Save person in db");
        return personService.savePerson(person);
   }*/

   @DeleteMapping(value = "/delete/{id}")
   //@RequestMapping(value = "delete", method = RequestMethod.DELETE)
   // or use @DeleteMapping
   void deletePersonById(@PathVariable String id){
        log.info("delete Person for id ",id);
        personService.deletePersonById(id);
    }
    @PutMapping(value = "/update/{id}")
    //@RequestMapping(value = "update",method = RequestMethod.POST)
    void updatePersonById(@PathVariable String id, @RequestBody Person person){
       log.info("Update data for id: ",id);
       personService.updatePerson(person);
    }

}