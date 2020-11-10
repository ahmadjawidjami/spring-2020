package hu.cs.se.adjava.projectmanagement.repository;

import hu.cs.se.adjava.projectmanagement.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
