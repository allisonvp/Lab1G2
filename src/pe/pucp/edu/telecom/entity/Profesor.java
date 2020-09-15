package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

public class Profesor extends Docente {
    private String facultad;

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
