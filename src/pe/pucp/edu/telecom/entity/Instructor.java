package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

import java.util.Scanner;

public class Instructor extends Docente {
    private int cicloDictadoActual;

    public static Instructor datosInstructor() {
        Scanner sc = new Scanner(System.in);
        Instructor instructor = new Instructor();

        System.out.print("Ingrese ciclo actual: ");
        instructor.setCicloDictadoActual(Integer.valueOf(sc.nextLine()));

        return instructor;
    }

    public int getCicloDictadoActual() {
        return cicloDictadoActual;
    }

    public void setCicloDictadoActual(int cicloDictadoActual) {
        this.cicloDictadoActual = cicloDictadoActual;
    }


}
