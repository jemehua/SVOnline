--SELECT 'DROP TABLE '||table_name||' CASCADE CONSTRAINTS;' FROM user_tables

INSERT INTO MENU (IDMENU, ESTADO, NOMBRE) VALUES ('1', 'A', 'Administración');
INSERT INTO MENU (IDMENU, ESTADO, NOMBRE) VALUES ('2', 'A', 'Operación');

--administracion
INSERT INTO ITEMMENU (IDITEMMENU, ESTADO, NOMBRE, URLXHTML, IDMENU) VALUES ('1', 'A', 'Usuario', 'contents/usuario.xhtml', '1');
INSERT INTO ITEMMENU (IDITEMMENU, ESTADO, NOMBRE, URLXHTML, IDMENU) VALUES ('2', 'A', 'Agencia', 'contents/agencia.xhtml', '1');

--opreaciones
INSERT INTO ITEMMENU (IDITEMMENU, ESTADO, NOMBRE, URLXHTML, IDMENU) VALUES ('3', 'A', 'Evaluación Inicial', 'contents/bienvenido.xhtml', '2');

--roles
INSERT INTO ROL (IDROL, ESTADO, NOMBRE) VALUES ('1', 'A', 'Administrador');

--administrador
INSERT INTO PERMISO (IDPERMISO, ESTADO, IDITEMMENU, IDROL) VALUES ('1', '1', '1', '1');
INSERT INTO PERMISO (IDPERMISO, ESTADO, IDITEMMENU, IDROL) VALUES ('2', '1', '2', '1');
INSERT INTO PERMISO (IDPERMISO, ESTADO, IDITEMMENU, IDROL) VALUES ('3', '1', '3', '1');

--usuario
INSERT INTO USUARIO (IDUSUARIO, APMATERNO, APPATERNO, ESTADO, NOMBRE, USUARIO, IDROL, CLAVE) VALUES ('1', 'Garcia', 'Pumallihua', 'A', 'Hever', 'admin', '1', 'admin');


