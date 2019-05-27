package hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookCategoryRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private  BookCategoryRepository bookCategoryRepository;


    @Test
    public void testOneToMany(){

        BookCategory bookCategory=new BookCategory("Category 1", new Book("Hello Koding 1"), new Book("Hello Koding 2"));

        testEntityManager.persist(bookCategory);

        for(BookCategory bookCategory1: bookCategoryRepository.findAll()){
            //TODO ?
        }

    }


}
