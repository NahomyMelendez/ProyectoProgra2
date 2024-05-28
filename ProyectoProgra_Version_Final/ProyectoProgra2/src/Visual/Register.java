/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import JavaServe.ClientCommunication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * La clase Register proporciona la interfaz gráfica para el registro de un
 * nuevo usuario. Permite al usuario ingresar un nombre de usuario y una
 * contraseña, y enviarlos al servidor para registrarse. Extiende
 * javax.swing.JFrame.
 *
 * @see javax.swing.JFrame
 */
public class Register extends javax.swing.JFrame {

    public static Socket sharedSocket;
    public static boolean sharedAuth;
    public static boolean shareRol;

    private static final String SERVER_ADDRESS = "192.168.1.35"; // Cambia esto con la dirección IP de tu servidor
    private static final int SERVER_PORT = 5050; // Cambia esto con el puerto en el que tu servidor está escuchando

    /**
     * Constructor de la clase Register. Inicializa los componentes de la
     * interfaz gráfica.
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        jButtonRegis = new javax.swing.JButton();
        jRadioButtonAdm = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Rresgistrarse");

        jLabel2.setText("Ingrese Usuario");

        jLabel3.setText("Ingrese contraseña");

        jButtonRegis.setText("Registrarse");
        jButtonRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisActionPerformed(evt);
            }
        });

        jRadioButtonAdm.setText("Administrador");
        jRadioButtonAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdmActionPerformed(evt);
            }
        });

        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButtonRegis)))
                        .addGap(17, 17, 17)))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonAdm)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonRegis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAdm)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Obtiene el nombre de usuario y la contraseña de los campos de texto y los
     * envía al servidor para el proceso de registro. Si el servidor responde
     * con una autenticación exitosa, se abre la ventana del cliente.
     */
    private void jButtonRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisActionPerformed
        String username = UserName.getText(); // Obtiene el nombre de usuario del campo de texto
        String password = Password.getText(); // Obtiene la contraseña del campo de texto

        // Verifica si el usuario o la contraseña están vacíos
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese un nombre de usuario y una contraseña");
        } else {
            try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT); 
                PrintWriter out = new PrintWriter(socket.getOutputStream(),
                true); BufferedReader in = new BufferedReader(new
                InputStreamReader(socket.getInputStream())); 
                OutputStream binaryOut = socket.getOutputStream(); 
                    InputStream binaryIn = socket.getInputStream()) {                // Crear instancia de ClientCommunication para manejar la comunicación con el servidor
                ClientCommunication clientCommunication = 
                new ClientCommunication(socket, out, in, binaryOut, binaryIn);

                // Envía el nombre de usuario, la contraseña y el indicador de autenticación compartida al servidor
                clientCommunication.sendMessage("1," + username 
                + "," + password + ",-" + shareRol + "-" + Login.sharedAuth);

                // Recibir respuesta del servidor
                String response = clientCommunication.receiveMessage();

                // Si la autenticación fue exitosa, procede a abrir la ventana del cliente
                if (response.startsWith("auth exitoso")) {
                    boolean isAuthenticated = Boolean
                            .parseBoolean(response.substring(13));
                    if (isAuthenticated) {
                        // Establecer la autenticación compartida a verdadera
                        Login.sharedSocket = socket;
                        Login.sharedAuth = true;
                        // Crear la instancia de la ventana del cliente
                        Client client = new Client(username,
                                Login.sharedAuth, Login.shareRol);
                        // Mostrar la ventana del cliente
                        client.setVisible(true);
                        // Cerrar la ventana de registro
                        this.dispose();
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al conectar con el servidor: "
                        + e.getMessage());
                JOptionPane.showMessageDialog(this,
                        "Error al conectar con el servidor");
            }


    }//GEN-LAST:event_jButtonRegisActionPerformed
    }
    private void jRadioButtonAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login regresa = new Login();
        regresa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAdm;
    // End of variables declaration//GEN-END:variables
}
