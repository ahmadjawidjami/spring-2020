package hu.cs.se.adjava.projectmanagement.repository;

import hu.cs.se.adjava.projectmanagement.model.ProjectAttendance;
import hu.cs.se.adjava.projectmanagement.model.ProjectAttendanceKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectAttendanceRepository extends JpaRepository<ProjectAttendance, ProjectAttendanceKey> {
}
