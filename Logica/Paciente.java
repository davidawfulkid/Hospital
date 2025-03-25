package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {
    //SANTIAGO TRUJILLO
    private String nombre;
    private int edad;
    private int numIdentidad;
    private ArrayList<Paciente> listaCitas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Paciente(String nombre, int edad, int numIdentidad, ArrayList<Paciente> listaCitas) {
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

    public ArrayList<Paciente> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(ArrayList<Paciente> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public void agendarCita() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("Ingrese 1 para empezar a agendar la cita");
            System.out.println("Ingrese 0 para salir");
            int numIngresado = scanner.nextInt();
            scanner.nextInt();
            switch (numIngresado) {
                case 1:
                    System.out.println("\ningrese el dia de la cita: ");
                    String diaCita = scanner.nextLine();

                    System.out.println("\ningrese el mes de la cita: ");
                    String mesCita = scanner.nextLine();

                    System.out.println("\ningrese el año de la cita: ");
                    String añoCita = scanner.nextLine();

                    CitaMedica nuevaCitaMedica = new CitaMedica();
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
        
        if (listaCitas.isEmpty()) {
            System.out.println("\nno hay citas registradas");
        } else {
            System.out.println("lista de pacientes con citas agendadas: ");
            for (Paciente e : listaCitas) {
                System.out.println("nombre: " + e.getNombre() + "cedula: " + e.getNumIdentidad() + "fecha cita: " + e.getListaCitas());
            }
        }
        
    }


}
