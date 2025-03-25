package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    //SANTIAGO TRUJILLO
    private ArrayList<Doctor> listaDoctores = new ArrayList<>();
    private ArrayList<Paciente> listaPacientes  = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    
    public Hospital() {
    }

    public Hospital(ArrayList<Doctor> listaDoctores, ArrayList<Paciente> listaPacientes) {
        this.listaDoctores = listaDoctores;
        this.listaPacientes = listaPacientes;
    }

    public ArrayList<Doctor> getListaDoctores() {
        return listaDoctores;
    }



    public void setListaDoctores(ArrayList<Doctor> listaDoctores) {
        this.listaDoctores = listaDoctores;
    }



    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }



    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }



    public Scanner getScanner() {
        return scanner;
    }



    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }


    public Paciente buscarPacientePorCedula(int cedula) {
        for (Paciente p : listaPacientes) {
            if (p.getNumIdentidad() == cedula) {
                return p;
            }
        }
        return null;
    }


    public void registrarDoctores() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("Ingrese 1 para agregar los datos del doctor");
            System.out.println("Ingrese 0, para salir");
            int numIngresado = scanner.nextInt();
            scanner.nextLine();
            switch (numIngresado) {
                case 1:
                    System.out.println("\ningrese el nombre del doctor: ");
                    String nombre = scanner.nextLine();

                    System.out.println("\ningrese la especialidad del doctor: ");
                    String especialidad= scanner.nextLine();

                    Doctor nuevoDoctor = new Doctor(nombre, especialidad);
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
            System.out.println("Ingrese 0, para salir");
            int numIngresado = scanner.nextInt();
            scanner.nextLine();
            switch (numIngresado) {
                case 1:
                    System.out.println("\ningrese el nombre del paciente: ");
                    String nombre = scanner.nextLine();

                    System.out.println("\ningrese la edad del paciente: ");
                    int edad = scanner.nextInt();

                    System.out.println("\ningrese la cedula del paciente: ");
                    int numIdentidad = scanner.nextInt();

                    Paciente nuevoPaciente = new Paciente(nombre, edad, numIdentidad, new ArrayList<>());
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
