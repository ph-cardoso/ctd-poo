package aula16;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    try {
            Paciente paciente = new Paciente("Juan","Perez","12345", LocalDate.of(2021,11,30));

            paciente.darAlta(LocalDate.of(2021,10,21));
        } catch (PacienteException e) {
            System.err.println(e.getMessage());
        }
    }
}