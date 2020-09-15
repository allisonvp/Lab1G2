package pe.pucp.edu.telecom.entity.base;

import java.util.Scanner;

public class Usuario {
    private int codigo;
    private String nombre;
    private String apellido;
    private int telefono;
    private int anexo;
    private String departamento;

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
}
