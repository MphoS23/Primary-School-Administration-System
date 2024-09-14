package View;
import Controller.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import Controller.DatabaseConnection;

public class MainMenuGUI extends javax.swing.JFrame {

    //initialise the mainmenu controller into the mainmenugui
    private MainMenu mainMenu;

    private JPanel studentListPanel;

    public MainMenuGUI( MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/school_system.png")))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", Font.BOLD, 14)); // NOI18N
        jLabel2.setText("PRIMARY SCHOOL ADMINISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segue UI", Font.BOLD, 12)); // NOI18N
        jLabel3.setText("REGISTER STUDENT");

        jLabel4.setFont(new java.awt.Font("Segue UI", Font.BOLD, 12)); // NOI18N
        jLabel4.setText("ASSOCIATE STUDENT");

        jLabel5.setFont(new java.awt.Font("Segue UI", Font.BOLD, 12)); // NOI18N
        jLabel5.setText("VIEW STUDENT LIST");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Segue UI", Font.BOLD, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/register_student.png")))); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segue UI", Font.BOLD, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/associate_student.png")))); // NOI18N
        jButton2.setText("ASSOCIATE");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setFont(new java.awt.Font("Segue UI", Font.BOLD, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/list_students.png")))); // NOI18N
        jButton3.setText("STUDENT LIST");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel4)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 400, 300);

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

        studentListPanel = new JPanel();
        studentListPanel.setLayout(new BoxLayout(studentListPanel, BoxLayout.Y_AXIS));
        studentListPanel.setBackground(Color.WHITE);
        studentListPanel.setBounds(10, 300, 380, 90);
        jPanel1.add(studentListPanel);




        pack();
    }
//student registration
    private void jButton1ActionPerformed(ActionEvent evt) {
        int studentID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Student ID:"));
        String firstName = JOptionPane.showInputDialog(this, "Enter First Name:");
        String lastName = JOptionPane.showInputDialog(this, "Enter Last Name:");
        String gender = JOptionPane.showInputDialog(this, "Enter Gender:");
        int age = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Age:"));
        String birthCertificateNumber = JOptionPane.showInputDialog(this, "Enter Birth Certificate Number:");

        boolean result = mainMenu.addStudent(studentID, firstName, lastName, gender, age, birthCertificateNumber);

        if (result) {
            JOptionPane.showMessageDialog(this, "Student registered successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Error registering student.");
        }
    }
//student class association
    private void jButton2ActionPerformed(ActionEvent evt) {
        int studentID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Student ID:"));
        int classID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Class ID:"));

        boolean result = mainMenu.associateStudentWithClass(studentID, classID);

        if (result) {
            JOptionPane.showMessageDialog(this, "Student associated with class successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Error associating student with class.");
        }
    }
//student list associated with class
    private void jButton3ActionPerformed(ActionEvent evt) {
        int classID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Class ID:"));
        ResultSet resultSet = mainMenu.listStudentsByClass(classID);
        updateStudentListPanel(resultSet);
    }

    private void updateStudentListPanel(ResultSet resultSet) {
        // Clear existing components in studentListPanel
        studentListPanel.removeAll();

        try {
            while (resultSet.next()) {
                String studentInfo = resultSet.getString("firstname") + " "
                        + resultSet.getString("lastname") + " (ID: " + resultSet.getInt("StudentID") + ")";
                JLabel studentLabel = new JLabel(studentInfo);
                studentListPanel.add(studentLabel);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving student data.");
        }

        studentListPanel.revalidate();
        studentListPanel.repaint();
    }


    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Run the GUI creation in the Event Dispatch Thread for thread safety
        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Create the MainMenu instance with the database connection
                MainMenu mainMenu = new MainMenu(DatabaseConnection.getConnection());

                // Create and display the GUI
                new MainMenuGUI(mainMenu).setVisible(true);
            } catch (SQLException e) {
                // Handle any SQL exceptions here
                e.printStackTrace();
                // Optionally, log the error or inform the user
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;


    // End of variables declaration
}