package hu.cs.se.adjava.projectmanagement.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * Employee
 */
@Entity
@Table(name = "employees")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Employee {


  private Integer _id;
  private String firstName;
  private String lastName;
  private String gender;
  private Double salary;

  private Department department;

  private Department workingDepartment;

  private Set<Project> projects;

  private Project leadingProject;

  @OneToOne(mappedBy = "manager")
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @ManyToMany
  @JoinTable(name = "employee_projects", joinColumns = @JoinColumn(name = "employee_id"),
  inverseJoinColumns = @JoinColumn(name = "project_id"))
  public Set<Project> getProjects() {
    return projects;
  }

  public void setProjects(Set<Project> projects) {
    this.projects = projects;
  }

  @ManyToOne
  public Department getWorkingDepartment() {
    return workingDepartment;
  }

  public void setWorkingDepartment(Department workingDepartment) {
    this.workingDepartment = workingDepartment;
  }

  @OneToOne(mappedBy = "leader")
  public Project getLeadingProject() {
    return leadingProject;
  }

  public void setLeadingProject(Project leadingProject) {
    this.leadingProject = leadingProject;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Employee() {
  }

  public Employee(Integer id, String firstName, String lastName, String gender, Double salary) {
    this._id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.salary = salary;
  }
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Integer get_id() {
    return _id;
  }

  public void set_id(Integer _id) {
    this._id = _id;
  }

}