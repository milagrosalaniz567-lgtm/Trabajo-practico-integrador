
package Vistas;

public class VistaUniversidad extends javax.swing.JFrame {

    
    public VistaUniversidad() {
        initComponents();
        setLocationRelativeTo(null); // centrar las ventanas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdEscritorio = new javax.swing.JDesktopPane();
        jEscritorio1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormularioMateria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFormularioAlumno = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmFormularioInscripcion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmManipulacionNotas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmAlumnosXMaterias = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 140, 784, 782));
        setResizable(false);

        jdEscritorio.setPreferredSize(new java.awt.Dimension(900, 880));

        jEscritorio1.setBackground(new java.awt.Color(51, 51, 51));
        jEscritorio1.setPreferredSize(new java.awt.Dimension(900, 880));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADMINISTRACION");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 80)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UNIVERSIDAD");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" GRUPO 8");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INTEGRANTES : ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pablo Alberto Mango");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Milagros abigail Alaniz");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Alejo Mango");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cristian Rivero");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Practico Transversal");

        javax.swing.GroupLayout jEscritorio1Layout = new javax.swing.GroupLayout(jEscritorio1);
        jEscritorio1.setLayout(jEscritorio1Layout);
        jEscritorio1Layout.setHorizontalGroup(
            jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorio1Layout.createSequentialGroup()
                .addGroup(jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorio1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel10))
                    .addGroup(jEscritorio1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel8))
                    .addGroup(jEscritorio1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEscritorio1Layout.createSequentialGroup()
                                .addGroup(jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jEscritorio1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorio1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorio1Layout.createSequentialGroup()
                                .addGap(613, 613, 613)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jEscritorio1Layout.setVerticalGroup(
            jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorio1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jdEscritorio.setLayer(jEscritorio1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(422, 20));

        jMenu1.setText("Materias");

        jmFormularioMateria.setText("Formulario de Materias");
        jmFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormularioMateria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumnos");

        jmFormularioAlumno.setText("Formularios de Alumnos");
        jmFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu2.add(jmFormularioAlumno);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inscripciones");

        jmFormularioInscripcion.setText("Formularios de Inscripciones");
        jmFormularioInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(jmFormularioInscripcion);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Carga de Notas");

        jmManipulacionNotas.setText("Manipulacion de Notas");
        jmManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu4.add(jmManipulacionNotas);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Consultas");

        jmAlumnosXMaterias.setText("Listar Alumnos por Materias");
        jmAlumnosXMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosXMateriasActionPerformed(evt);
            }
        });
        jMenu5.add(jmAlumnosXMaterias);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Salir");

        jmSalir.setText("Salir del Programa");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu6.add(jmSalir);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnoActionPerformed
        jEscritorio1.removeAll();
        jEscritorio1.repaint();
        VistaFormularioAlumnos fAlumno = new VistaFormularioAlumnos();
        jEscritorio1.add(fAlumno);
        fAlumno.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jmFormularioAlumnoActionPerformed

    private void jmFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriaActionPerformed
        jEscritorio1.removeAll();
        jEscritorio1.repaint();
        VistaFormularioMaterias fMateria = new VistaFormularioMaterias();
        jEscritorio1.add(fMateria);
        fMateria.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jmFormularioMateriaActionPerformed

    private void jmFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioInscripcionActionPerformed
        jEscritorio1.removeAll();
        jEscritorio1.repaint();
        VistaFormularioInscripciones fInscripciones = new VistaFormularioInscripciones();
        jEscritorio1.add(fInscripciones);
        fInscripciones.setVisible(true); 
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jmFormularioInscripcionActionPerformed

    private void jmManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionNotasActionPerformed
        jEscritorio1.removeAll();
        jEscritorio1.repaint();
        VistaManipulacionDeNotas notas = new VistaManipulacionDeNotas();
        jEscritorio1.add(notas);
        notas.setVisible(true);
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jmManipulacionNotasActionPerformed

    private void jmAlumnosXMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosXMateriasActionPerformed
        jEscritorio1.removeAll();
        jEscritorio1.repaint();
        VistaAlumnosXMaterias listaAlumnos = new VistaAlumnosXMaterias();
        jEscritorio1.add(listaAlumnos);
        listaAlumnos.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jmAlumnosXMateriasActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUniversidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jEscritorio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenuItem jmAlumnosXMaterias;
    private javax.swing.JMenuItem jmFormularioAlumno;
    private javax.swing.JMenuItem jmFormularioInscripcion;
    private javax.swing.JMenuItem jmFormularioMateria;
    private javax.swing.JMenuItem jmManipulacionNotas;
    private javax.swing.JMenuItem jmSalir;
    // End of variables declaration//GEN-END:variables
}
