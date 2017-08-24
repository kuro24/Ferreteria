
package Sesion;

import BlueBird.Conexion;
import BlueBird.ImagenFondoPanel;
import BlueBird.FullBuster;
import Clase.EmpleadoUsuario;
import Formulario.MenuPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicioSesion extends javax.swing.JFrame {

    private boolean entroConExito = false;
    
    public final String[] PREGUNTA_SEGURIDAD = new String[]{"¿Lugar de nacimiento de madre o padre?",
                                                        "¿Nombre de libro favorito?",
                                                        "¿Personaje ficticio favorito de la infancia?",
                                                        "¿Enfermedad o reaccion al que es alergico?",
                                                        "¿Temor mas grande?"};
    
    public InicioSesion() {
        initComponents();       
        configuracionInicial();
    }
    
    private void configuracionInicial() {
        this.setDefaultCloseOperation(0);
        this.setTitle("INGRESE TITULO INTELIGENTE AQUI!");
        this.setResizable(false);
        
        FullBuster.formDesign.fontLabel( new JLabel[] {jLabel1, jLabel2} );
        FullBuster.formDesign.fontButton( new JButton[] {btnConfigurar, btnEntrar, btnRecuperar, btnSalir} );
        FullBuster.formDesign.fontTextField( new JTextField[] {txtPassword, txtUsuario} );
        
        linkBoton();
        
        ImagenFondoPanel fondo = new ImagenFondoPanel((int)this.getWidth(), this.getHeight(), "/Imagen/FondoSesion.png");
        jPanel1.add(fondo);
        
        jLabel1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
    }
    
    private void linkBoton() {
        Font font = btnConfigurar.getFont();
        Map atributos = font.getAttributes();
        atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        
        btnConfigurar.setFont(font.deriveFont(atributos));
        btnRecuperar.setFont(font.deriveFont(atributos));
        
        btnConfigurar.setForeground(Color.CYAN);
        btnRecuperar.setForeground(Color.CYAN);
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
            
            /*VALIDAR SI EL USUARIO CONECTADO EXISTE DENTRO DE LA BD*/
            if( Conexion.validarConexion(usuario, pass) ) {
                EmpleadoUsuario empleado = new EmpleadoUsuario(Conexion.usuarioConectado);
                
                /*EL USUARIO SE ENCUENTRA EN LINEA Y NO DEBE INICIAR SESION EN OTRA ESTACION*/
                if( empleado.getEnLinea() == 1 ) {
                    FullBuster.despatch.error(this, "Este usuario ya se ha conectado en otra estacion. \nCierre sesion para poder iniciar sesion en este equipo");
                } else {
                    if( empleado.getPrimerInicio() == 1 ) { //SI ES PRIMER INICIO, PEDIRA CAMBIO DE PASSWORD
                        Frame frame = JOptionPane.getFrameForComponent(this);
                        PrimerInicioSesion primerInicioSesion = new PrimerInicioSesion(frame, true, empleado);
                        primerInicioSesion.setVisible(true);
                        
                        this.dispose();
                    } else {
                        /*SE CAMBIA EL FLAG PARA NO PODER INICIAR SESION*/
                        empleado.setEnLinea(1);
                        empleado.Editar();

                        MenuPrincipal principal = new MenuPrincipal(empleado);
                        principal.setVisible(true);
                        this.dispose();
                    }
                }
            } else {
                FullBuster.despatch.error(this, "Usuario/Contraseña Incorrecta");
                txtUsuario.setText("");
                txtPassword.setText("");
                entroConExito = false;
            }
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
        pnlSesion.setOpaque(false);

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

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Aceptar.png"))); // NOI18N
        btnEntrar.setMnemonic('E');
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("Iniciar Sesion");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Eliminar.png"))); // NOI18N
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
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
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
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlSesionLayout = new javax.swing.GroupLayout(pnlSesion);
        pnlSesion.setLayout(pnlSesionLayout);
        pnlSesionLayout.setHorizontalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword)))
                    .addGroup(pnlSesionLayout.createSequentialGroup()
                        .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecuperar)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfigurar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        btnRecuperar.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnRecuperarMouseReleased

    private void btnRecuperarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMousePressed
        btnRecuperar.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_btnRecuperarMousePressed

    private void btnConfigurarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigurarMousePressed
        btnConfigurar.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_btnConfigurarMousePressed

    private void btnConfigurarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigurarMouseReleased
        btnConfigurar.setForeground(Color.CYAN);
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
        
        FullBuster.formDesign.fontLabel( new JLabel[]{lblUser, lblPass});
        FullBuster.formDesign.fontTextField( new JTextField[]{ptxtUser, ptxtPass});
        
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

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        JLabel lblUsuario = new JLabel("Nombre de Usuario:");
        JLabel lblPregunta = new JLabel("Pregunta de Seguridad:");
        JLabel lblRespuesta = new JLabel("Respuesta:");
        JLabel lblNewPass = new JLabel("Ingrese la Nueva Contraseña:");
        
        JTextField txtUser = new JTextField(25);
        JComboBox cmbPregunta = new JComboBox(PREGUNTA_SEGURIDAD);
        JTextField txtRespuesta = new JTextField(25);
        JPasswordField txtNewPass = new JPasswordField(25);
        
        Object[] obj1 = new Object[] { lblUsuario, txtUser, lblPregunta, cmbPregunta, lblRespuesta, txtRespuesta };
        
        FullBuster.formDesign.fontLabel( new JLabel[]{lblUsuario, lblPregunta, lblRespuesta, lblNewPass});
        FullBuster.formDesign.fontTextField( new JTextField[]{txtUser, txtRespuesta, txtNewPass});
        FullBuster.formDesign.fontComponents( new JComponent[]{cmbPregunta});
        
        JOptionPane.showMessageDialog(this, obj1, "RECUPERACION", JOptionPane.QUESTION_MESSAGE);
        
        if( txtUser.getText().equals("") || txtRespuesta.getText().equals("") ) {
            FullBuster.despatch.error(this, "No pueden haber campos vacios");
        } else {
            /*SE BUSCAR EL USUARIO PARA VER SI EXISTE EN LA BD*/
            try {
                Conexion conexion = new Conexion();

                EmpleadoUsuario usuario = new EmpleadoUsuario();
                usuario.buscarPorConcepto(txtUser.getText());

                /*SI EL ID ES DIFERENTE DE CERO QUIERE DECIR QUE EXISTE*/
                if( usuario.getIdEmpleadoUsuario() != 0 ) {
                    /*SE VALIDA LA PREGUNTA Y LA RESPUESTA*/
                    if( usuario.getPreguntaSeguridad() == (cmbPregunta.getSelectedIndex()+1) ) {
                        /*SE VALIDA QUE LA RESPUESTA SEA CORRECTA*/
                        if( usuario.getRespuestaSeguridad().equals(txtRespuesta.getText()) ) {
                            JOptionPane.showMessageDialog(this, new Object[]{lblNewPass,txtNewPass}, "RECUPERACION", JOptionPane.INFORMATION_MESSAGE);
                            
                            /*VALIDA QUE LA CONTRASEÑA LLEVE NUMEROS Y LETRAS*/
                            if( tieneCombinacionNumeroCaracter(txtNewPass.getText()) ) {
                                /*VALIDA QUE LA CONTRASEÑA SEA DE 8 CARACTERES*/
                                if( txtNewPass.getText().length() == 8 ) {
                                    usuario.setClave(txtNewPass.getText());

                                    usuario.Editar();
                                    FullBuster.despatch.afirmacion(this, "Contraseña Guardada con Exito", "RECUPERACION");
                                } else {
                                    FullBuster.despatch.error(this, "La contraseña debe tener una longitud de 8 caracteres");
                                }
                            } else {
                                FullBuster.despatch.error(this, "La contraseña debe esta formada por una combinacion de numeros y caracteres");
                            }
                        } else {
                            FullBuster.despatch.error(this, "Respuesta Incorrecta");
                        }
                    } else {
                        FullBuster.despatch.error(this, "La pregunta elegida no coincide");
                    }
                } else {
                    FullBuster.despatch.error(this, "Usuario No Valido");
                }
            } catch( SQLException | ClassNotFoundException e ) {
                FullBuster.despatch.error(this, e.toString());
            }
        }
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        FullBuster.componentHandling.validarTextField(3, txtPassword, evt, 8);
    }//GEN-LAST:event_txtPasswordKeyTyped

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
