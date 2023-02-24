import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
public class Rules_Fascade extends JFrame implements ActionListener{
	JTextField t1;
	JButton  b1,b2,b3;		
	Rules_Fascade(){
		  
				setBounds(400,200,500,400);
				getContentPane().setBackground(Color.LIGHT_GRAY);
		        setLayout(null);
				setVisible(true);
				
				 b1 = new JButton("Start");
                 b1.setBounds(100,200,120,35);
                 b1.addActionListener(this);
                 b1.setBackground(Color.BLACK);
                 b1.setForeground(Color.WHITE);
                 b1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                 add(b1);
                 b2 = new JButton("Quit");
                 b2.setBackground(Color.BLACK);
                 b2.addActionListener(this);
                 b2.setForeground(Color.WHITE);
                 b2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                 b2.setBounds(250,200,120,35);
                 add(b2);
                 b3 = new JButton("PingPong");
                 b3.setBackground(Color.BLACK);
                 b3.addActionListener(this);
                 b3.setForeground(Color.WHITE);
                 b3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                 b3.setBounds(100,250,120,35);
                 add(b3);
                 
                 
                 JLabel l1 = new JLabel("WELCOME TO QUIZ");
                 l1.setBounds(150,30,400,50);
                 l1.setFont(new Font("MV Boli",Font.BOLD,25));
                 l1.setForeground(Color.WHITE);
                 add(l1);
                 
                 JLabel l2 = new JLabel("1. Press Start for Quiz");
                 l2.setBounds(50,70,300,50);
                 l2.setFont(new Font("Viner Hand ITC",Font.BOLD,15));
                 l2.setForeground(Color.WHITE);
                 add(l2);
                 
                 JLabel l3 = new JLabel("2. Press pingpong for pingpong");
                 l3.setBounds(50,95,300,50);
                 l3.setFont(new Font("Viner Hand ITC",Font.BOLD,15));
                 l3.setForeground(Color.WHITE);
                 add(l3);
                 JLabel l4 = new JLabel("3. Press Quit for Exit");
                 l4.setBounds(50,120,300,50);
                 l4.setFont(new Font("Viner Hand ITC",Font.BOLD,15));
                 l4.setForeground(Color.WHITE);
                 add(l4);
                 ImageIcon background_image = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\Quiz game\\src\\icons\\back.jpg");
                 Image img = background_image.getImage();
                 Image temp_img = img.getScaledInstance(500, 700, Image.SCALE_SMOOTH);
                 background_image = new ImageIcon(temp_img);
                 JLabel background = new JLabel("",background_image,JLabel.CENTER);
                
                 background.setBounds(0, 0, 500, 700);
                 add(background);
                 setResizable(false);
                 setVisible(true);
			}
			
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1 ) {
			setVisible(false);
			new Rule();
		
		}
		else if(ae.getSource() == b3 ) {
			setVisible(false);
			new Rules_2();
		
		}
		
		else {
			System.exit(0);
		}
		
		
	}
			public static void main(String[] args) {
				new Rules_Fascade();
			}
}
