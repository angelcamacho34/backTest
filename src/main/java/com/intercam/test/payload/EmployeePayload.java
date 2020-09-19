package com.intercam.test.payload;

import lombok.Data;
import java.math.BigDecimal;
import java.sql.Date;

@Data
public class EmployeePayload {
    private Integer id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private BigDecimal ingresos;
    private String codigoPostal;
}
