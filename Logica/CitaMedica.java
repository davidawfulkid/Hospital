//JUAN DAVID

package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class CitaMedica {
    private String diagnostico;
    private String fechaCita;

    ArrayList<CitaMedica> listaCitas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int unoDos;

    public CitaMedica() {    
    }

    public CitaMedica(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }


    public void registrarDiagnostico() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("Presione 1 para añadir diagnóstico");
            System.out.println("Presione 2 para salir");
            unoDos = scanner.nextInt();
            scanner.nextLine();
            switch (unoDos) {

                case 1:
                    System.out.println("Describa su diagnóstico:");
                    String diagnostico = scanner.nextLine();
            
                    CitaMedica c = new CitaMedica(diagnostico);
                    listaCitas.add(c);
            
                    System.out.println("\nDiagnóstico registrado\n");
                    break;
                
                case 2:
                    condicion = false;
                    System.out.println("\n=============================");
                    System.out.println("= El programa se ha cerrado =");
                    System.out.println("=============================");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }

    public void mostrarDiagnostico() {
        System.out.println("-------------------------");
        System.out.println("- Lista de diagnósticos -");
        System.out.println("-------------------------\n");
        
        int totalDiagnosticos = listaCitas.size(); // Obtener el total de diagnósticos
        if (listaCitas.size() == 0) {
            System.out.println("No hay diagnósticos registrados.\n");
        } else {
            int contador = 1; // Contador para numerar los diagnósticos
            for (CitaMedica c : listaCitas) {
                System.out.println(contador + ". Diagnóstico: " + c.getDiagnostico());
                contador++;
            }
            System.out.println("\nTotal de diagnósticos registrados: " + totalDiagnosticos);
        }
    }
}