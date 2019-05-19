/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hello;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customers;

    @Test
    public void testFindByLastName() {
        Address address = new Address();
        Set<String> phoneNumbers = new HashSet<>();

        phoneNumbers.add("3344");
        phoneNumbers.add("2333");
        Customer customer = new Customer("first", "last", address, phoneNumbers);
        entityManager.persist(customer);

        List<Customer> findByLastName = customers.findByLastName(customer.getLastName());

        assertThat(findByLastName).extracting(Customer::getLastName).containsOnly(customer.getLastName());
    }


    @Test
    public void testEmbedededDemo() {
        Address address = new Address("Turkey", "Elazig");
        Set<String> phoneNumbers = new HashSet<>();

        phoneNumbers.add("3344");
        phoneNumbers.add("2333");
        Customer customer = new Customer("first", "last", address, phoneNumbers);
        entityManager.persist(customer);

        List<Customer> findByLastName = customers.findByLastName(customer.getLastName());

        assertThat(findByLastName).extracting(Customer::getAddress).containsOnly(address);
    }

    @Test
    public void testElementCollection() {
        Address address = new Address("Turkey", "Elazig");
        Set<String> phoneNumbers = new HashSet<>();

        phoneNumbers.add("3344");
        phoneNumbers.add("2333");
        Customer customer = new Customer("first", "last", address, phoneNumbers);
        entityManager.persist(customer);

        List<Customer> findByLastName = customers.findByLastName(customer.getLastName());

        assertThat(findByLastName).extracting(Customer::getPhoneNumbers).containsOnly(phoneNumbers);
    }
}
