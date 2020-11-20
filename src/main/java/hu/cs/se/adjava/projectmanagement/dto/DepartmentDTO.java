package hu.cs.se.adjava.projectmanagement.dto;

import hu.cs.se.adjava.projectmanagement.model.Employee;

public class DepartmentDTO {

    private Integer id;
    private String name;
    private String location;

    private Integer manager_Id;

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

    public Integer getManager_Id() {
        return manager_Id;
    }

    public void setManager_Id(Integer manager_Id) {
        this.manager_Id = manager_Id;
    }
}
