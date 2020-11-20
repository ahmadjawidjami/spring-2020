package hu.cs.se.adjava.projectmanagement;

import hu.cs.se.adjava.projectmanagement.model.Book;
import hu.cs.se.adjava.projectmanagement.model.BookId;
import hu.cs.se.adjava.projectmanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book = new Book();
		BookId bookId = new BookId();
		bookId.setTitle("Java Programming2");
		bookId.setLanguage("English");
		book.setBookId(bookId);
		book.setAuthor("ABCD");

		bookRepository.save(book);


	}
}
