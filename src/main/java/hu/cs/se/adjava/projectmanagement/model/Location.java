package hu.cs.se.adjava.projectmanagement.model;


import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class Location implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
