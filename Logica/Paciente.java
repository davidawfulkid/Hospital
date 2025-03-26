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


    public Paciente(String nombre, int edad, int numIdentidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.numIdentidad = numIdentidad;
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

    
}
