package hello;

import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository  extends CrudRepository<Library, Long> {
}
