package telran.b7a.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.b7a.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
