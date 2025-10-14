package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Model.Alumno;
import Model.Inscripcion;
import Model.Materia;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VistaManipulacionDeNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla; // a este modelo le agregamos las columnas, filas necesarias, como asi tambien eliminamos filas
    private Inscripcion inscripcion;
    private Materia materia;
    private InscripcionData inscData = new InscripcionData();
    private AlumnoData alumData = new AlumnoData();
    private MateriaData matData = new MateriaData();
    private ArrayList<Inscripcion> listaInscripto = new ArrayList();
    private ArrayList<Inscripcion> listaNoInscripto = new ArrayList();
    private ArrayList<Alumno> listaAlumnos = new ArrayList();

    private void llenarComboBox() {
        for (Alumno a : listaAlumnos) {
            jcbAlumnos.addItem(a);
        }
    }

    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("IdINSCRIPCION");
        columnas.add("CODIGO");
        columnas.add("NOMBRE");
        columnas.add("AÑO");
        columnas.add("NOTA");
        for (Object c : columnas) { //se recorre el arrays para ir llenando los nombres de las columnas
            modeloTabla.addColumn(c);
        }
     
        //ocultamos una columna para no mostrar el id, ya que al usuario no le interesa
        jTable.setModel(modeloTabla);
        TableColumn columnaId = jTable.getColumnModel().getColumn(0);
        columnaId.setMaxWidth(0);
        columnaId.setMinWidth(0);
        columnaId.setPreferredWidth(0);
        jTable.doLayout();

    }
    private void llenarTabla() {
        borrarFilas();
        Alumno elegido = (Alumno) jcbAlumnos.getSelectedItem();

        listaInscripto = inscData.obtenerMateriasCursadas(elegido.getId_Alumno());
        for (Inscripcion i : listaInscripto) {
            modeloTabla.addRow(new Object[]{i.getId_Inscripcion(), i.getMateria().getId_Materia(), i.getMateria().getNombre(), i.getMateria().getAnio(), i.getNota()});

        }
    }

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    public VistaManipulacionDeNotas() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        inscripcion = new Inscripcion();
        materia = new Materia();
        listaAlumnos = alumData.listarAlumnos(true);
        armarCabecera();
        borrarFilas();
        llenarComboBox();
        jlMensaje.setVisible(false);
        jlMensaje1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtNota = new javax.swing.JTextField();
        jlMensaje1 = new javax.swing.JLabel();
        jlMensaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdInscripcion", "ID", "Materia", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setMinWidth(0);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jcbAlumnos.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARGA DE NOTAS");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALUMNO");

        jbActualizar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jbActualizar.setText("ACTUALIZAR");
        jbActualizar.setEnabled(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtNota.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jtNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNota.setEnabled(false);
        jtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNotaActionPerformed(evt);
            }
        });

        jlMensaje1.setBackground(new java.awt.Color(255, 255, 255));
        jlMensaje1.setForeground(new java.awt.Color(255, 255, 255));
        jlMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlMensaje1.setText("Ingrese nota nueva y");

        jlMensaje.setBackground(new java.awt.Color(255, 255, 255));
        jlMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlMensaje.setText("Presione Enter");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1))
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jlMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jlMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbActualizar)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jbActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        int filaElegida = jTable.getSelectedRow();

        int idInscripcion = (Integer) jTable.getValueAt(filaElegida, 0);
//      double nota = (double) jTable.getValueAt(filaElegida, 4);
        double nota = Double.parseDouble(jtNota.getText());
        inscData.actualizarNota(nota, idInscripcion);
        jbActualizar.setEnabled(false);
        jtNota.setText("");
        jtNota.setEnabled(false);
        llenarTabla();

    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        llenarTabla();
        jbActualizar.setEnabled(false);
        jtNota.setText("");
        jtNota.setEnabled(false);
        jlMensaje1.setText("Ingrese nota nueva y");
        jlMensaje.setText("Presione Enter");
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int filaElegida = jTable.getSelectedRow();
        jtNota.setText(jTable.getValueAt(filaElegida, 4) + "");
        jtNota.setEnabled(true);
        jlMensaje.setVisible(true);
        jlMensaje1.setVisible(true);
        jlMensaje1.setText("Ingrese nota nueva y");
        jlMensaje.setText("Presione Enter");
    }//GEN-LAST:event_jTableMouseClicked

    private void jtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNotaActionPerformed
        try {
            double nota = Double.parseDouble(jtNota.getText());
            int filaElegida = jTable.getSelectedRow();
            double aux = (double) jTable.getValueAt(filaElegida, 4);
            if (nota != aux) {
                jbActualizar.setEnabled(true);
                jlMensaje.setText("");
                jlMensaje1.setText("");

            } else {
                jlMensaje1.setText("Ingrese nota distinta");
                jlMensaje.setText("");
                jbActualizar.setEnabled(false);
            }

//          
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numerico para CODIGO");

//            jtCodigo.setText("");
        }
    }//GEN-LAST:event_jtNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlMensaje1;
    private javax.swing.JTextField jtNota;
    // End of variables declaration//GEN-END:variables
}
