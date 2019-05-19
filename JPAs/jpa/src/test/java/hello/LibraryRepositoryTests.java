package hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LibraryRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private LibraryRepository libraryRepository;


    @Test
    public void testOnetoOne() {
        Library library = new Library("ff", new Place("code"));
        entityManager.persist(library);

        for (Library library1 : libraryRepository.findAll()) {
            Assert.assertEquals(library1.getPlace().getGeoCode(), "code");
        }

    }


}
