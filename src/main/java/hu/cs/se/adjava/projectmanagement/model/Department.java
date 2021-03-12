package hu.cs.se.adjava.projectmanagement.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })

public class Department {



    private Integer id;

    @NotNull
    private String name;

    private Employee manager;

    private Set<Employee> employees;

    private Set<Project> projects;

    private Set<Location> locations;

    @ElementCollection
    @CollectionTable(name = "locations",
    joinColumns = @JoinColumn(name = "d_id"))
    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    @OneToOne
    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @JsonBackReference
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @OneToMany(mappedBy = "workingDepartment")
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
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

}
