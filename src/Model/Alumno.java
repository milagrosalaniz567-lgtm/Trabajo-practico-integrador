package Model;

import java.time.LocalDate;

public class Alumno {

    private int id_Alumno = -1;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private boolean estado;

    public Alumno(int dni, String nombre, String apellido, LocalDate nacimiento, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.estado = estado;
    }

    public Alumno(int id_Alumno, int dni, String nombre, String apellido, LocalDate nacimiento, boolean estado) {
        this.id_Alumno = id_Alumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.estado = estado;
    }

    public Alumno() {
    }

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString1() {
        if (estado == true) {
            return "\n          " + nombre + " " + apellido + "\nFecNac: " + nacimiento + "  DNI: " + dni + "   ID: " + id_Alumno + "   ACTIVO";
        } else {
            return "\n          " + nombre + " " + apellido + "\nFecNac: " + nacimiento + "  DNI: " + dni + "   ID: " + id_Alumno + "   INACTIVO";
        }
    }

    public String toString() {
        return  id_Alumno + " - " + nombre + " " + apellido;

    }

}
