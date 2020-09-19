DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(512) DEFAULT NULL,
  apellido_paterno VARCHAR(512) DEFAULT NULL,
  apellido_materno VARCHAR(512) DEFAULT NULL,
  fecha_nacimiento DATE,
  ingresos DECIMAL(13,2) DEFAULT NULL,
  codigo_postal VARCHAR(5) DEFAULT NULL
);

INSERT INTO employee (nombre, apellido_paterno, apellido_materno, fecha_nacimiento,ingresos,codigo_postal) VALUES
  ('Angel', 'Camacho', 'Campos', '1994-04-28', 38000,'11420'),
 ('Angel II', 'Camacho', 'Campos', '1994-04-28', 58000,'07400');

 INSERT INTO employee (nombre, apellido_paterno, fecha_nacimiento,codigo_postal) VALUES
  ('Angel III', 'Camacho', '1994-04-28','11420'),
 ('Angel IV', 'Camacho', '1994-04-28','07400');