package com.example.accesingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = PersonRepository.class)
public class AccesingdatamongodbApplication  {
    //public class AccesingdatamongodbApplication implements CommandLineRunner {
    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(AccesingdatamongodbApplication.class, args);
    }
    //@Override
    //public void run(String... strings) throws Exception {
        //personRepository.deleteAll();

//        final Person john = new Person("John", "Doe", LocalDateTime.now(), "Winner", 100);
  //      final Person joe = new Person("Joe", "Blogs", LocalDateTime.now(), "Loser", 50);

    //    personRepository.save(john);
      //  personRepository.save(joe);

//        System.out.println("Find all");
  //      personRepository.findAll().forEach(System.out::println);

    //    System.out.println("Find by findBySalary");
      //  personRepository.findBySalary(100).forEach(System.out::println);

        //System.out.println("Making John a loser");
        //john.setProfession("Loser");
        //personRepository.save(john);

        //System.out.println("Find all");
        //personRepository.findAll().forEach(System.out::println);
    //}

}
