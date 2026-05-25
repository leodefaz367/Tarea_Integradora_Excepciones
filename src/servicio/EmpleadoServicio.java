package servicio;

import modelo.Empleado;
import java.util.ArrayList;
import excepciones.DatoInvalidoException;

public class EmpleadoServicio {

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public String registrarEmpleado(Empleado empleado) {
        if(buscador(empleado.getCedula())!= null){
            return "La cedula ya esta regstrada";
        }

        empleados.add(empleado);
        return "Empleado registrado correctamente";
    }


    public void mostrarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("No existen empleados registrados");
            return;
        }
        for (Empleado e: empleados){
            System.out.println("---------------");
            e.mostrarInformacion();
        }
    }

    public Empleado buscador(String cedula){
        for (Empleado e: empleados){
            if (e.getCedula().equals(cedula)){
                return e;
            }
        }
        return null;
    }

    public String actualizarEmpleado(String cedula, String nombre, int edad, String telefono, String correo) throws DatoInvalidoException {
        Empleado empleado = buscador(cedula);
        if (empleado == null){
            return "Empleado no encontrado";
        }
        empleado.setNombre(nombre);
        empleado.setEdad(edad);
        empleado.setTelefono(telefono);
        empleado.setCorreo(correo);

        return "Empleado actualizado correctamente";
    }

    public String eliminarEmpleado(String cedula){
        Empleado empleado = buscador(cedula);
        if (empleado!=null){
            empleados.remove(empleado);
            return "Empleado eliminado";
        }else {
            return "Empleado no encontrado";
        }
    }

    public void mostrarEstadisticas(){
        int totalMedicos = 0;
        int totalAdministrativos = 0;
        double pagoMedicos = 0;
        double pagoAdministrativos = 0;

        for (Empleado e : empleados){
            if (e.getClass().getSimpleName().equals("Medico")){
                totalMedicos++;
                pagoMedicos += e.calcularPago();
            }else {
                totalAdministrativos++;
                pagoAdministrativos+= e.calcularPago();
            }
        }
        System.out.println("Total médicos: " + totalMedicos);
        System.out.println("Total personal administrativo: " + totalAdministrativos);
        System.out.println("Pago total médicos: " + pagoMedicos);
        System.out.println("Pago total personal administrativo: " + pagoAdministrativos);
    }

}