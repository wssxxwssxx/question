package com.example.question.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jdk.jfr.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

import javax.annotation.Generated;
import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "t_form")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    private Long id;

    @Size(min = 2)
    @NotBlank
    @Column(name = "name",
            nullable = true)
    private String name;

    @NotNull
    @CreationTimestamp
    @Column(name = "data",
            nullable = true,
            columnDefinition = "bool default true")
    private Date data;

    public Form() {
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

    public Date getData() {
        return data;
    }

}
