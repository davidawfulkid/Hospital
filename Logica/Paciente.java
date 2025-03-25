package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {
    //SANTIAGO TRUJILLO
    public String nombre;
    public int edad;
    public int numIdentidad;
    public ArrayList<CitaMedica> listaCitas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    

    public Paciente() {
    }


    public Paciente(String nombre, int edad, int numIdentidad, ArrayList<CitaMedica> listaCitas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numIdentidad = numIdentidad;
        this.listaCitas = listaCitas;
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public int getNumIdentidad() {
        return numIdentidad;
    }



    public void setNumIdentidad(int numIdentidad) {
        this.numIdentidad = numIdentidad;
    }



    public ArrayList<CitaMedica> getListaCitas() {
        return listaCitas;
    }



    public void setListaCitas(ArrayList<CitaMedica> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public void agendarCita() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("Ingrese 1 para empezar a agendar la cita");
            System.out.println("Ingrese 0 para salir");
            int numIngresado = scanner.nextInt();
            scanner.nextLine();
            switch (numIngresado) {
                case 1:
                    System.out.println("\nIngrese la fecha de la cita (formato día/mes/año): ");
                    String fechaCita = scanner.nextLine();
                    CitaMedica nuevaCita = new CitaMedica(fechaCita);
                    listaCitas.add(nuevaCita);
                    System.out.println("\nCita agendada correctamente.");
                break;
            case 0:
                System.out.println("\nsaliendo...");
                condicion = false;
                break;
            default:
                System.out.println("\nOpcion invalida");
            }
        
        }
    }

    public void mostrarCitas(Hospital hospital) {
        System.out.println("ingrese la cedula del paciente para ver sus citas agendadas: ");
        int ceduIngresada = scanner.nextInt();
        scanner.nextLine();

        Paciente paciente = hospital.buscarPacientePorCedula(ceduIngresada);
        if (paciente != null) {
            System.out.println("\nPaciente encontrado: " + paciente.getNombre() + " - Cédula: " + paciente.getNumIdentidad());

            if (paciente.getListaCitas().isEmpty()) {
                System.out.println("No tiene citas agendadas.");
            } else {
                System.out.println("\nCitas agendadas:");
                for (CitaMedica cita : paciente.getListaCitas()) {
                    System.out.println("Fecha: " + cita.getFecha());
                }
                System.out.println("Total de citas: " + paciente.getListaCitas().size());
            }
        } else {
            System.out.println("\nNo se encontró un paciente con esa cédula.");
        }
    }

}
