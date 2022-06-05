DROP TABLE IF EXISTS asistencia CASCADE;
DROP TABLE IF EXISTS beneficiario CASCADE;
DROP TABLE IF EXISTS charla CASCADE;
DROP TABLE IF EXISTS fundacion CASCADE;
DROP TABLE IF EXISTS organismo CASCADE;
DROP TABLE IF EXISTS responsable CASCADE;
DROP TABLE IF EXISTS servicio CASCADE;
DROP TABLE IF EXISTS servicio_fundacion CASCADE;
DROP TABLE IF EXISTS solicitud CASCADE;
DROP TABLE IF EXISTS solicitud_servicio CASCADE;

CREATE TABLE asistencia (
	charla_codigo character varying(4) NOT NULL,
	beneficiario_cedula character varying(8) NOT NULL
);

CREATE TABLE beneficiario (
	beneficiario_cedula character varying(8) NOT NULL,
	nombre text NOT NULL,
	apellido text NOT NULL,
	telefono character varying(11) NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (beneficiario_cedula)
);

CREATE TABLE charla (
	charla_codigo character varying(4) NOT NULL,
	organismo_rif character varying(10) NOT NULL,
	tema text NOT NULL,
	fecha date NOT NULL,
	hora time(6) without time zone NOT NULL,
	lugar text NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (charla_codigo)
);

CREATE TABLE fundacion (
	fundacion_codigo character varying(2) NOT NULL,
	nombre text NOT NULL,
	presupuesto double precision NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (fundacion_codigo)
);

CREATE TABLE organismo (
	organismo_rif character varying(10) NOT NULL,
	direccion text NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (organismo_rif)
);

CREATE TABLE responsable (
	responsable_cedula character varying(8) NOT NULL,
	nombre text NOT NULL,
	apellido text NOT NULL,
	fundacion_codigo character varying(2) NOT NULL,
	telefono character varying(11) NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (responsable_cedula)
);

CREATE TABLE servicio (
	servicio_codigo character varying(4) NOT NULL,
	nombre text NOT NULL,
	costo double precision NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (servicio_codigo)
);

CREATE TABLE servicio_fundacion (
	servicio_codigo character varying(4) NOT NULL,
	fundacion_codigo character varying(2) NOT NULL
);

CREATE TABLE solicitud (
	solicitud_codigo character varying(5) NOT NULL,
	responsable_cedula character varying(8) NOT NULL,
	beneficiario_cedula character varying(8) NOT NULL,
	fundacion_codigo character varying(2) NOT NULL,
	prioridad character varying(5) NOT NULL,
	fecha_creacion date NOT NULL,
	fecha_aprobacion date NOT NULL,
	estado character NOT NULL,
	estatus character NOT NULL,
	PRIMARY KEY (solicitud_codigo)
);

CREATE TABLE solicitud_servicio (
	solicitud_codigo character varying(5) NOT NULL,
	servicio_codigo character varying(4) NOT NULL,
	costo_total double precision NOT NULL
);

INSERT INTO asistencia VALUES
('C001', '13333333');

INSERT INTO beneficiario VALUES
('11111111', 'Mario', 'Torres', '04121234567', 'A'),
('12222222', 'Álvaro', 'Martínez', '04122345678', 'A'),
('13333333', 'José', 'Gonzales', '04123456789', 'A');

INSERT INTO charla VALUES
('C001', 'J111111115', 'Conciencia ambiental', '2022-08-15', '16:00:00', 'Oficinas', 'A'),
('C002', 'J222222225', 'Servicio social', '2022-04-24', '15:00:00', 'Taller', 'A'),
('C003', 'J333333335', 'Asistencia sanitaria', '2022-09-01', '17:00:00', 'Gobernacion', 'A');

INSERT INTO fundacion VALUES
('F1', 'Fundacion de ayuda para niños, niñas y adolescentes', 5000, 'A'),
('F2', 'Fundacion de atención al discapacitado', 3000, 'A'),
('F3', 'Fundacion regional de la mujer', 2000, 'A');

INSERT INTO organismo VALUES
('J111111115', 'Calle A', 'A'),
('J222222225', 'Calle B', 'A'),
('J333333335', 'Calle C', 'A');

INSERT INTO responsable VALUES
('21111111', 'David', 'Reyes', 'F1', '04242354568', 'A'),
('22222222', 'Maria', 'López', 'F2', '04242354568', 'A'),
('23333333', 'Luis', 'García', 'F3', '04242354568', 'A');

INSERT INTO servicio VALUES
('S001', 'Consulta médica general', 40, 'A'),
('S002', 'Consulta psicológica', 30, 'A'),
('S003', 'Consulta odontológica', 20, 'A'),
('S004', 'Examen Rx', 50, 'A'),
('S005', 'Implementos para discapacitados', 70, 'A'),
('S006', 'Cesta de comida', 35, 'A'),
('S007', 'Tanques de agua', 25, 'A');

INSERT INTO servicio_fundacion VALUES
('S001', 'F1'),
('S002', 'F1'),
('S003', 'F1'),
('S004', 'F1'),
('S005', 'F1'),
('S006', 'F1'),
('S007', 'F1'),
('S001', 'F2'),
('S002', 'F2'),
('S003', 'F2'),
('S004', 'F2'),
('S005', 'F2'),
('S006', 'F2'),
('S007', 'F2'),
('S001', 'F3'),
('S002', 'F3'),
('S003', 'F3'),
('S004', 'F3'),
('S005', 'F3'),
('S006', 'F3'),
('S007', 'F3');

INSERT INTO solicitud VALUES
('SF101', '21111111', '13333333', 'F1', 'Alta', '2022-03-25', '2022-03-30', 'A', 'A'),
('SF201', '22222222', '11111111', 'F2', 'Media', '2022-04-01', '2022-04-10', 'A', 'A'),
('SF301', '23333333', '12222222', 'F3', 'Baja', '2022-04-03', '2022-04-05', 'N', 'A');

INSERT INTO solicitud_servicio VALUES
('SF101', 'S002', 125),
('SF101', 'S005', 125),
('SF101', 'S007', 125),
('SF201', 'S004', 70),
('SF201', 'S003', 70),
('SF301', 'S006', 35);

CREATE INDEX ON asistencia USING btree (charla_codigo);

CREATE INDEX ON servicio_fundacion USING btree (fundacion_codigo);

CREATE INDEX ON solicitud_servicio USING btree (servicio_codigo);

CREATE INDEX ON solicitud_servicio USING btree (solicitud_codigo);

CREATE INDEX ON solicitud USING btree (responsable_cedula);

CREATE INDEX ON responsable USING btree (fundacion_codigo);

CREATE INDEX ON servicio_fundacion USING btree (servicio_codigo);

CREATE INDEX ON solicitud USING btree (beneficiario_cedula);

CREATE INDEX ON solicitud USING btree (fundacion_codigo);

CREATE INDEX ON asistencia USING btree (beneficiario_cedula);

ALTER TABLE ONLY asistencia
	ADD CONSTRAINT asistencia_beneficiario_fk FOREIGN KEY (beneficiario_cedula) REFERENCES beneficiario(beneficiario_cedula) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY asistencia
	ADD CONSTRAINT asistencia_charla_fk FOREIGN KEY (charla_codigo) REFERENCES charla(charla_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY servicio_fundacion
	ADD CONSTRAINT servicio_fundacion_fundacion_fk FOREIGN KEY (fundacion_codigo) REFERENCES fundacion(fundacion_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY solicitud_servicio
	ADD CONSTRAINT solicitud_servicio_servicio_fk FOREIGN KEY (servicio_codigo) REFERENCES servicio(servicio_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY solicitud_servicio
	ADD CONSTRAINT solicitud_servicio_solicitud_fk FOREIGN KEY (solicitud_codigo) REFERENCES solicitud(solicitud_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY responsable
	ADD CONSTRAINT responsable_fundacion_fk FOREIGN KEY (fundacion_codigo) REFERENCES fundacion(fundacion_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY servicio_fundacion
	ADD CONSTRAINT servicio_fundacion_servicio_fk FOREIGN KEY (servicio_codigo) REFERENCES servicio(servicio_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY solicitud
	ADD CONSTRAINT solicitud_beneficiario_fk FOREIGN KEY (beneficiario_cedula) REFERENCES beneficiario(beneficiario_cedula) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY solicitud
	ADD CONSTRAINT solicitud_fundacion_fk FOREIGN KEY (fundacion_codigo) REFERENCES fundacion(fundacion_codigo) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;

ALTER TABLE ONLY solicitud
	ADD CONSTRAINT solicitud_responsable_fk FOREIGN KEY (responsable_cedula) REFERENCES responsable(responsable_cedula) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;