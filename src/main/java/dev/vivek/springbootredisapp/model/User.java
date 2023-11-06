package dev.vivek.springbootredisapp.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private Long salary;

    public User(String id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
