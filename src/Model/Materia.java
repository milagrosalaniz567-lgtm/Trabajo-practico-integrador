package Model;

public class Materia {

    private int id_Materia;
    private String nombre;
    private int anio;
    private boolean estado;

    public Materia(int id_Materia, String nombre, int anio, boolean estado) {
        this.id_Materia = id_Materia;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia() {
    }

    public int getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  nombre + " - " + anio + "° Año";
    }

    
    
    public String toString1() {

        if (estado == true) {
            return "\n          " + nombre + "\nAño: " + anio + " ID: " + id_Materia + "   ACTIVO";
        } else {
            return "\n          " + nombre + "\nAño: " + anio + " ID: " + id_Materia + "   INACTIVO";
        }

    }

}
