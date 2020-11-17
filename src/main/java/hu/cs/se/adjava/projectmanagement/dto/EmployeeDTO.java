package hu.cs.se.adjava.projectmanagement.dto;

import java.util.List;

public class EmployeeDTO {

    private Integer _id;
    private String firstName;
    private String lastName;
    private String gender;
    private Double salary;

    private Integer workingDepartmentId;

    private Integer leadingProjectId;

    private Integer managingDepartmentId;

    private List<Integer> projectsIds;

    public List<Integer> getProjectsIds() {
        return projectsIds;
    }

    public void setProjectsIds(List<Integer> projectsIds) {
        this.projectsIds = projectsIds;
    }

    public Integer getManagingDepartmentId() {
        return managingDepartmentId;
    }

    public void setManagingDepartmentId(Integer managingDepartmentId) {
        this.managingDepartmentId = managingDepartmentId;
    }

    public Integer getLeadingProjectId() {
        return leadingProjectId;
    }

    public void setLeadingProjectId(Integer leadingProjectId) {
        this.leadingProjectId = leadingProjectId;
    }

    public Integer getWorkingDepartmentId() {
        return workingDepartmentId;
    }

    public void setWorkingDepartmentId(Integer workingDepartmentId) {
        this.workingDepartmentId = workingDepartmentId;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
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
}
