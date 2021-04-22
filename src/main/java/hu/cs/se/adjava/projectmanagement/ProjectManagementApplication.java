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

    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
    private UserRepository userRepository;

	

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		User initialUser = userRepository.findByUsername("admin");

		if (initialUser == null) {
			User user1 = new User("Jawid", "Jami", "admin", "admin@gmail.com", bCryptPasswordEncoder.encode("admin"));
			userRepository.save(user1);
		}


		userRepository.save(user1);
		userRepository.save(user2);

	}
}
