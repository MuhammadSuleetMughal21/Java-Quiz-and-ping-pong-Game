



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame  implements ActionListener {

	
	
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton resetButton = new JButton("Reset");


    Login() {
    	setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        JLabel l1 = new JLabel("Login To PLAY!!");
        l1.setBounds(20,50,700,30);
        l1.setFont(new Font("MV  Boli",Font.BOLD,25));
        l1.setForeground(Color.WHITE);
        add(l1);
        ImageIcon background_image = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\Quiz game\\src\\icons\\l.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(400, 600, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image,JLabel.CENTER);
       
        background.setBounds(0, 0, 370, 600);
        add(background);
        setResizable(true);
        setVisible(true);
    }

    public void setLayoutManager() {
        container.setLayout(null);
        container.setBackground(Color.PINK);
        showPassword.setBackground(Color.BLACK);
        showPassword.setForeground(Color.WHITE);
        userLabel.setForeground(Color.WHITE);
        passwordLabel.setForeground(Color.WHITE);
    }

    public void setLocationAndSize() {
        
    	userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 265, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        showPassword.addActionListener(this);
        resetButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            setVisible(false);
           if (userText.equalsIgnoreCase("Taha.187.ssuet") && pwdText.equalsIgnoreCase("ssuet98")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new Rules_Fascade();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }




   public static void main(String[] a) {
        Login frame = new Login();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
 