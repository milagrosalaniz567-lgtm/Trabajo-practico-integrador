package Model;

public class Inscripcion {

    private int id_Inscripcion = -1;
    private double nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(int id_Inscripcion, double nota, Alumno alumno, Materia materia) {
        this.id_Inscripcion = id_Inscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(double nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion() {
    }

    public int getId_Inscripcion() {
        return id_Inscripcion;
    }

    public void setId_Inscripcion(int id_Inscripcion) {
        this.id_Inscripcion = id_Inscripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {//obtenerInscripciones()....  obtenerInscripcionesPorAlumno()
        return "id_Inscripcion: " + id_Inscripcion + ", Nota: " + nota + ", id_Alumno: " + alumno.getId_Alumno() + ", id_Materia: " + materia.getId_Materia();
    }

    public String toString1() {//obtenerMateriasCursadas()
        return "Nombre y apellido: " + alumno.getNombre() + " " + alumno.getApellido()
                + ", Materia: " + materia.getNombre() + ", Año: " + materia.getAnio() + "Nota: " + nota;
    }

    public String toString2() {//obtenerMateriasNoCursadas()
        return materia.getNombre() + " Año: " + materia.getAnio();
    }
    public String toString3(){//obtenerAlumnosXMateria()
        return alumno.getApellido() + " " + alumno.getNombre() + " Nota: " + nota;
                
     }
}
