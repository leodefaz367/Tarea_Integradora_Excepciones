Sistema de Gestión de Empleados Hospitalarios
Descripción
Este proyecto fue desarrollado en Java utilizando Programación Orientada a Objetos (POO).
El sistema permite administrar empleados hospitalarios mediante un CRUD completo:
Registrar empleados
Buscar empleados
Mostrar empleados
Actualizar información
Eliminar empleados

Herencia:  Se utilizó herencia mediante una clase abstracta Empleado, de la cual heredan médico y administrativo
Esto permitió reutilizar atributos y métodos comunes.

Encapsulamiento: Los atributos fueron declarados como private para proteger la información 
Dando acceso y la capacidad de modificar datos mediante getters y setters.
Polimorfismo: El sistema almacena diferentes tipos de empleados dentro de un mismo ArrayList<Empleado> 
lo que permite manejar médicos y personal administrativo de forma general. además con la herencia cada clase decidecomo quiere que se comporten los métodos como calcular

Excepciones: Se utilizaron excepciones para controlar errores durante la ejecución, también se implemento una excepción personalizada que es DatoInvalidoException
Conversiones: Se realizaron conversiones de texto a números utilizando:
Integer.parseInt() & Double.parseDouble()

Validaciones: El sistema valida campos vacíos, edad inválida, valores negativos, cédulas duplicadas, correos inválidos
Todo esto se realiza mediante la clase Validador
