
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    LoginFrame() {
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
        showPassword.setBounds(150, 250, 150, 30);
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
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
//        NullPatternDemo n = new NullPatternDemo();
//        AbstractAdmin user = n.NPD();
//        String name= user.getName();
//        String pass= user.getPass();
        if (e.getSource() == loginButton) {
            String na = null;
            String passw = null;
            na = userTextField.getText();
            passw = passwordField.getText();
            AbstractAdmin admin = AdminFactory.getAdmin(na,passw);
            String names= admin.getName();
            String passs= admin.getPass();
           
            na = userTextField.getText();
            passw = passwordField.getText();
            if (na.equalsIgnoreCase(names) && passw.equalsIgnoreCase(passs)) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                setVisible(false);
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
    
    public static void main(String[] a) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
     LoginFrame frame = new LoginFrame();
      frame.setTitle("Login Form");
      frame.setVisible(true);
      frame.setBounds(10, 10, 370, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      Scanner scanner = new Scanner(System.in);
		File file = new File("C:\\Users\\USER\\Documents\\Quiz game\\src\\Monplaisir_-_02_-_Garage.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		String response = scanner.next();
		
    }
}




