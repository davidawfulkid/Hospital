package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    //SANTIAGO TRUJILLO
    private ArrayList<Hospital> listaDoctores;
    private ArrayList<Hospital> listaPacientes;
    private Scanner scanner = new Scanner(System.in);
    
    public Hospital(ArrayList<Hospital> listaDoctores, ArrayList<Hospital> listaPacientes) {
        this.listaDoctores = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public ArrayList<Hospital> getListaDoctores() {
        return listaDoctores;
    }

    public void setListaDoctores(ArrayList<Hospital> listaDoctores) {
        this.listaDoctores = listaDoctores;
    }

    public ArrayList<Hospital> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Hospital> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public void registrarDoctores() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("Ingrese 1 para agregar los datos del doctor");
            System.out.println("Ingrese 0");
            int numIngresado = scanner.nextInt();
            scanner.nextInt();
            switch (numIngresado) {
                case 1:
                    System.out.println("\ningrese el nombre del doctor: ");
                    String nombre = scanner.nextLine();

                    System.out.println("\ningrese la especialidad del doctor: ");
                    String especialidad= scanner.nextLine();

                    Doctor nuevoDoctor = new Doctor();
                    listaDoctores.add(nuevoDoctor);
                    System.out.println("\nDOCTOR AGREGADO CORRECTAMENTE");
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

    public void registrarPaciente() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("Ingrese 1 para agregar los datos del paciente");
            System.out.println("Ingrese 0");
            int numIngresado = scanner.nextInt();
            scanner.nextInt();
            switch (numIngresado) {
                case 1:
                    System.out.println("\ningrese el nombre del paciente: ");
                    String nombrePaciente = scanner.nextLine();

                    System.out.println("\ningrese la edad del paciente: ");
                    String edadPaciente = scanner.nextLine();

                    System.out.println("\ningrese la cedula del paciente: ");
                    String cedulaPaciente = scanner.nextLine();

                    Paciente nuevoPaciente = new Paciente();
                    listaPacientes.add(nuevoPaciente);
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

}
