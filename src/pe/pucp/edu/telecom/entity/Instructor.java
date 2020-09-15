package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

public class Instructor extends Docente {
    public int getCicloDictadoActual() {
        return cicloDictadoActual;
    }

    public void setCicloDictadoActual(int cicloDictadoActual) {
        this.cicloDictadoActual = cicloDictadoActual;
    }

    private int cicloDictadoActual;
}
