package com.java1234.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_student")
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

