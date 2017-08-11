
package Sesion;

import BlueBird.Conexion;
import BlueBird.FullBuster;
import Clase.Empleado;
import Formulario.MenuPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class InicioSesion extends javax.swing.JFrame {

    private boolean entroConExito = false;
    
    public InicioSesion() {
        initComponents();
        
        this.setDefaultCloseOperation(0);
        this.setTitle("INGRESE TITULO INTELIGENTE AQUI!");
        this.setResizable(false);
        
        linkBoton();
    }
    
    private void linkBoton() {
        Font font = btnConfigurar.getFont();
        Map atributos = font.getAttributes();
        atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        
        btnConfigurar.setFont(font.deriveFont(atributos));
        btnRecuperar.setFont(font.deriveFont(atributos));
    }
    
    public void cerrarFormularioSesion() {
        if( FullBuster.despatch.confirmacion(this, "¿Esta Seguro que desea Salir del Programa?")) {
            this.dispose();
        }
    }
    
    public void ubicarFormularioSesion() {
        this.setLocation( (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2) - (this.getWidth() / 2), 
                (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/ 2) - (this.getHeight() / 2) );
    }
    
    public void ubicarPanelSesion() {
        pnlSesion.setLocation((this.getWidth() / 2) - (pnlSesion.getWidth() / 2), 
                (this.getHeight() / 2) - (pnlSesion.getHeight() / 2));
    }
    
    public void iniciarSesion() throws SQLException, ClassNotFoundException {
        if( txtUsuario.getText().isEmpty() || txtPassword.getText().isEmpty() ) {
            FullBuster.despatch.error(this, "No pueden haber campos vacios");
        } else {
            entroConExito = true;
            Conexion conexion = new Conexion();
            
            String usuario = txtUsuario.getText();
            String pass = txtPassword.getText();
            
            int usuarioValido = 0;
            ResultSet resultado = Conexion.consulta("select validar_usuario('"+usuario+"', '"+pass+"')");
            while( resultado.next() ) {
                usuarioValido = resultado.getInt(1);
            }
            
            if( usuarioValido == 1 ) {
                FullBuster.despatch.afirmacion(this, "entro", "entro");
                
                MenuPrincipal principal = new MenuPrincipal();
                principal.setVisible(true);
                this.dispose();
            } else {
                FullBuster.despatch.error(this, "Este usuario no esta registrado");
                txtUsuario.setText("");
                txtPassword.setText("");
                entroConExito = false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlSesion = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        btnConfigurar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btnEntrar.setMnemonic('E');
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("Iniciar Sesion");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir del Programa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRecuperar.setForeground(new java.awt.Color(0, 0, 255));
        btnRecuperar.setMnemonic('R');
        btnRecuperar.setText("Recuperar Contraseña");
        btnRecuperar.setToolTipText("Recupere la contraseña en caso de haber olvidado la actual");
        btnRecuperar.setBorder(null);
        btnRecuperar.setBorderPainted(false);
        btnRecuperar.setContentAreaFilled(false);
        btnRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRecuperarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRecuperarMouseReleased(evt);
            }
        });

        btnConfigurar.setForeground(new java.awt.Color(0, 0, 255));
        btnConfigurar.setMnemonic('C');
        btnConfigurar.setText("Configuracion de Red");
        btnConfigurar.setToolTipText("Configure la Red de conexion de la pc");
        btnConfigurar.setBorder(null);
        btnConfigurar.setBorderPainted(false);
        btnConfigurar.setContentAreaFilled(false);
        btnConfigurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfigurarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnConfigurarMouseReleased(evt);
            }
        });
        btnConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSesionLayout = new javax.swing.GroupLayout(pnlSesion);
        pnlSesion.setLayout(pnlSesionLayout);
        pnlSesionLayout.setHorizontalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSesionLayout.createSequentialGroup()
                        .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecuperar)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfigurar)))
                .addContainerGap())
        );
        pnlSesionLayout.setVerticalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRecuperar)
                .addGap(18, 18, 18)
                .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(btnConfigurar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ubicarFormularioSesion();
        ubicarPanelSesion();
    }//GEN-LAST:event_formWindowOpened

    private void btnRecuperarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMouseReleased
        btnRecuperar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnRecuperarMouseReleased

    private void btnRecuperarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMousePressed
        btnRecuperar.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_btnRecuperarMousePressed

    private void btnConfigurarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigurarMousePressed
        btnConfigurar.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_btnConfigurarMousePressed

    private void btnConfigurarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigurarMouseReleased
        btnConfigurar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnConfigurarMouseReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarFormularioSesion();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarActionPerformed
        JLabel lblUser = new JLabel("User:");
        JLabel lblPass = new JLabel("Password:");
        
        JPasswordField ptxtUser = new JPasswordField(25);
        JPasswordField ptxtPass = new JPasswordField(25);
        
        Object[] obj1 = new Object[] { lblUser, ptxtUser, lblPass, ptxtPass };
        
        JOptionPane.showMessageDialog(this, obj1, "CONEXION", JOptionPane.QUESTION_MESSAGE);
        
        if( ptxtUser.getText().equals("root") && ptxtPass.getText().equals("123") ) {
            Frame frame = JOptionPane.getFrameForComponent(this);
            
            ConfiguracionConexion configuracion = new ConfiguracionConexion(frame, true);
            configuracion.setVisible(true);
        } else {
            FullBuster.despatch.error(this, "Conexion Fallida, Intente de Nuevo");
        }
    }//GEN-LAST:event_btnConfigurarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            if( !entroConExito ) {
                iniciarSesion();
            }
        } catch( SQLException | ClassNotFoundException e ) {
            FullBuster.despatch.error(this, e.toString());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        try {
            if( !entroConExito ) {
                iniciarSesion();
            }
        } catch( SQLException | ClassNotFoundException e ) {
            FullBuster.despatch.error(this, e.toString());
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        FullBuster.componentHandling.validarTextField(3, txtUsuario, evt, 20);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarFormularioSesion();
    }//GEN-LAST:event_formWindowClosing

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        try {
            if( !entroConExito ) {
                iniciarSesion();
            }
        } catch( SQLException | ClassNotFoundException e ) {
            FullBuster.despatch.error(this, e.toString());
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfigurar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlSesion;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
