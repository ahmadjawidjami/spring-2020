package hu.cs.se.adjava.projectmanagement.dto;

import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.model.Employee;

import java.util.Set;

public class ProjectDTO {

    private Integer id;
    private String name;
    private String location;
    private String startDate;

    private Integer departmentId;

    private Integer leader_Id;

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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getLeader_Id() {
        return leader_Id;
    }

    public void setLeader_Id(Integer leader_Id) {
        this.leader_Id = leader_Id;
    }
}
