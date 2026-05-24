package modelo;

import util.Validador;

import javax.xml.validation.Validator;

public abstract class Empleado {
    private String cedula;
    private String nombre;
    private int edad;
    private String telefono;
    private String correo;

    public Empleado(String cedula, String nombre, int edad, String telefono, String correo) throws Exception{
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

    public void setCedula(String cedula) throws Exception{
        Validador.validarTexto(cedula);
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        Validador.validarTexto(nombre);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        Validador.validarEdad(edad);
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws Exception{
        Validador.validarTexto(telefono);

        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        Validador.validarCorreo(correo);

        this.correo = correo;
    }
}
