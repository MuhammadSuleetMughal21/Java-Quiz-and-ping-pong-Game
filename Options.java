import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public  class Options extends JFrame implements ActionListener{
	JButton b1,b2,b3;	
	Options(){
			setBounds(200,200,200,200);
			getContentPane().setBackground(Color.black);
	        setLayout(null);
			setVisible(true);

			b1 = new JButton("Restart");
            b1.setBounds(0,0,120,35);
            b1.addActionListener(this);
            b1.setBackground(new Color(25,255,0));
            b1.setForeground(Color.black);
            add(b1);
            b2 = new JButton("Main Menu");
            b2.setBackground(new Color(25,255,0));
            b2.addActionListener(this);
            b2.setForeground(Color.black);
            b2.setBounds(0,50,120,35);
            add(b2);
            
            
            b3 = new JButton("Exit");
            b3.setBackground(new Color(25,255,0));
            b3.addActionListener(this);
            b3.setForeground(Color.black);
            b3.setBounds(0,100,120,35);
            add(b3);
			
			
		}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			setVisible(false);
			new quiz();
			}
		else if(ae.getSource()==b2) {
			setVisible(false);
			 new Rules_Fascade();
			 setVisible(false);
		}
		else {
			System.exit(0);
		}
		}
	
		
public static void main(String[] args) {
	new Options();
	
}
}
