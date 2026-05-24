package modelo;

import excepciones.DatoInvalidoException;
import util.Validador;

public class Administrativo extends Empleado {
    private String departamento;
    private int horasTrabajadas;
    private double valorHora;

    public Administrativo(String cedula, String nombre, int edad, String telefono, String correo, int horasTrabajadas, String departamento, double valorHora) throws DatoInvalidoException{
        super(cedula, nombre, edad, telefono, correo);
        setHorasTrabajadas(horasTrabajadas);
        setDepartamento(departamento);
        setValorHora(valorHora);
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Tipo: Administrativo");
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Pago: " + calcularPago());
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) throws DatoInvalidoException {
        Validador.validarTexto(departamento);

        this.departamento = departamento;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) throws DatoInvalidoException{
        Validador.validarNumeroPositivo(horasTrabajadas);

        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) throws DatoInvalidoException{
        Validador.validarNumeroPositivo(valorHora);

        this.valorHora = valorHora;
    }
}
