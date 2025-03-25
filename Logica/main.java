package Logica;

public class main {

    public static void main(String[] args) {
    //    Doctor doctor = new Doctor();
    //    doctor.agregarDoctor();
    //    doctor.mostrarDoctores();

        CitaMedica c = new CitaMedica(null);
        c.registrarDiagnostico();
        c.mostrarDiagnostico();
    }
}