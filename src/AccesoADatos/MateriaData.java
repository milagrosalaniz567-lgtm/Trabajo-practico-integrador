package AccesoADatos;

import Model.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) { 

        String sql = "INSERT INTO materias( nombre, año, estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate(); 

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) { 

                materia.setId_Materia(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Materia no agregada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) { 
        String sql = "SELECT idMaterias, nombre, año, estado FROM materias WHERE idMaterias=?";
        Materia materia = null;

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setId_Materia(rs.getInt(1));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt(3));
                materia.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }

        return materia;

    }

    public void modificarMateria(Materia materia) { 
        String sql = "UPDATE materias SET nombre=?,año=?,estado=? WHERE idMaterias=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getId_Materia());

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no se encontro.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

    public void bajaMateria(int id) { 
        String sql = "UPDATE materias SET estado=0 WHERE idMaterias=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Baja Realizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Materia con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

    public void altaMateria(int id) { 
        String sql = "UPDATE materias SET estado=1 WHERE idMaterias=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Alta Realizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Materia con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

    public ArrayList<Materia> listarMaterias(boolean estado) { 
        ArrayList<Materia> misMaterias = new ArrayList();
        String sql = "SELECT* FROM materias WHERE estado =? ORDER BY año";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Materias no encontradas.");
            } else {
                do {
                    Materia materia = new Materia();
                    materia.setId_Materia(rs.getInt("idMaterias"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnio(rs.getInt("año"));
                    materia.setEstado(rs.getBoolean("estado"));
                    misMaterias.add(materia);

                } while (rs.next());
            }

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
        return misMaterias;

    }
}
