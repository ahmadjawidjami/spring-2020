package hu.cs.se.adjava.projectmanagement.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })

public class Project {

    private Integer id;
    private String name;
    private String location;
    private String startDate;

    private Department department;

    private Set<ProjectAttendance> projectAttendances;


    private Employee leader;

    @OneToMany(mappedBy = "project")
    public Set<ProjectAttendance> getProjectAttendances() {
        return projectAttendances;
    }

    public void setProjectAttendances(Set<ProjectAttendance> projectAttendances) {
        this.projectAttendances = projectAttendances;
    }

    @ManyToOne
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    @OneToOne
    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
