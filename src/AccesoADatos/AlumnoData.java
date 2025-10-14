package AccesoADatos;

import java.sql.Connection;
import Model.*;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) { 
        String sql = "INSERT INTO alumnos(dni, nombre, apellido, nacimiento, estado) VALUES(?,?,?,?,?)"; 

        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getNacimiento())); 
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate(); 

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) { 
                alumno.setId_Alumno(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no Agregado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        String sql = "SELECT idAlumno,dni, nombre, apellido, nacimiento, estado FROM alumnos WHERE idAlumno=?";
        Alumno alumno = null;

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setId_Alumno(rs.getInt(1));
                alumno.setDni(rs.getInt(2));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNacimiento(rs.getDate("nacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno Inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;

    }

    public Alumno buscarAlumnoDNI(int dni) {

        String sql = "SELECT idAlumno,dni, nombre, apellido, nacimiento, estado FROM alumnos WHERE dni=?";
        Alumno alumno = null;

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setId_Alumno(rs.getInt(1));
                alumno.setDni(rs.getInt(2));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNacimiento(rs.getDate("nacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno Inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;
    }

    public ArrayList<Alumno> listarAlumnos(boolean estado) {
        ArrayList<Alumno> misAlumnos = new ArrayList();
        String sql = "SELECT* FROM alumnos WHERE estado =? ORDER BY apellido";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No se encontraron alumnos con el estado " + estado);
            } else {
                do {
                    Alumno alumno = new Alumno();
                    alumno.setId_Alumno(rs.getInt("idAlumno"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setApellido(rs.getString("apellido"));
                    
                    misAlumnos.add(alumno);

                } while (rs.next());

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return misAlumnos;

    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumnos SET dni=? ,nombre=?, apellido=?, nacimiento=?, estado=? WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getId_Alumno());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Estudiante modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    }

    public void bajaAlumno(int id) {
        String sql = "UPDATE alumnos SET estado=0 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Baja Realizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Alumno con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    }

    public void altaAlumno(int id) {

        String sql = "UPDATE alumnos SET estado=1 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Alta Realizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Alumno con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }

    }

}

