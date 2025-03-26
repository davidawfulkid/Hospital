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

    public void mostrarDoctores() {
        System.out.println("lista de doctores:");
        for (Doctor d : listaDoctores) {
            System.out.println("\nnombre: " + d.getNombre() + "\nespecialidad: " + d.getEspecialidad());
            System.out.println("______________________________");
        }
    }

    public void registrarPacientes() {
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
                    scanner.nextLine();

                    System.out.println("\ningrese la cedula del paciente: ");
                    int numIdentidad = scanner.nextInt();
                    scanner.nextLine();

                    Paciente nuevoPaciente = new Paciente(nombre, edad, numIdentidad);
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

    public void mostrarPacientes() {
        System.out.println("lista de pacientes:");
        for (Paciente p : listaPacientes) {
            System.out.println("\nnombre: " + p.getNombre() + "\nedad: " + p.getEdad() + "\nnumero de identidad: " + p.getNumIdentidad());
            System.out.println("______________________________");
        }
    }

    public void mostrarCitas() {
        System.out.println("Ingrese la cédula del paciente para ver sus citas:");
        int ceduIngresada = scanner.nextInt();
        scanner.nextLine();
        for (Paciente p : listaPacientes) {
            if (ceduIngresada == p.getNumIdentidad()) {
                ArrayList<CitaMedica> listaCitas = p.getListaCitas();
                if (listaCitas.isEmpty()) {
                    System.out.println("El paciente con cédula: " + ceduIngresada + " no tiene citas agendadas.");
                } else {
                    System.out.println("Citas del paciente " + p.getNombre() + ":");
                    for (CitaMedica c : listaCitas) {
                        System.out.println("Fecha de la cita: " + c.getFechaCita());
                    }
                }
                return;
            }
        }

        System.out.println("No se encontró ningún paciente con la cédula " + ceduIngresada + ".");
    }

}
