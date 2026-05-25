package app;

import excepciones.DatoInvalidoException;
import modelo.Administrativo;
import modelo.Medico;
import servicio.EmpleadoServicio;
import util.Validador;

import java.net.SocketTimeoutException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmpleadoServicio servicio = new EmpleadoServicio();

        int opcion;
        do {
            System.out.println("======= MENÚ ========");
            System.out.println("1. Registrar medico");
            System.out.println("2. Registrar personal administrativo");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Buscar por cedula");
            System.out.println("5. Actualizar empleado");
            System.out.println("6. Eliminar empleados");
            System.out.println("7. Mostrar estadísticas");
            System.out.println("8. Salir");

            opcion=Integer.parseInt(sc.nextLine());

            try{
                switch (opcion){
                    case 1:
                        System.out.println("Cedula: ");
                        String cedulaM=sc.nextLine();
                        System.out.println("Nombre: ");
                        String nombreM=sc.nextLine();
                        System.out.println("Edad: ");
                        int edadM=Integer.parseInt(sc.nextLine());
                        System.out.println("Telefono: ");
                        String telefonoM = sc.nextLine();
                        System.out.println("Correo: ");
                        String correoM= sc.nextLine();
                        System.out.println("Especialidad: ");
                        String especialidad =sc.nextLine();
                        System.out.println("Pacientes atentidos: ");
                        int pacientesAtendidos=Integer.parseInt(sc.nextLine());
                        System.out.println("Valor consulta: ");
                        double valorConsulta = Double.parseDouble(sc.nextLine());

                        Medico medico = new Medico(
                                cedulaM, nombreM, edadM, telefonoM, correoM, valorConsulta,pacientesAtendidos,especialidad
                        );
                        String resultadoR = servicio.registrarEmpleado(medico);

                        System.out.println(resultadoR);
                        break;
                    case 2:
                        System.out.println("Cédula: ");
                        String cedulaA = sc.nextLine();
                        System.out.println("Nombre: ");
                        String nombreA = sc.nextLine();
                        System.out.println("Edad: ");
                        int edadA = Integer.parseInt(sc.nextLine());
                        System.out.println("Teléfono: ");
                        String telefonoA = sc.nextLine();
                        System.out.println("Correo: ");
                        String correoA = sc.nextLine();
                        System.out.println("Departamento: ");
                        String departamento = sc.nextLine();
                        System.out.println("Horas Trabajadas: ");
                        int horas=Integer.parseInt(sc.nextLine());
                        System.out.println("Valor por hora: ");
                        double valor = Double.parseDouble(sc.nextLine());

                        Administrativo admin = new Administrativo(cedulaA, nombreA, edadA, telefonoA, correoA, horas, departamento, valor);

                        String resultadoRA=servicio.registrarEmpleado(admin);
                        System.out.println(resultadoRA);
                        break;
                    case 3:
                        servicio.mostrarEmpleados();
                        break;
                    case 4:
                        System.out.println("========BUSCADOR========");
                        System.out.println("Ingrese la cedula: ");
                        String cedulaBuscar = sc.nextLine();
                        if (servicio.buscador(cedulaBuscar)!=null){
                            servicio.buscador(cedulaBuscar).mostrarInformacion();
                        }else {
                            System.out.println("Empleado no encontrado");
                        }
                        break;
                    case 5:
                        System.out.println("========ACTUALIZAR========");
                        System.out.println("Cedula del empleado:");
                        String cedulaActualizar = sc.nextLine();
                        System.out.println("Nuevo nombre:");
                        String nuevoNombre = sc.nextLine();
                        System.out.println("Nueva edad:");
                        int nuevaEdad = Integer.parseInt(sc.nextLine());
                        System.out.println("Nuevo telefono:");
                        String nuevoTelefono = sc.nextLine();
                        System.out.println("Nuevo correo:");
                        String nuevoCorreo = sc.nextLine();
                        System.out.println(
                                servicio.actualizarEmpleado(cedulaActualizar, nuevoNombre, nuevaEdad, nuevoTelefono, nuevoCorreo)
                        );
                        break;
                    case 6:
                        System.out.println("Ingrese la cedula: ");
                        String cedulaEliminar = sc.nextLine();
                        String resultado = servicio.eliminarEmpleado(cedulaEliminar);
                        System.out.println(resultado);

                        break;
                    case 7:
                        servicio.mostrarEstadisticas();;
                        break;
                    case 8:
                        System.out.println("Cerrando...");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }catch(NumberFormatException e){
                System.out.println("Error... igrese numeros validos");
            }catch (DatoInvalidoException e){
                System.out.println("Error... "+ e.getMessage());
            }

        }while (opcion!=7);
    }
}