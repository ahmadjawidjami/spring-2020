package hu.cs.se.adjava.projectmanagement;

import hu.cs.se.adjava.projectmanagement.model.*;
import hu.cs.se.adjava.projectmanagement.repository.*;
import hu.cs.se.adjava.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//
		Location location1 = new Location();
		Location location2 = new Location();
		Location location3 = new Location();
		location1.setName("Kabul");
		location2.setName("Herat");
		location3.setName("Kandahar");
		Set<Location> locations = new HashSet<>();
		locations.add(location1);
		locations.add(location2);
		locations.add(location3);
		Department department = new Department();
		department.setName("Construction");
		department.setLocations(locations);

		departmentRepository.save(department);








	}
}
