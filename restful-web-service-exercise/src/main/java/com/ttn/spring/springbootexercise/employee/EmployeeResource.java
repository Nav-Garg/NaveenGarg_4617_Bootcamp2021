package com.ttn.spring.springbootexercise.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeDaoService service;

    @GetMapping("/employees")
    public List<Employee> retrieveAllUser(){
        return service.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable int id){
        Employee emp = service.findOne(id);
        if (emp == null)
            throw new EmployeeNotFoundException("id-" + id);
        return emp;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid  @RequestBody Employee employee){
        Employee savedEmployee = service.save(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        Employee emp = service.deleteById(id);
        if (emp == null)
            throw new EmployeeNotFoundException("id-" + id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee emp, @PathVariable int id){
        service.updateEmployee(id, emp);
    }
}
