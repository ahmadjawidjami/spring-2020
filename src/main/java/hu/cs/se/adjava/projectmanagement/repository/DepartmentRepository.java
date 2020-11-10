package hu.cs.se.adjava.projectmanagement.repository;

import hu.cs.se.adjava.projectmanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
