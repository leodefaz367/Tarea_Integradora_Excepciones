package modelo;

import excepciones.DatoInvalidoException;
import util.Validador;

import javax.xml.validation.Validator;

public abstract class Empleado {
    private String cedula;
    private String nombre;
    private int edad;
    private String telefono;
    private String correo;

    public Empleado(String cedula, String nombre, int edad, String telefono, String correo) throws DatoInvalidoException{
        setCedula(cedula);
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
        setCorreo(correo);

    }

    public void mostrarInformacion(){
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }
    public abstract double calcularPago();

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws DatoInvalidoException {
        Validador.validarTexto(cedula);
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws DatoInvalidoException{
        Validador.validarTexto(nombre);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoInvalidoException{
        Validador.validarEdad(edad);
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws DatoInvalidoException{
        Validador.validarTexto(telefono);

        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws DatoInvalidoException {
        Validador.validarCorreo(correo);

        this.correo = correo;
    }
}
