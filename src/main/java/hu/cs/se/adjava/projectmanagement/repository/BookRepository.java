package hu.cs.se.adjava.projectmanagement.repository;

import hu.cs.se.adjava.projectmanagement.model.Book;
import hu.cs.se.adjava.projectmanagement.model.BookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, BookId> {
}
