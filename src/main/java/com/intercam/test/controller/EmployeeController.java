package com.intercam.test.controller;

import com.intercam.test.entity.Employee;
import com.intercam.test.payload.EmployeePayload;
import com.intercam.test.payload.SuccessPayload;
import com.intercam.test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/intercam/employee")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping()
    public SuccessPayload save(@RequestBody EmployeePayload payload) throws ResponseStatusException {
        try {
            Employee employee = new Employee();
            employee.setNombre(payload.getNombre());
            employee.setApellidoPaterno(payload.getApellidoPaterno());
            employee.setApellidoMaterno(payload.getApellidoMaterno());
            employee.setFechaNacimiento(payload.getFechaNacimiento());
            employee.setIngresos(payload.getIngresos());
            employee.setCodigoPostal(payload.getCodigoPostal());
            repository.save(employee);
            SuccessPayload response = new SuccessPayload("success");
            response.setData(employee);
            return response;
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping()
    public SuccessPayload getAll() {
        List<Employee> list = (List<Employee>) repository.findAll();
        if (list.size() > 0) {
            SuccessPayload response = new SuccessPayload("success");
            response.setData(list);
            return response;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/{id}")
    public SuccessPayload getEmployee(@PathVariable("id") Integer id) {
        Employee employee = repository.findById(id.intValue());
        if (!Objects.isNull(employee)) {
            SuccessPayload response = new SuccessPayload("success");
            response.setData(employee);
            return response;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public SuccessPayload deleteEmployee(@PathVariable("id") Integer id) {
        try {
            repository.deleteById(id);
            SuccessPayload response = new SuccessPayload("success");
            response.setData("Deleted: " +id);
            return response;
        } catch (EmptyResultDataAccessException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{id}")
    public SuccessPayload updateEmployee(@RequestBody EmployeePayload payload,
                                   @PathVariable("id") Integer id) {
        try {
            Employee employee = repository.findById(id.intValue());
            employee.setNombre(payload.getNombre());
            employee.setApellidoPaterno(payload.getApellidoPaterno());
            employee.setApellidoMaterno(payload.getApellidoMaterno());
            employee.setFechaNacimiento(payload.getFechaNacimiento());
            employee.setIngresos(payload.getIngresos());
            employee.setCodigoPostal(payload.getCodigoPostal());
            repository.save(employee);
            SuccessPayload response = new SuccessPayload("success");
            response.setData(employee);
            return response;
        } catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

}

