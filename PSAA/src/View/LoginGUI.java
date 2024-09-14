package View;

import Controller.Login;
import Controller.DatabaseConnection;
import Controller.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;

// represents a GUI for login system
public class LoginGUI extends JFrame {
    private Connection connection;
    private JTextField jTextField1;
    private JPasswordField jPasswordField1;

    public LoginGUI() {
        try {
            this.connection = DatabaseConnection.getConnection(); // Obtain the database connection
        } catch (SQLException e) {
            e.printStackTrace(); // Handle connection errors appropriately
        }
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        JButton jButton1 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segue UI", Font.BOLD, 56));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 48));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserID");

        jLabel3.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 48));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jTextField1.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 14));

        jButton1.setText("LOGIN");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(295, 295, 295)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(262, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))))
                                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed() {
        int userid = Integer.parseInt(jTextField1.getText());
        String password = String.valueOf(jPasswordField1.getPassword());

        // Use the Login class to authenticate user
        Login loginController = new Login(connection);
        boolean isValid = loginController.authenticateUser(userid, password);

        if (isValid) {
            // Create a MainMenu instance with the database connection
            MainMenu mainMenu = new MainMenu(connection);
            // Create and display the MainMenuGUI with the MainMenu instance
            MainMenuGUI mainMenuGUI = new MainMenuGUI(mainMenu);
            mainMenuGUI.setVisible(true);
            this.dispose(); // Close the login window after successful login
        } else {
            JOptionPane.showMessageDialog(this, "Invalid userid or password");
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new LoginGUI().setVisible(true));
    }
}
