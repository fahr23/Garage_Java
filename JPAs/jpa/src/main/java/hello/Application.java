package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository) {
        return (args) -> {
            // save a couple of customers
            Address address = new Address("Turkey", "Elazig");
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add("9090");
            phoneNumbers.add("4455");

            customerRepository.save(new Customer("f", "s", address, phoneNumbers));
            customerRepository.save(new Customer("ff", "ss", address, phoneNumbers));
            customerRepository.save(new Customer("fff", "sss", address, phoneNumbers));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : customerRepository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            customerRepository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("Customer found with findByLastName('ss'):");
            log.info("--------------------------------------------");
            customerRepository.findByLastName("ss").forEach(bauer -> {
                log.info(bauer.toString());
            });

        };
    }


    @Bean
    CommandLineRunner demoRelations(LibraryRepository libraryRepository){
        return (arg)->{

            Library library= new Library("ff", new Place("code"));
            libraryRepository.save(library);

            //fetch all library
            log.info("Library found with findAll()");
            for(Library library1: libraryRepository.findAll()){
                log.info(library1.toString());
            }


        };
    }

}
