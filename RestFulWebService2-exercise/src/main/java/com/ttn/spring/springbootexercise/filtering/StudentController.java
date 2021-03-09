package com.ttn.spring.springbootexercise.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student getAllStudents(){
        return new Student("Naveen", 24,"nk789456");
    }
    @GetMapping("/student-list")
    public MappingJacksonValue getAllStudentList(){
        List<Student> studList = Arrays.asList(new Student("mk56",26,"have244"),
                new Student("yk456",18,"bush123s") );

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("userName");
        FilterProvider filters = new SimpleFilterProvider().addFilter("StudentFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(studList);
        mapping.setFilters(filters);
        return mapping;
    }
}
