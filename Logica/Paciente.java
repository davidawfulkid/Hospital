package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {
    //SANTIAGO TRUJILLO
    private String nombre;
    private int edad;
    private int numIdentidad;
    private ArrayList<CitaMedica> listaCitas = new ArrayList<>();
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
                    System.out.println("\ningrese la fecha de la cita, usando el siguiente formato dia/mes/año: ");
                    String fechaCita = scanner.nextLine();

                    CitaMedica nuevaCitaMedica = new CitaMedica(fechaCita);
                    listaCitas.add(nuevaCitaMedica);
                    System.out.println("\nPACIENTE AGREGADO CORRECTAMENTE");
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

    public void mostrarCitas(){
        System.out.println("nombre del paciente: " + getNombre() + "cedula del paciente: " + getNumIdentidad());
        if (listaCitas.isEmpty()) {
            System.out.println("\nno hay citas registradas");
        } else {
            System.out.println("lista de pacientes con citas agendadas: ");
            for (CitaMedica e : listaCitas) {
                System.out.println("- Fecha: " + e.getFecha());
            }
            System.out.println("total de citas: " + listaCitas.size());
        }
        
    }


}
