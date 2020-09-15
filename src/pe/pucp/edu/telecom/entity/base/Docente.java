package pe.pucp.edu.telecom.entity.base;

import pe.pucp.edu.telecom.entity.Instructor;
import pe.pucp.edu.telecom.entity.JP;
import pe.pucp.edu.telecom.entity.Profesor;

import java.security.PrivateKey;
import java.util.Scanner;

public class Docente extends Usuario {
    private int añoInicioAct;
    private int cantCursos;
    private Instructor instructor;
    private JP jp;
    private Profesor profesor;


    public static Docente datosDocente() {
        Scanner sc = new Scanner(System.in);
        Docente docente = new Docente();

        System.out.print("Ingrese año de inicio de actividades: ");
        docente.setAñoInicioAct(Integer.valueOf(sc.nextLine()));
        System.out.print("Ingrese cantidad de cursos que dicta o supervisa: ");
        docente.setCantCursos(Integer.valueOf(sc.nextLine()));

        while (true) {
            System.out.print("¿Es Instructor, Jefe de Práctica o Profesor?: ");
            String rpta = sc.nextLine();
            if (rpta.equalsIgnoreCase("Instructor")) {
                Instructor instructor = Instructor.datosInstructor();
                docente.setInstructor(instructor);
                break;
            } else if (rpta.equalsIgnoreCase("Jefe de práctica")) {
                JP jp = JP.datosJP();
                docente.setJp(jp);
                break;
            } else if (rpta.equalsIgnoreCase("profesor")) {
                Profesor profesor = Profesor.datosProfesor();
                docente.setProfesor(profesor);
                break;
            } else {
                System.out.println("Ingrese una opción válida");
            }
        }

        return docente;
    }

    public int getAñoInicioAct() {
        return añoInicioAct;
    }

    public void setAñoInicioAct(int añoInicioAct) {
        this.añoInicioAct = añoInicioAct;
    }

    public int getCantCursos() {
        return cantCursos;
    }

    public void setCantCursos(int cantCursos) {
        this.cantCursos = cantCursos;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public JP getJp() {
        return jp;
    }

    public void setJp(JP jp) {
        this.jp = jp;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
