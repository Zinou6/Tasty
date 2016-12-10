//Ben Said Zine El Abidine
package Tasty_Face;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class Tasty_Frame extends javax.swing.JFrame {


    public Tasty_Frame() {
        initComponents();
        
        WrongLabel1.setVisible(false);
        WrongLabel2.setVisible(false);
        WrongLabel3.setVisible(false);
        WrongLabel4.setVisible(false);
        WrongLabel5.setVisible(false);
        WrongLabel6.setVisible(false);
        WrongLabel7.setVisible(false);
        WrongLabel8.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_2 = new javax.swing.JPanel();
        ExitLabel2 = new javax.swing.JLabel();
        DivisionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WrongLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        ReturnButton = new javax.swing.JLabel();
        SignUpLabel2 = new javax.swing.JLabel();
        WrongLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        WrongLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        WrongLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        WrongLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        WrongLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        BackgroundLabel2 = new javax.swing.JLabel();
        Panel_1 = new javax.swing.JPanel();
        WrongLabel7 = new javax.swing.JLabel();
        SignUpButton1 = new javax.swing.JButton();
        PasswordLabel = new javax.swing.JLabel();
        WrongLabel8 = new javax.swing.JLabel();
        PseudoLabel = new javax.swing.JLabel();
        PseudoTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginLabel = new javax.swing.JLabel();
        VisiblePasswordCheckBox = new javax.swing.JCheckBox();
        ExitButtonLabel = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();
        InvesibleTextField = new javax.swing.JTextField();
        Panel_3 = new javax.swing.JPanel();
        ExitButtonLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RestaurantNameLabel = new javax.swing.JLabel();
        RestaurantAddressLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RestaurantNameTextField = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        DoneLabel = new javax.swing.JLabel();
        BackgroundLabel3 = new javax.swing.JLabel();
        Panel_4 = new javax.swing.JPanel();
        DesktopPane = new javax.swing.JDesktopPane();
        ExitButtonLabel2 = new javax.swing.JLabel();
        CamButton = new javax.swing.JButton();
        PhotoLabel = new javax.swing.JLabel();
        DetailPanel = new javax.swing.JPanel();
        PlusButton = new javax.swing.JButton();
        DetailLabel = new javax.swing.JLabel();
        RecentActionsLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Panel_5 = new javax.swing.JPanel();
        CategoryButton2Label = new javax.swing.JLabel();
        ExitButtonLabel3 = new javax.swing.JLabel();
        CamButton1 = new javax.swing.JButton();
        CategoryButton3Label = new javax.swing.JLabel();
        CategoryButton4Label = new javax.swing.JLabel();
        ClientPhotoLabel = new javax.swing.JLabel();
        CategoryButton5Label = new javax.swing.JLabel();
        CategoryButton1Label = new javax.swing.JLabel();
        ClinetBackgroundLabel = new javax.swing.JLabel();
        ClientDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tasty App");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 405));
        setResizable(false);

        Panel_2.setLayout(null);

        ExitLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png"))); // NOI18N
        ExitLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitLabel2MouseReleased(evt);
            }
        });
        Panel_2.add(ExitLabel2);
        ExitLabel2.setBounds(550, 0, 50, 50);

        DivisionComboBox.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        DivisionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client", "Restaurant" }));
        Panel_2.add(DivisionComboBox);
        DivisionComboBox.setBounds(30, 300, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Confirm Password :");
        Panel_2.add(jLabel1);
        jLabel1.setBounds(30, 260, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password :");
        Panel_2.add(jLabel2);
        jLabel2.setBounds(30, 220, 150, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Pseudo :");
        Panel_2.add(jLabel3);
        jLabel3.setBounds(30, 180, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Phone Number :");
        Panel_2.add(jLabel4);
        jLabel4.setBounds(30, 140, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("First Name :");
        Panel_2.add(jLabel5);
        jLabel5.setBounds(30, 90, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Last Name :");
        Panel_2.add(jLabel6);
        jLabel6.setBounds(310, 90, 150, 20);

        WrongLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel6.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel6.setText("*");
        Panel_2.add(WrongLabel6);
        WrongLabel6.setBounds(400, 250, 10, 20);
        Panel_2.add(jPasswordField2);
        jPasswordField2.setBounds(180, 250, 240, 35);

        ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return.png"))); // NOI18N
        ReturnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReturnButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseReleased(evt);
            }
        });
        Panel_2.add(ReturnButton);
        ReturnButton.setBounds(0, 0, 50, 50);

        SignUpLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sign_Up.png"))); // NOI18N
        SignUpLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUpLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SignUpLabel2MouseReleased(evt);
            }
        });
        Panel_2.add(SignUpLabel2);
        SignUpLabel2.setBounds(470, 330, 100, 40);

        WrongLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel1.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel1.setText("*");
        Panel_2.add(WrongLabel1);
        WrongLabel1.setBounds(260, 80, 10, 20);
        Panel_2.add(jTextField1);
        jTextField1.setBounds(130, 80, 150, 35);

        WrongLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel3.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel3.setText("*");
        Panel_2.add(WrongLabel3);
        WrongLabel3.setBounds(400, 130, 10, 20);
        Panel_2.add(jTextField3);
        jTextField3.setBounds(180, 130, 240, 35);

        WrongLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel2.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel2.setText("*");
        Panel_2.add(WrongLabel2);
        WrongLabel2.setBounds(550, 80, 10, 20);
        Panel_2.add(jTextField2);
        jTextField2.setBounds(420, 80, 150, 35);

        WrongLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel5.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel5.setText("*");
        Panel_2.add(WrongLabel5);
        WrongLabel5.setBounds(400, 210, 10, 20);
        Panel_2.add(jPasswordField1);
        jPasswordField1.setBounds(180, 210, 240, 35);

        WrongLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel4.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel4.setText("*");
        Panel_2.add(WrongLabel4);
        WrongLabel4.setBounds(400, 170, 10, 20);
        Panel_2.add(jTextField4);
        jTextField4.setBounds(180, 170, 240, 35);

        BackgroundLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackgroundLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NewBackground.jpg"))); // NOI18N
        Panel_2.add(BackgroundLabel2);
        BackgroundLabel2.setBounds(0, 0, 600, 400);

        Panel_1.setLayout(null);

        WrongLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel7.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel7.setText("*");
        Panel_1.add(WrongLabel7);
        WrongLabel7.setBounds(430, 200, 10, 20);

        SignUpButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUpButton1.setForeground(new java.awt.Color(204, 0, 0));
        SignUpButton1.setText("Sign Up");
        SignUpButton1.setContentAreaFilled(false);
        SignUpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButton1ActionPerformed(evt);
            }
        });
        Panel_1.add(SignUpButton1);
        SignUpButton1.setBounds(370, 350, 90, 30);

        PasswordLabel.setText("                                         Password");
        PasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordLabelMouseClicked(evt);
            }
        });
        Panel_1.add(PasswordLabel);
        PasswordLabel.setBounds(140, 200, 310, 30);

        WrongLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongLabel8.setForeground(new java.awt.Color(255, 0, 0));
        WrongLabel8.setText("*");
        Panel_1.add(WrongLabel8);
        WrongLabel8.setBounds(430, 140, 10, 20);

        PseudoLabel.setText("                                          Pseudo");
        PseudoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PseudoLabelMouseClicked(evt);
            }
        });
        PseudoLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PseudoLabelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PseudoLabelKeyTyped(evt);
            }
        });
        Panel_1.add(PseudoLabel);
        PseudoLabel.setBounds(140, 140, 310, 30);
        Panel_1.add(PseudoTextField);
        PseudoTextField.setBounds(140, 140, 310, 30);
        Panel_1.add(PasswordField);
        PasswordField.setBounds(140, 200, 310, 30);

        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-buttonClick.png"))); // NOI18N
        LoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoginLabelMouseReleased(evt);
            }
        });
        Panel_1.add(LoginLabel);
        LoginLabel.setBounds(240, 280, 100, 40);

        VisiblePasswordCheckBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VisiblePasswordCheckBox.setText("Show Password");
        VisiblePasswordCheckBox.setOpaque(false);
        VisiblePasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisiblePasswordCheckBoxActionPerformed(evt);
            }
        });
        Panel_1.add(VisiblePasswordCheckBox);
        VisiblePasswordCheckBox.setBounds(240, 230, 130, 23);

        ExitButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png"))); // NOI18N
        ExitButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitButtonLabelMouseReleased(evt);
            }
        });
        Panel_1.add(ExitButtonLabel);
        ExitButtonLabel.setBounds(550, 0, 50, 50);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstBackground.png"))); // NOI18N
        Panel_1.add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 600, 400);

        InvesibleTextField.setText("Invisible");
        Panel_1.add(InvesibleTextField);
        InvesibleTextField.setBounds(0, 0, 45, 20);

        Panel_3.setLayout(null);

        ExitButtonLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png"))); // NOI18N
        ExitButtonLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitButtonLabel1MouseReleased(evt);
            }
        });
        Panel_3.add(ExitButtonLabel1);
        ExitButtonLabel1.setBounds(550, 0, 50, 50);

        jLabel7.setFont(new java.awt.Font("Chiller", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Please Set Your Restaurant Informations");
        Panel_3.add(jLabel7);
        jLabel7.setBounds(140, 40, 330, 30);

        RestaurantNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RestaurantNameLabel.setText("Restaurant Name :");
        Panel_3.add(RestaurantNameLabel);
        RestaurantNameLabel.setBounds(50, 120, 140, 20);

        RestaurantAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RestaurantAddressLabel.setText("Restaurant Address :");
        Panel_3.add(RestaurantAddressLabel);
        RestaurantAddressLabel.setBounds(50, 160, 140, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Restaurant Phone Number :");
        Panel_3.add(jLabel10);
        jLabel10.setBounds(50, 200, 190, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Restaurant Site :");
        Panel_3.add(jLabel11);
        jLabel11.setBounds(50, 240, 140, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Description :");
        Panel_3.add(jLabel12);
        jLabel12.setBounds(50, 280, 140, 20);

        RestaurantNameTextField.setText("Tasty");
        Panel_3.add(RestaurantNameTextField);
        RestaurantNameTextField.setBounds(290, 110, 240, 35);

        jTextField6.setText("n°01 Tasty Street -Tasty");
        Panel_3.add(jTextField6);
        jTextField6.setBounds(290, 150, 240, 35);

        jTextField7.setText("+213 661 93 12 15 ");
        Panel_3.add(jTextField7);
        jTextField7.setBounds(290, 190, 240, 35);

        jTextField8.setText("WWW.TASTY.COM");
        Panel_3.add(jTextField8);
        jTextField8.setBounds(290, 230, 240, 35);

        jScrollPane2.setViewportView(jTextPane1);

        Panel_3.add(jScrollPane2);
        jScrollPane2.setBounds(290, 270, 240, 60);

        DoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Done3.png"))); // NOI18N
        DoneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoneLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoneLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DoneLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DoneLabelMouseReleased(evt);
            }
        });
        Panel_3.add(DoneLabel);
        DoneLabel.setBounds(270, 340, 50, 50);

        BackgroundLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background2.png"))); // NOI18N
        Panel_3.add(BackgroundLabel3);
        BackgroundLabel3.setBounds(0, 0, 600, 400);

        Panel_4.setPreferredSize(new java.awt.Dimension(600, 400));
        Panel_4.setLayout(null);

        ExitButtonLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png"))); // NOI18N
        ExitButtonLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitButtonLabel2MouseReleased(evt);
            }
        });
        DesktopPane.add(ExitButtonLabel2);
        ExitButtonLabel2.setBounds(550, 0, 50, 50);

        CamButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CamButton.png"))); // NOI18N
        CamButton.setContentAreaFilled(false);
        CamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamButtonActionPerformed(evt);
            }
        });
        DesktopPane.add(CamButton);
        CamButton.setBounds(550, 80, 50, 40);

        PhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PhotoPanel.png"))); // NOI18N
        DesktopPane.add(PhotoLabel);
        PhotoLabel.setBounds(0, 0, 600, 120);

        Panel_4.add(DesktopPane);
        DesktopPane.setBounds(0, 0, 600, 120);

        DetailPanel.setLayout(null);

        PlusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        PlusButton.setContentAreaFilled(false);
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });
        DetailPanel.add(PlusButton);
        PlusButton.setBounds(283, 0, 30, 30);

        DetailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PhotoPanel2.png"))); // NOI18N
        DetailPanel.add(DetailLabel);
        DetailLabel.setBounds(0, 0, 600, 90);

        Panel_4.add(DetailPanel);
        DetailPanel.setBounds(0, 120, 600, 30);

        RecentActionsLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        RecentActionsLabel.setForeground(new java.awt.Color(204, 0, 0));
        RecentActionsLabel.setText("Recent Actions");
        Panel_4.add(RecentActionsLabel);
        RecentActionsLabel.setBounds(0, 180, 110, 20);
        Panel_4.add(jSeparator1);
        jSeparator1.setBounds(0, 200, 130, 2);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Panel_4.add(jSeparator2);
        jSeparator2.setBounds(160, 150, 10, 250);

        Panel_5.setPreferredSize(new java.awt.Dimension(600, 400));
        Panel_5.setLayout(null);

        CategoryButton2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnacksButton.png"))); // NOI18N
        CategoryButton2Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryButton2LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryButton2LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryButton2LabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoryButton2LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CategoryButton2LabelMouseReleased(evt);
            }
        });
        Panel_5.add(CategoryButton2Label);
        CategoryButton2Label.setBounds(190, 160, 290, 50);

        ExitButtonLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png"))); // NOI18N
        ExitButtonLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitButtonLabel3MouseReleased(evt);
            }
        });
        Panel_5.add(ExitButtonLabel3);
        ExitButtonLabel3.setBounds(550, 0, 50, 50);

        CamButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CamButton.png"))); // NOI18N
        CamButton1.setContentAreaFilled(false);
        CamButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamButton1ActionPerformed(evt);
            }
        });
        Panel_5.add(CamButton1);
        CamButton1.setBounds(20, 40, 50, 40);

        CategoryButton3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DishesButton.png"))); // NOI18N
        CategoryButton3Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryButton3LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryButton3LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryButton3LabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoryButton3LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CategoryButton3LabelMouseReleased(evt);
            }
        });
        Panel_5.add(CategoryButton3Label);
        CategoryButton3Label.setBounds(190, 220, 290, 50);

        CategoryButton4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DessertButton.png"))); // NOI18N
        CategoryButton4Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryButton4LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryButton4LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryButton4LabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoryButton4LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CategoryButton4LabelMouseReleased(evt);
            }
        });
        Panel_5.add(CategoryButton4Label);
        CategoryButton4Label.setBounds(190, 280, 290, 50);
        Panel_5.add(ClientPhotoLabel);
        ClientPhotoLabel.setBounds(15, 35, 135, 140);

        CategoryButton5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DrinksButton.png"))); // NOI18N
        CategoryButton5Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryButton5LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryButton5LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryButton5LabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoryButton5LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CategoryButton5LabelMouseReleased(evt);
            }
        });
        Panel_5.add(CategoryButton5Label);
        CategoryButton5Label.setBounds(190, 340, 290, 50);

        CategoryButton1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PizzaButton.png"))); // NOI18N
        CategoryButton1Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryButton1LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryButton1LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryButton1LabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoryButton1LabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CategoryButton1LabelMouseReleased(evt);
            }
        });
        Panel_5.add(CategoryButton1Label);
        CategoryButton1Label.setBounds(190, 100, 290, 50);

        ClinetBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Client-background1.png"))); // NOI18N
        Panel_5.add(ClinetBackgroundLabel);
        ClinetBackgroundLabel.setBounds(0, 0, 600, 400);

        ClientDesktopPane.setPreferredSize(new java.awt.Dimension(130, 145));

        javax.swing.GroupLayout ClientDesktopPaneLayout = new javax.swing.GroupLayout(ClientDesktopPane);
        ClientDesktopPane.setLayout(ClientDesktopPaneLayout);
        ClientDesktopPaneLayout.setHorizontalGroup(
            ClientDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        ClientDesktopPaneLayout.setVerticalGroup(
            ClientDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        Panel_5.add(ClientDesktopPane);
        ClientDesktopPane.setBounds(15, 35, 133, 141);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(Panel_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(Panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PseudoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PseudoLabelMouseClicked
       
        PseudoLabel.setVisible(false);
    }//GEN-LAST:event_PseudoLabelMouseClicked

    private void PseudoLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PseudoLabelKeyPressed
        
        
    }//GEN-LAST:event_PseudoLabelKeyPressed

    private void PseudoLabelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PseudoLabelKeyTyped
        
        
    }//GEN-LAST:event_PseudoLabelKeyTyped

    private void PasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseClicked
        
        PasswordLabel.setVisible(false);
    }//GEN-LAST:event_PasswordLabelMouseClicked

    private void VisiblePasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisiblePasswordCheckBoxActionPerformed
       
        if (VisiblePasswordCheckBox.isSelected())
            PasswordField.setEchoChar((char)0);
        else
            PasswordField.setEchoChar('*');
    }//GEN-LAST:event_VisiblePasswordCheckBoxActionPerformed

    private void ExitButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabelMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_ExitButtonLabelMouseClicked

    private void ExitButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabelMouseEntered
        
        ExitButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button1.png")));
    }//GEN-LAST:event_ExitButtonLabelMouseEntered

    private void ExitButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabelMouseExited
       
        ExitButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabelMouseExited

    private void ExitButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabelMousePressed
       
        ExitButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png")));
    }//GEN-LAST:event_ExitButtonLabelMousePressed

    private void ExitButtonLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabelMouseReleased
        
        ExitButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabelMouseReleased

    private void SignUpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButton1ActionPerformed
         
        Panel_1.setVisible(false);
        Panel_2.setVisible(true);
        Panel_3.setVisible(false);
        
    }//GEN-LAST:event_SignUpButton1ActionPerformed

    private void ExitLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabel2MouseClicked
       
         System.exit(0);
    }//GEN-LAST:event_ExitLabel2MouseClicked

    private void ExitLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabel2MouseEntered
       
         ExitLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button1.png")));
    }//GEN-LAST:event_ExitLabel2MouseEntered

    private void ExitLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabel2MouseExited
       
         ExitLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitLabel2MouseExited

    private void ExitLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabel2MousePressed
      
        ExitLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png")));
    }//GEN-LAST:event_ExitLabel2MousePressed

    private void ExitLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabel2MouseReleased
      
        ExitLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitLabel2MouseReleased

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
       
        Panel_1.setVisible(true);
        Panel_2.setVisible(false); 
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void ReturnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseEntered
        
        ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return2.png")));
    }//GEN-LAST:event_ReturnButtonMouseEntered

    private void ReturnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseExited
        
         ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return.png")));
    }//GEN-LAST:event_ReturnButtonMouseExited

    private void ReturnButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMousePressed
        
         ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return3.png")));
    }//GEN-LAST:event_ReturnButtonMousePressed

    private void ReturnButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseReleased
        
         ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return.png")));
    }//GEN-LAST:event_ReturnButtonMouseReleased

    private void ExitButtonLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonLabel1MouseClicked

    private void ExitButtonLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel1MouseEntered
       ExitButtonLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button1.png")));
    }//GEN-LAST:event_ExitButtonLabel1MouseEntered

    private void ExitButtonLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel1MouseExited
        ExitButtonLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabel1MouseExited

    private void ExitButtonLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel1MousePressed
        ExitButtonLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png")));
    }//GEN-LAST:event_ExitButtonLabel1MousePressed

    private void ExitButtonLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel1MouseReleased
       ExitButtonLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabel1MouseReleased

    
    private void DoneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneLabelMouseClicked
        
        Panel_3.setVisible(false);
        Panel_4.setVisible(true);
       
    }//GEN-LAST:event_DoneLabelMouseClicked

    private void DoneLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneLabelMouseEntered
      DoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Done2.png")));
    }//GEN-LAST:event_DoneLabelMouseEntered

    private void DoneLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneLabelMouseExited
      DoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Done3.png")));
    }//GEN-LAST:event_DoneLabelMouseExited

    private void DoneLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneLabelMousePressed
      DoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Done.png")));
    }//GEN-LAST:event_DoneLabelMousePressed

    private void DoneLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneLabelMouseReleased
      DoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Done3.png")));
    }//GEN-LAST:event_DoneLabelMouseReleased

    private void SignUpLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabel2MouseClicked

        
       Connection Cnn = null ;
       ResultSet RS = null ;
       Statement ST  = null;
    if ((jTextField1.getText().length() != 0) && (jTextField2.getText().length() !=0) && (jTextField3.getText().length() !=0) && (jTextField4.getText().length() > 4) && (jPasswordField1.getText().length() > 6)){
        
        if (jPasswordField2.getText().toString().equals(jPasswordField1.getText().toString())){
       
       try {
           
            Cnn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tasty DB", "Zinou", "Zinou");
            ST  = Cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM USERS";
            
            RS = ST.executeQuery(SQL);
            RS.moveToInsertRow();
            
            RS.updateString(1, jTextField1.getText() );
            RS.updateString(2, jTextField2.getText() );
            RS.updateString(3, jTextField3.getText());
            RS.updateString(4, jPasswordField1.getText());
            RS.updateString(5, jTextField4.getText());
            RS.updateString(6, DivisionComboBox.getSelectedItem().toString());
            
            RS.insertRow();
            RS.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Tasty_Frame.class.getName()).log(Level.SEVERE, null, ex);
    }                                    
        
        Panel_2.setVisible(false);
        if (DivisionComboBox.getSelectedItem().toString() == "Restaurant"){
        Panel_3.setVisible(true);}
        else {
            Panel_4.setVisible(false);
            Panel_5.setVisible(true);
        }
        }else{
            WrongLabel5.setVisible(true);
            WrongLabel6.setVisible(true);
        } 
    }//GEN-LAST:event_SignUpLabel2MouseClicked
    else {
        if (jTextField1.getText().length() == 0)
            WrongLabel1.setVisible(true);
        if (jTextField2.getText().length() == 0)
            WrongLabel2.setVisible(true);
        if (jTextField3.getText().length() == 0)
            WrongLabel3.setVisible(true);
        if (jTextField4.getText().length() <= 4)
            WrongLabel4.setVisible(true);
        if (jPasswordField1.getText().length() <= 6){
            WrongLabel5.setVisible(true);
            WrongLabel6.setVisible(true);
        }
    }
    }
    private void SignUpLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabel2MouseEntered
        SignUpLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sign_Up2.png")));
    }//GEN-LAST:event_SignUpLabel2MouseEntered

    private void SignUpLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabel2MouseExited
        SignUpLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sign_Up.png")));
    }//GEN-LAST:event_SignUpLabel2MouseExited

    private void SignUpLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabel2MousePressed
        SignUpLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sign_Up3.png")));
    }//GEN-LAST:event_SignUpLabel2MousePressed

    private void SignUpLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabel2MouseReleased
        SignUpLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sign_Up.png")));
    }//GEN-LAST:event_SignUpLabel2MouseReleased

    private void ExitButtonLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonLabel2MouseClicked

    private void ExitButtonLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel2MouseEntered
        ExitButtonLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button1.png")));
    }//GEN-LAST:event_ExitButtonLabel2MouseEntered

    private void ExitButtonLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel2MouseExited
        ExitButtonLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabel2MouseExited

    private void ExitButtonLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel2MousePressed
        ExitButtonLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png")));
    }//GEN-LAST:event_ExitButtonLabel2MousePressed

    private void ExitButtonLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel2MouseReleased
        ExitButtonLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabel2MouseReleased

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed
        
        if(DetailPanel.getHeight() != 120)
            DetailPanel.setBounds(0, 120, 600, 120);
        else
            DetailPanel.setBounds(0, 120, 600, 30);
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void CamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamButtonActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        String fileName = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(PhotoLabel.getWidth(), PhotoLabel.getHeight(), Image.SCALE_DEFAULT));
        PhotoLabel.setIcon(imageicon);
        
        
        try {
            
            File image = new File(fileName);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte[1024];
            
            for (int number; (number = fix.read(buf)) != -1;)
                
                bos.write(buf, 0, number);
            
            
            byte[] RestaurantImage = bos.toByteArray ();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tasty_Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tasty_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CamButtonActionPerformed

    private void ExitButtonLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel3MouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_ExitButtonLabel3MouseClicked

    private void ExitButtonLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel3MouseEntered
       
        ExitButtonLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button1.png")));
    }//GEN-LAST:event_ExitButtonLabel3MouseEntered

    private void ExitButtonLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel3MouseExited

        ExitButtonLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabel3MouseExited

    private void ExitButtonLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel3MousePressed
       
        ExitButtonLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button2.png")));
    }//GEN-LAST:event_ExitButtonLabel3MousePressed

    private void ExitButtonLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonLabel3MouseReleased
        
        ExitButtonLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_button3.png")));
    }//GEN-LAST:event_ExitButtonLabel3MouseReleased

    private void CamButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamButton1ActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        String fileName = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(ClientPhotoLabel.getWidth(), ClientPhotoLabel.getHeight(), Image.SCALE_DEFAULT));
        ClientPhotoLabel.setIcon(imageicon);
    }//GEN-LAST:event_CamButton1ActionPerformed

    private void CategoryButton1LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton1LabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryButton1LabelMouseClicked

    private void CategoryButton1LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton1LabelMouseEntered
        
        CategoryButton1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PizzaButtonTouch.png")));
    }//GEN-LAST:event_CategoryButton1LabelMouseEntered

    private void CategoryButton1LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton1LabelMouseExited
        
        CategoryButton1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PizzaButton.png")));
    }//GEN-LAST:event_CategoryButton1LabelMouseExited

    private void CategoryButton1LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton1LabelMousePressed
       
        CategoryButton1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PizzaButtonClick.png")));
    }//GEN-LAST:event_CategoryButton1LabelMousePressed

    private void CategoryButton1LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton1LabelMouseReleased
       
        CategoryButton1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PizzaButton.png")));
    }//GEN-LAST:event_CategoryButton1LabelMouseReleased

    private void CategoryButton2LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton2LabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryButton2LabelMouseClicked

    private void CategoryButton2LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton2LabelMouseEntered

        CategoryButton2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnacksButtonTouch.png"))); 
    }//GEN-LAST:event_CategoryButton2LabelMouseEntered

    private void CategoryButton2LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton2LabelMouseExited
       
        CategoryButton2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnacksButton.png")));
    }//GEN-LAST:event_CategoryButton2LabelMouseExited

    private void CategoryButton2LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton2LabelMousePressed
       
        CategoryButton2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnacksButtonClick.png")));
    }//GEN-LAST:event_CategoryButton2LabelMousePressed

    private void CategoryButton2LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton2LabelMouseReleased
       
        CategoryButton2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnacksButton.png")));
    }//GEN-LAST:event_CategoryButton2LabelMouseReleased

    private void CategoryButton3LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton3LabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryButton3LabelMouseClicked

    private void CategoryButton3LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton3LabelMouseEntered

        CategoryButton3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DishesButtonTouch.png")));
    }//GEN-LAST:event_CategoryButton3LabelMouseEntered

    private void CategoryButton3LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton3LabelMouseExited
        
        CategoryButton3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DishesButton.png")));
    }//GEN-LAST:event_CategoryButton3LabelMouseExited

    private void CategoryButton3LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton3LabelMousePressed
        
        CategoryButton3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DishesButtonClick.png")));
    }//GEN-LAST:event_CategoryButton3LabelMousePressed

    private void CategoryButton3LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton3LabelMouseReleased
       
        CategoryButton3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DishesButton.png")));
    }//GEN-LAST:event_CategoryButton3LabelMouseReleased

    private void CategoryButton4LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton4LabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryButton4LabelMouseClicked

    private void CategoryButton4LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton4LabelMouseEntered
       CategoryButton4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DessertButtonTouch.png")));
    }//GEN-LAST:event_CategoryButton4LabelMouseEntered

    private void CategoryButton4LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton4LabelMouseExited
       
         CategoryButton4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DessertButton.png")));
    }//GEN-LAST:event_CategoryButton4LabelMouseExited

    private void CategoryButton4LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton4LabelMousePressed
        
         CategoryButton4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DessertButtonClick.png")));
    }//GEN-LAST:event_CategoryButton4LabelMousePressed

    private void CategoryButton4LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton4LabelMouseReleased
       
         CategoryButton4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DessertButton.png")));
    }//GEN-LAST:event_CategoryButton4LabelMouseReleased

    private void CategoryButton5LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton5LabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryButton5LabelMouseClicked

    private void CategoryButton5LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton5LabelMouseEntered
       
         CategoryButton5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DrinksButtonTouch.png")));
    }//GEN-LAST:event_CategoryButton5LabelMouseEntered

    private void CategoryButton5LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton5LabelMouseExited
       
        CategoryButton5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DrinksButton.png")));
    }//GEN-LAST:event_CategoryButton5LabelMouseExited

    private void CategoryButton5LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton5LabelMousePressed
       
        CategoryButton5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DrinksButtonClick.png")));
    }//GEN-LAST:event_CategoryButton5LabelMousePressed

    private void CategoryButton5LabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryButton5LabelMouseReleased
        
        CategoryButton5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DrinksButton.png")));
    }//GEN-LAST:event_CategoryButton5LabelMouseReleased

    private void LoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseClicked
       
         Connection Cnn = null ;
         ResultSet RS = null ;
         PreparedStatement ST  = null;
        
        try {
            Cnn = DriverManager.getConnection("jdbc:derby://localhost:1527/Tasty DB", "Zinou", "Zinou");
            String SQL = "SELECT * FROM USERS WHERE PSEUDO =? AND PASSWORD =?";
            ST  = Cnn.prepareStatement(SQL);
            
            ST.setString(1, PseudoTextField.getText());
            ST.setString(2, PasswordField.getText());
            
            RS = ST.executeQuery();
            
            if (RS.next()&&(PseudoTextField.getText().length() != 0)&&(PasswordField.getText().length() != 0)){
              
             if(RS.getString("DIVISION").equals("Client")){
                 Panel_1.setVisible(false);
                 Panel_2.setVisible(false);
                 Panel_3.setVisible(false);
                 Panel_4.setVisible(false);
                 Panel_5.setVisible(true);
             }   
             else {
                 Panel_1.setVisible(false);
                 Panel_2.setVisible(false);
                 Panel_3.setVisible(false);
                 Panel_4.setVisible(true);
             }
             
            }
            else{
               WrongLabel7.setVisible(true);
               WrongLabel8.setVisible(true);
            }
         
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Tasty_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_LoginLabelMouseClicked

    private void LoginLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseEntered
       
        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-buttonTouch.png")));
    }//GEN-LAST:event_LoginLabelMouseEntered

    private void LoginLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseExited
       
        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-buttonClick.png")));
    }//GEN-LAST:event_LoginLabelMouseExited

    private void LoginLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMousePressed
        
        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-button.png")));
    }//GEN-LAST:event_LoginLabelMousePressed

    private void LoginLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseReleased
        
        LoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-buttonClick.png")));
    }//GEN-LAST:event_LoginLabelMouseReleased

    
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tasty_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tasty_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tasty_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tasty_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tasty_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel BackgroundLabel2;
    private javax.swing.JLabel BackgroundLabel3;
    private javax.swing.JButton CamButton;
    private javax.swing.JButton CamButton1;
    private javax.swing.JLabel CategoryButton1Label;
    private javax.swing.JLabel CategoryButton2Label;
    private javax.swing.JLabel CategoryButton3Label;
    private javax.swing.JLabel CategoryButton4Label;
    private javax.swing.JLabel CategoryButton5Label;
    private javax.swing.JDesktopPane ClientDesktopPane;
    private javax.swing.JLabel ClientPhotoLabel;
    private javax.swing.JLabel ClinetBackgroundLabel;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JLabel DetailLabel;
    private javax.swing.JPanel DetailPanel;
    private javax.swing.JComboBox<String> DivisionComboBox;
    private javax.swing.JLabel DoneLabel;
    private javax.swing.JLabel ExitButtonLabel;
    private javax.swing.JLabel ExitButtonLabel1;
    private javax.swing.JLabel ExitButtonLabel2;
    private javax.swing.JLabel ExitButtonLabel3;
    private javax.swing.JLabel ExitLabel2;
    private javax.swing.JTextField InvesibleTextField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel Panel_1;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JPanel Panel_3;
    private javax.swing.JPanel Panel_4;
    private javax.swing.JPanel Panel_5;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JButton PlusButton;
    private javax.swing.JLabel PseudoLabel;
    private javax.swing.JTextField PseudoTextField;
    private javax.swing.JLabel RecentActionsLabel;
    private javax.swing.JLabel RestaurantAddressLabel;
    private javax.swing.JLabel RestaurantNameLabel;
    private javax.swing.JTextField RestaurantNameTextField;
    private javax.swing.JLabel ReturnButton;
    private javax.swing.JButton SignUpButton1;
    private javax.swing.JLabel SignUpLabel2;
    private javax.swing.JCheckBox VisiblePasswordCheckBox;
    private javax.swing.JLabel WrongLabel1;
    private javax.swing.JLabel WrongLabel2;
    private javax.swing.JLabel WrongLabel3;
    private javax.swing.JLabel WrongLabel4;
    private javax.swing.JLabel WrongLabel5;
    private javax.swing.JLabel WrongLabel6;
    private javax.swing.JLabel WrongLabel7;
    private javax.swing.JLabel WrongLabel8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
