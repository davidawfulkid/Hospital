package Logica;

public class main {

    public static void main(String[] args) {
    //    Doctor doctor = new Doctor();
    //    doctor.agregarDoctor();
    //    doctor.mostrarDoctores();

        // CitaMedica c = new CitaMedica(null);
        // c.registrarDiagnostico();
        // c.mostrarDiagnostico();


        Hospital nuevoDoctor = new Hospital();
        nuevoDoctor.registrarDoctores();

        Hospital nuevoPaciente = new Hospital();
        nuevoPaciente.registrarPaciente();

        Paciente paciente2 = new Paciente();
        paciente2.agendarCita();
        paciente2.mostrarCitas();

        CitaMedica cita1 = new CitaMedica();
        cita1.registrarDiagnostico();
        cita1.mostrarDiagnostico();

    }
}