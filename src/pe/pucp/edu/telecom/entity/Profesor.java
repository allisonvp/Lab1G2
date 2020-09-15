package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

import java.util.Scanner;

public class Profesor extends Docente {
    private String facultad;

    public static Profesor datosProfesor() {
        Scanner sc = new Scanner(System.in);
        Profesor profesor = new Profesor();

        System.out.print("Ingrese facultad en la que dicta: ");
        profesor.setFacultad(sc.nextLine());

        return profesor;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
