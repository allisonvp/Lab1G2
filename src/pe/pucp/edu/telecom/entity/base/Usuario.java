package pe.pucp.edu.telecom.entity.base;

import com.sun.deploy.net.MessageHeader;
import pe.pucp.edu.telecom.entity.PersonalAdmin;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private int codigo;
    private String nombre;
    private String apellido;
    private int telefono;
    private int anexo;
    private String departamento;
    private Docente docente;
    private PersonalAdmin personalAdmin;

    public static Usuario datosUsuario() {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.print("Ingrese código PUCP: ");
        usuario.setCodigo(Integer.valueOf(sc.nextLine()));
        System.out.print("Ingrese nombre: ");
        usuario.setNombre(sc.nextLine());
        System.out.print("Ingrese apellido: ");
        usuario.setApellido(sc.nextLine());
        System.out.print("Ingrese teléfono: ");
        usuario.setTelefono(Integer.valueOf(sc.nextLine()));
        System.out.print("Ingrese anexo: ");
        usuario.setAnexo(Integer.valueOf(sc.nextLine()));

        while (true) {
            System.out.print("Ingrese departamento: ");
            String rpta = sc.nextLine();
            if (rpta.equals("ING") || rpta.equals("CIE") || rpta.equals("LET")) {
                usuario.setDepartamento(rpta);
                break;
            } else {
                System.out.println("Coloque un departamento válido");
            }
        }

        while (true) {
            System.out.print("¿Es docente o personal administrativo?: ");
            String rpta = sc.nextLine();
            if (rpta.equalsIgnoreCase("docente")) {
                Docente docente = Docente.datosDocente();
                usuario.setDocente(docente);
                break;
            } else if (rpta.equalsIgnoreCase("personal administrativo")) {
                PersonalAdmin personalAdmin = PersonalAdmin.datosPersonalAdmin();
                usuario.setPersonalAdmin(personalAdmin);
                break;
            } else {
                System.out.println("Ingrese una opción válida");
            }
        }


        return usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnexo() {
        return anexo;
    }

    public void setAnexo(int anexo) {
        this.anexo = anexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public PersonalAdmin getPersonalAdmin() {
        return personalAdmin;
    }

    public void setPersonalAdmin(PersonalAdmin personalAdmin) {
        this.personalAdmin = personalAdmin;
    }
}
