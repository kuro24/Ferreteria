
package Sesion;

import BlueBird.FullBuster;
import Clase.Empleado;
import Clase.EmpleadoUsuario;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author manuel
 */
public class PrimerInicioSesion extends javax.swing.JDialog {

    EmpleadoUsuario usuario;
    
    public PrimerInicioSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PrimerInicioSesion(java.awt.Frame parent, boolean modal, EmpleadoUsuario usuario) throws SQLException {
        super(parent, modal);
        initComponents();
        
        FullBuster.formDesign.designDialog("Primer Inicio de Sesiion", this, jPanel1, false);
        FullBuster.formDesign.fontLabel( new JLabel[]{jLabel1, jLabel2, jLabel3, jLabel4, jLabel5} );
        FullBuster.formDesign.fontTextField( new JTextField[]{txtUsuario, txtRespuesta, txtPass1, txtPass2} );
        FullBuster.formDesign.fontComponents( new JComponent[]{cmbPregunta} );
        FullBuster.formDesign.fontButton( new JButton[]{btnGuardar, btnCerrar});
        
        this.usuario = usuario;
        Empleado empleado = new Empleado(usuario.getIdEmpleadoUsuario());
        txtUsuario.setText(usuario.getUsuario() + " ("+empleado.getNombre() + " " + empleado.getApellidoRazonSocial()+") ");
        
        lblError1.setVisible(false);
        lblError2.setVisible(false);
    }
    
    public void cerrarFormulario() {
        if( FullBuster.despatch.confirmacion(this, "¿Esta Seguro que desea Salir del Programa?")) {
            this.dispose();
        }
    }
    
    public boolean tieneCombinacionNumeroCaracter( String password ) {
        int cantCaracter = 0;
        int cantNumero = 0;
        
        for (int i = 0; i < password.length(); i++) {
            if( Character.isDigit(password.charAt(i)) ) cantNumero++;
            if( Character.isLetter(password.charAt(i)) ) cantCaracter++;
        }
        
        return (cantCaracter != 0) && (cantNumero != 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass1 = new javax.swing.JPasswordField();
        txtPass2 = new javax.swing.JPasswordField();
        cmbPregunta = new javax.swing.JComboBox<>();
        txtRespuesta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();
        lblError2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Usuario:");

        txtUsuario.setEnabled(false);

        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass1KeyTyped(evt);
            }
        });

        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass2KeyTyped(evt);
            }
        });

        cmbPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Lugar de nacimiento de madre o padre?", "¿Nombre de libro favorito?", "¿Personaje ficticio favorito de la infancia?", "¿Enfermedad o reaccion al que es alergico?", "¿Temor mas grande?" }));

        txtRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespuestaKeyTyped(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Confirmar Contraseña:");

        jLabel4.setText("Pregunta de Seguridad:");

        jLabel5.setText("Respuesta");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Aceptar.png"))); // NOI18N
        btnGuardar.setMnemonic('G');
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar los cambios de usuario");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Salir.png"))); // NOI18N
        btnCerrar.setMnemonic('C');
        btnCerrar.setText("Cerrar");
        btnCerrar.setToolTipText("Cerrar ventana");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblError1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblError1.setForeground(new java.awt.Color(255, 0, 0));
        lblError1.setText("CONTRASEÑA INCORRECTA");

        lblError2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblError2.setForeground(new java.awt.Color(255, 0, 0));
        lblError2.setText("CONTRASEÑA INCORRECTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtRespuesta)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPass1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                            .addComponent(txtPass2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblError1)
                                            .addComponent(lblError2))))
                                .addGap(0, 17, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblError1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblError2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPass1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyTyped
        FullBuster.componentHandling.validarTextField(3, txtPass1, evt, 8);
    }//GEN-LAST:event_txtPass1KeyTyped

    private void txtPass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyTyped
        FullBuster.componentHandling.validarTextField(3, txtPass2, evt, 8);
    }//GEN-LAST:event_txtPass2KeyTyped

    private void txtRespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespuestaKeyTyped
        FullBuster.componentHandling.validarTextField(3, txtRespuesta, evt, 20);
    }//GEN-LAST:event_txtRespuestaKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       cerrarFormulario();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarFormulario();
    }//GEN-LAST:event_formWindowClosing

    private void txtPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyReleased
        lblError1.setVisible(!tieneCombinacionNumeroCaracter(txtPass1.getText()));
    }//GEN-LAST:event_txtPass1KeyReleased

    private void txtPass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyReleased
        lblError2.setVisible(!txtPass2.getText().equals(txtPass1.getText()));
    }//GEN-LAST:event_txtPass2KeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if( txtPass1.getText().equals("") || txtPass2.getText().equals("") || 
                txtUsuario.getText().equals("") || txtRespuesta.getText().equals("") ) {
            FullBuster.despatch.error(this, "No pueden haber campos vacios");
        } else {
            if( lblError1.isVisible() || lblError2.isVisible() ) {
                FullBuster.despatch.error(this, "Contraseña Invalida. Intente de Nuevo");
            } else {
                try {
                    if(txtPass1.getText().length() != 8) {
                        FullBuster.despatch.error(this, "La longitud de la contraseña debe ser de 8 caracteres");
                    } else {
                        usuario.setClave(txtPass1.getText());
                        usuario.setPreguntaSeguridad(cmbPregunta.getSelectedIndex()+1);
                        usuario.setRespuestaSeguridad(txtRespuesta.getText());
                        usuario.setPrimerInicio(0);

                        usuario.Editar();

                        FullBuster.despatch.afirmacion(this, "Datos de Usuario Guardado con Exito", "GUARDADO");
                        this.dispose();

                        InicioSesion is = new InicioSesion();
                        is.setVisible(true);
                    }
                } catch( SQLException e ) {
                    FullBuster.despatch.error(this, e.toString());
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(PrimerInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimerInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimerInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrimerInicioSesion dialog = new PrimerInicioSesion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError2;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
