package hu.cs.se.adjava.projectmanagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ProjectAttendance implements Serializable {

    private Employee employee;
    private Project project;
    private Float hours;

    private ProjectAttendanceKey key;

    @EmbeddedId
    public ProjectAttendanceKey getKey() {
        return key;
    }

    public void setKey(ProjectAttendanceKey key) {
        this.key = key;
    }

    @MapsId("employee_id")
    @ManyToOne
    @JoinColumn(name = "employee_id")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @MapsId("project_id")
    @ManyToOne
    @JoinColumn(name = "project_id")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }
}
