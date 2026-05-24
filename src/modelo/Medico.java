package modelo;

public class Medico extends Empleado {
    private String especialidad;
    private int numeroPacientesAtendidos;
    private double valorConsulta;

    public Medico(String cedula, String nombre, int edad, String telefono, String correo, double valorConsulta, int numeroPacientesAtendidos, String especialidad) {
        super(cedula, nombre, edad, telefono, correo);
        setValorConsulta(valorConsulta);
        setNumeroPacientesAtendidos(numeroPacientesAtendidos);
        setEspecialidad(especialidad);
    }


    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo: Médico");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Pacientes atendidos: " + numeroPacientesAtendidos);
        System.out.println("Valor consulta: " + valorConsulta);
        System.out.println("Pago: " + calcularPago());
    }
    @Override
    public double calcularPago(){
        return numeroPacientesAtendidos* valorConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroPacientesAtendidos() {
        return numeroPacientesAtendidos;
    }

    public void setNumeroPacientesAtendidos(int numeroPacientesAtendidos) {
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
