* create the table cliente
* password: root
```sql
create table cliente(
	cod_cliente serial,
	telefono varchar(9),
	nomb_empresa varchar(256),
	ruc varchar(11),
	direccion varchar(256),
	dni_representante varchar(8),
	nombre_representante varchar(256),
	apellido_representante varchar(256),
	correo varchar(64),
	primary key(cod_cliente)
);
```

# A tener en cuenta:

* usar camelCase para los atributos y metodos
* usar PascalCase para las clases
* Usar injeccion de dependencias por atributos
* las rutas de las apis seran ""
