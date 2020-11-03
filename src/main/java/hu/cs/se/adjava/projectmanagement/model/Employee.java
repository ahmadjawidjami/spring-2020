package hu.cs.se.adjava.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Employee
 */
@Entity
@Table(name = "employees")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer _id;
  private String firstName;
  private String lastName;
  private String gender;
  private Double salary;

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

  public Integer get_id() {
    return _id;
  }

  public void set_id(Integer _id) {
    this._id = _id;
  }

}