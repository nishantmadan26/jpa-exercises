package com.xebia.jpaexcercises._09_solve_error;

import javax.persistence.*;

@Entity
@Table(name = "second")
public class Second {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Second() {
    }

    public Second(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
