package com.ttn.spring.springbootexercise.employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel(description = "All details about the user.")
public class Employee {
    private Integer id;
    @NotNull
    @Size(min=2, max=30, message = "Name Should have atleast 2 letter")
    @ApiModelProperty(notes="Name Should have atleast 2 letter")
    private String name;

    @NotNull
    @Min(value = 20, message = "minimum age required 20 year")
    private Integer age;

    public Employee() {

    }

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
