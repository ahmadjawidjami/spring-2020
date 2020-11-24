package hu.cs.se.adjava.projectmanagement;

import hu.cs.se.adjava.projectmanagement.model.*;
import hu.cs.se.adjava.projectmanagement.repository.BookRepository;
import hu.cs.se.adjava.projectmanagement.repository.EmployeeRepository;
import hu.cs.se.adjava.projectmanagement.repository.ProjectRepository;
import hu.cs.se.adjava.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//






	}
}
