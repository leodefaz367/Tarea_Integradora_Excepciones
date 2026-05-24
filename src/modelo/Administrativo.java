package modelo;

public class Administrativo extends Empleado {
    private String departamento;
    private int horasTrabajadas;
    private double valorHora;

    public Administrativo(String cedula, String nombre, int edad, String telefono, String correo, int horasTrabajadas, String departamento, double valorHora) {
        super(cedula, nombre, edad, telefono, correo);
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPago() {
        return 0;
    }

    @Override
    public void mostrarInformacion() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
