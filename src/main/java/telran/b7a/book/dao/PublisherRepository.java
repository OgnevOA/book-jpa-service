package telran.b7a.book.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.b7a.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {
	
	@Query("select distinct p.publisherName from Book b join b.authors a join b.publisher p where a.name =?1")
	List<String> findPublishersByAuthor(String authorName);
	
	Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);
}
