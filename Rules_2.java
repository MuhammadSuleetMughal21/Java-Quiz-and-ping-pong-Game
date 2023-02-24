
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Rules_2 extends JFrame implements ActionListener{
	JButton b1;	
	Rules_2(){
			setBounds(600,200,800,525);
			getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
			setVisible(true);
			
			 b1 = new JButton("Lets Go!");
             b1.setBounds(600,400,120,35);
             b1.addActionListener(this);
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.setBorder(BorderFactory.createLineBorder(Color.blue));
             add(b1);
			
			 JLabel l1 = new JLabel("Instructions for PingPong");
             l1.setBounds(20,50,700,30);
             l1.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
             l1.setForeground(Color.white);
             add(l1);
             
             JLabel l2 = new JLabel("");
             l2.setBounds(50,100,500,350);
             l2.setFont(new Font("MV Boli",Font.PLAIN,15));
             l2.setForeground(Color.WHITE);
             l2.setText(
            		 "<html>"+
            				 "  "+"<br><br>"+
            				 "1. Read every question very carefully" + "<br><br>"+
            				 "2. Presence of mind and quick reponse will help you out" + "<br><br>"+
            				 "3. If any player scored 5 points will be considered as a winner" + "<br><br>"+
            				 "4. Hope you'll enjoy the game" + "<br><br>"+
            				 "____________________GOODLUCK!!!_______________"+"<br><br>"+
            	"<html>"
            		 );
             add(l2);
             ImageIcon background_image = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\Quiz game\\src\\icons\\back.jpg");
             Image img = background_image.getImage();
             Image temp_img = img.getScaledInstance(800, 525, Image.SCALE_SMOOTH);
             background_image = new ImageIcon(temp_img);
             JLabel background = new JLabel("",background_image,JLabel.CENTER);
            
             background.setBounds(0,0,800,525);
             add(background);
             setResizable(false);
             setVisible(true);
             
		}
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				setVisible(false);
				new Gameframe();
				
			}
		}
		


public static void main(String[] args) {
	new Rule();
}

}
