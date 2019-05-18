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
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            Address address = new Address("Turkey", "Elazig");
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add("9090");
            phoneNumbers.add("4455");

            repository.save(new Customer("f", "s", address, phoneNumbers));
            repository.save(new Customer("ff", "ss", address, phoneNumbers));
            repository.save(new Customer("fff", "sss", address, phoneNumbers));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("Customer found with findByLastName('ss'):");
            log.info("--------------------------------------------");
            repository.findByLastName("ss").forEach(bauer -> {
                log.info(bauer.toString());
            });
        };
    }

}
