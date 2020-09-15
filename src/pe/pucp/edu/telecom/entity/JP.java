package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

import java.util.Scanner;

public class JP extends Docente {
    private int añoEgreso;

    public static JP datosJP() {
        Scanner sc = new Scanner(System.in);
        JP jp = new JP();

        System.out.print("Ingrese año de egreso: ");
        jp.setAñoEgreso(Integer.valueOf(sc.nextLine()));

        return jp;
    }

    public int getAñoEgreso() {
        return añoEgreso;
    }

    public void setAñoEgreso(int añoEgreso) {
        this.añoEgreso = añoEgreso;
    }


}
