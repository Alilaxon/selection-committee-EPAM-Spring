package ru.alilax.spring.config.models;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Person {
    private int id;
   @NotEmpty(message = "name should not be empty")
    @Size(min = 2, max = 10,message = "Name should me between 2 and 30 characters")
    private String name;

   @NotEmpty
   @Email(message = "email must be valid")
    private String email;
    @Min(value = 1,message = "age must be greater when 0")
    private int age;

    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
