package Logica;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    //JUAN DAVID
    String nombre;
    String especialidad;

    ArrayList<Doctor> listaDoctores;
    Scanner scanner = new Scanner(System.in);
    int unoDos = 0;

    public Doctor(){
    }

    public Doctor(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public ArrayList<Doctor> getListaPacientes() {
        return listaDoctores;
    }
    public void setListaPacientes(ArrayList<Doctor> listaPacientes) {
        this.listaDoctores = listaPacientes;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

}
