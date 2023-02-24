import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Gameframe extends JFrame{
	
	GamePanel panel ;
	
	
	Gameframe(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}


	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Gameframe frame = new Gameframe();
		Scanner scanner = new Scanner(System.in);
		File file = new File("C:\\Users\\USER\\Documents\\Quiz game\\src\\Born a Rockstar - NEFFEX.wav");
		File file2 = new File("C:\\Users\\USER\\Documents\\Quiz game\\src\\Born a Rockstar - NEFFEX.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		String response = scanner.next();
		
	}
}
