package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InscripcionData {
    
    private Connection con;
    
    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion inscripcion) { 
        
        String sql = "INSERT INTO inscripciones (idAlumnos, idMaterias, Nota ) VALUES(?, ?, ?) ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getId_Alumno());
            ps.setInt(2, inscripcion.getMateria().getId_Materia());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                inscripcion.setId_Inscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion registrada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Inscripcion no registrada.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        
    }
    
    public ArrayList<Inscripcion> obtenerInscripciones() { 
        Inscripcion inscripcion = null;
        Alumno alumno = null;
        Materia materia = null;
        ArrayList<Inscripcion> todasInscripciones = new ArrayList();
        String sql = "SELECT * FROM `inscripciones` WHERE ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No existen Inscripciones.");
            } else {
                do {
                    inscripcion = new Inscripcion();
                    alumno = new Alumno();
                    materia = new Materia();
                    
                    inscripcion.setId_Inscripcion(rs.getInt("idInscripcion"));
                    alumno.setId_Alumno(rs.getInt("idAlumnos"));
                    materia.setId_Materia(rs.getInt("idMaterias"));
                    inscripcion.setNota(rs.getInt("nota"));
                    inscripcion.setAlumno(alumno);
                    inscripcion.setMateria(materia);
                    todasInscripciones.add(inscripcion);
                } while (rs.next());
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        return todasInscripciones;
        
    }
    
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) { 
        Inscripcion inscripcion = null;
        Alumno alumno = null;
        Materia materia = null;
        ArrayList<Inscripcion> misInscripciones = new ArrayList();
        String sql = "SELECT idInscripcion, inscripciones.idAlumnos, inscripciones.idMaterias, nota\n"
                + "FROM alumnos, materias, inscripciones\n"
                + "WHERE alumnos.IdAlumno = inscripciones.idAlumnos\n"
                + "AND materias.idMaterias = inscripciones.idMaterias\n"
                + "AND alumnos.IdAlumno =?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No hay inscripciones con ese IdAlumno");
            } else {
                do {
                    inscripcion = new Inscripcion();
                    alumno = new Alumno();
                    materia = new Materia();
                    
                    inscripcion.setId_Inscripcion(rs.getInt("idInscripcion"));
                    alumno.setId_Alumno(id);
                    materia.setId_Materia(rs.getInt("idMaterias"));
                    inscripcion.setNota(rs.getInt("nota"));
                    inscripcion.setAlumno(alumno);
                    inscripcion.setMateria(materia);
                    misInscripciones.add(inscripcion);
                } while (rs.next());
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        return misInscripciones;
        
    }
    
    public ArrayList<Inscripcion> obtenerMateriasCursadas(int id) { 
        Inscripcion inscripcion = null;
        Alumno alumno = null;
        Materia materia = null;
        ArrayList<Inscripcion> materiasInscriptas = new ArrayList();
        String sql = "SELECT alumnos.Nombre,alumnos.apellido, materias.Nombre,  materias.Año, nota,"
                + " materias.idMaterias, inscripciones.idInscripcion\n"
                + "FROM alumnos, materias, inscripciones\n"
                + "WHERE alumnos.IdAlumno = inscripciones.idAlumnos\n"
                + "AND materias.idMaterias = inscripciones.idMaterias\n"
                + "AND alumnos.IdAlumno =?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No hay inscripciones con ese IdAlumno");
            } else {
                do {
                    inscripcion = new Inscripcion();
                    alumno = new Alumno();
                    materia = new Materia();
                    
                    alumno.setNombre(rs.getString(1));
                    alumno.setApellido(rs.getString(2));
                    materia.setNombre(rs.getString(3));
                    materia.setAnio(rs.getInt(4));
                    inscripcion.setNota(rs.getInt("nota"));
                    materia.setId_Materia(rs.getInt(6));
                    inscripcion.setId_Inscripcion(rs.getInt(7));
                    inscripcion.setAlumno(alumno);
                    inscripcion.setMateria(materia);
                    materiasInscriptas.add(inscripcion);
                } while (rs.next());
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        return materiasInscriptas;
    }
    
    public ArrayList<Inscripcion> obtenerMateriasNoCursadas(int id) {
        Inscripcion inscripcion = null;
        Alumno alumno = null;
        Materia materia = null;
        ArrayList<Inscripcion> materiasNoInscriptas = new ArrayList();
        String sql = "SELECT alumnos.nombre, alumnos.apellido, materias.nombre, materias.año, materias.idMaterias\n"
                + "FROM materias, alumnos\n"
                + "WHERE idMaterias NOT IN ( \n"
                + "    	SELECT materias.idMaterias\n"
                + "    	FROM materias JOIN inscripciones ON ( materias.idMaterias = inscripciones.idMaterias )\n"
                + "    	WHERE idAlumnos =? ) and alumnos.idAlumno =?";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No se encontraran materias No Inscriptas");
            } else {
                do {
                    inscripcion = new Inscripcion();
                    alumno = new Alumno();
                    materia = new Materia();
                    alumno.setNombre(rs.getString(1));
                    alumno.setApellido(rs.getString(2));
                    materia.setNombre(rs.getString(3));
                    materia.setAnio(rs.getInt(4));
                    materia.setId_Materia(rs.getInt(5));
                    inscripcion.setAlumno(alumno);
                    inscripcion.setMateria(materia);
                    materiasNoInscriptas.add(inscripcion);
                } while (rs.next());
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        return materiasNoInscriptas;
    }
    
    public void borrarInscripcionMateriaAlumno(int id) {
        
        String sql = "DELETE FROM inscripciones WHERE idInscripcion =?";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro inscripcion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        
    }
    
    public void actualizarNota(double nota, int id) { 
        String sql = "UPDATE  inscripciones  SET  Nota =? WHERE idInscripcion =?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe tal Inscripcion");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        
    }
    
    public ArrayList<Inscripcion> obtenerAlumnosXMateria(int idMateria) {
        Inscripcion inscripcion = null;
        Alumno alumno = null;
        Materia materia = null;
        ArrayList<Inscripcion> alumnosXMateria = new ArrayList();
        String sql = "SELECT materias.Nombre, materias.Año,alumnos.idAlumno, alumnos.apellido, alumnos.Nombre, nota\n"
                + "FROM alumnos, materias, inscripciones\n"
                + "WHERE alumnos.IdAlumno = inscripciones.idAlumnos\n"
                + "AND materias.idMaterias = inscripciones.idMaterias\n"
                + "AND materias.idMaterias =? ORDER BY alumnos.apellido";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No hay alumnos inscripto en esa Materia");
            } else {
                do {
                    inscripcion = new Inscripcion();
                    alumno = new Alumno();
                    materia = new Materia();
                    materia.setNombre(rs.getString(1));
                    materia.setAnio(rs.getInt(2));
                    alumno.setId_Alumno(rs.getInt(3));
                    alumno.setApellido(rs.getString(4));
                    alumno.setNombre(rs.getString(5));
                    inscripcion.setNota(rs.getInt(6));
                    inscripcion.setAlumno(alumno);
                    inscripcion.setMateria(materia);
                    alumnosXMateria.add(inscripcion);
                } while (rs.next());
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
        return alumnosXMateria;
        
    }
    
}
