package hu.cs.se.adjava.projectmanagement;

import hu.cs.se.adjava.projectmanagement.model.*;
import hu.cs.se.adjava.projectmanagement.repository.*;
import hu.cs.se.adjava.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//
		User user1 = new User(1, "admin", encoder.encode("admin"));
		User user2 = new User(2, "admin1", encoder.encode("admin1"));

		userRepository.save(user1);
		userRepository.save(user2);

	}
}
