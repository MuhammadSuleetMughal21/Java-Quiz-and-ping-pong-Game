import java.awt.event.*;
	import java.awt.*;
	import javax.swing.*;
	import java.awt.Image;
	public class Level2 implements ActionListener{
		
		
		
		String [] question1 = {		
									
									"What is JRE in java?",
									"what is JVM in java?",
									"What is JDK in java?",
									"Types of looping in java?"
				
								};
		
		
		
		String [] [] options1= {
									
									{"Java Runtime Enviroment","Java Result Element","Java Runtime Element","Java Recycle Enviroment"},
									{"Java Virtual Mode","Java Virtual Machine","Java Vision Mass","Java Voice Mail"},
									{"Java Design Kit","Java Decoupling kit","Java Development kit","Java Decoding kit"},
									{"Three Types","Two Types","Option b","Option a"}
								};
		
		char answers1[] = {
							'A',
							'B',
							'C',
							'D'
							};
		
		char guess;
		char answer;
		int index;
		int correct_guesses = 0;
		int total_questions = question1.length;
		int result;
		int seconds = 10;
		
		JFrame frame = new JFrame();
		JTextField textfield = new JTextField();
		JTextArea textarea = new JTextArea();
		JButton buttonA = new JButton();
		JButton buttonB = new JButton();
		JButton buttonC = new JButton();
		JButton buttonD = new JButton();
		JButton buttonE = new JButton();
		JLabel Answer_labelA = new JLabel();
		JLabel Answer_labelB = new JLabel();
		JLabel Answer_labelC = new JLabel();
		JLabel Answer_labelD = new JLabel();
		
		
		
		
		JLabel Time_label = new JLabel();
		JLabel Seconds_left = new JLabel();
		JTextField number_right = new JTextField();
		JTextField percentage = new JTextField();
		JTextField percent = new JTextField();
	 	Timer timer = new Timer(1000, new ActionListener() {
	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			seconds--;
	 			Seconds_left.setText(String.valueOf(seconds));
	 			if(seconds<=0) {
	 				displayanswer();
	 			}
	 		}
	 	});
		public Level2() {
	 		
	 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		frame.setSize(800,650);
	 		frame.getContentPane().setBackground(new Color(50,50,50));
			
			frame.setLayout(null);
			frame.setResizable(true);
			
			textfield.setBounds(0,0,650,50);
			textfield.setBackground(new Color(25,25,25));
			textfield.setForeground(new Color(25,255,0));
			textfield.setFont(new Font("Ink Free",Font.BOLD,30));
			textfield.setBorder(BorderFactory.createBevelBorder(1));
			textfield.setHorizontalAlignment(JTextField.CENTER);
			textfield.setEditable(false);
			
			textarea.setBounds(0,50,650,50);
			textarea.setLineWrap(true);
			textarea.setWrapStyleWord(true);
			textarea.setBackground(new Color(25,25,25));
			textarea.setForeground(new Color(25,255,0));
			textarea.setFont(new Font("Ink Free",Font.BOLD,25));
			textarea.setBorder(BorderFactory.createBevelBorder(1));
			textarea.setEditable(false);
			
			
			buttonA.setBounds(0,100,100,100);
			buttonA.setFont(new Font("MV Boli",Font.BOLD,35));
			buttonA.setFocusable(false);
			buttonA.addActionListener(this);
			buttonA.setText("A");
			
			buttonB.setBounds(0,200,100,100);
			buttonB.setFont(new Font("MV Boli",Font.BOLD,35));
			buttonB.setFocusable(false);
			buttonB.addActionListener(this);
			buttonB.setText("B");
			
			buttonC.setBounds(0,300,100,100);
			buttonC.setFont(new Font("MV Boli",Font.BOLD,35));
			buttonC.setFocusable(false);
			buttonC.addActionListener(this);
			buttonC.setText("C");
			
			buttonD.setBounds(0,400,100,100);
			buttonD.setFont(new Font("MV Boli",Font.BOLD,35));
			buttonD.setFocusable(false);
			buttonD.addActionListener(this);
			buttonD.setText("D");
			
			buttonE.setBounds(535,90,100,25);
			buttonE.setFont(new Font("MV Boli",Font.BOLD,20));
			buttonE.setForeground(new Color(50,50,50));
			buttonE.setBackground(new Color(25,255,0));
			buttonE.setFocusable(false);
			buttonE.addActionListener(this);
			buttonE.setBorder(null);
			buttonE.setBorder(BorderFactory.createBevelBorder(1));
			buttonE.setText("Next");
			
			
			Answer_labelA.setBounds(125,100,500,100);
			Answer_labelA.setBackground(new Color(50,50,50));
			Answer_labelA.setForeground(new Color(25,255,0));
			Answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35));
			
			
			Answer_labelB.setBounds(125,200,500,100);
			Answer_labelB.setBackground(new Color(50,50,50));
			Answer_labelB.setForeground(new Color(25,255,0));
			Answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35));
			
			
			Answer_labelC.setBounds(125,300,500,100);
			Answer_labelC.setBackground(new Color(50,50,50));
			Answer_labelC.setForeground(new Color(25,255,0));
			Answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35));
			
			
			Answer_labelD.setBounds(125,400,500,100);
			Answer_labelD.setBackground(new Color(50,50,50));
			Answer_labelD.setForeground(new Color(25,255,0));
			Answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,35));
			
			
			
			
			
			Seconds_left.setBounds(535,510,100,100);
			Seconds_left.setBackground(new Color(25,25,25));
			Seconds_left.setForeground(new Color(255,0,0));
			Seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
			Seconds_left.setBorder(BorderFactory.createBevelBorder(1));
			Seconds_left.setOpaque(true);
			Seconds_left.setHorizontalAlignment(JTextField.CENTER);
			Seconds_left.setText(String.valueOf(seconds));
			
			Time_label.setBounds(535,475,100,25);
			Time_label.setBackground(new Color(50,50,50));
			Time_label.setForeground(new Color(255,0,0));
			Time_label.setHorizontalAlignment(JTextField.CENTER);
			Time_label.setFont(new Font("MV Boli",Font.PLAIN,20));
			Time_label.setText("timer >:D");
		
			number_right.setBounds(225,225,200,100);
			number_right.setBackground(new Color(25,25,25));
			number_right.setForeground(new Color(25,255,0));
			number_right.setHorizontalAlignment(JTextField.CENTER);
			number_right.setFont(new Font("MV Boli",Font.BOLD,50));
			number_right.setBorder(BorderFactory.createBevelBorder(1));
			number_right.setEditable(false);
			
			percentage.setBounds(225,325,200,100);
			percentage.setBackground(new Color(25,25,25));
			percentage.setForeground(new Color(25,255,0));
			percentage.setHorizontalAlignment(JTextField.CENTER);
			percentage.setFont(new Font("MV Boli",Font.BOLD,50));
			percentage.setBorder(BorderFactory.createBevelBorder(1));
			percentage.setEditable(false);
			
			
			
			frame.add(Time_label);
			frame.add(Seconds_left);
			frame.add(Answer_labelA);
			frame.add(Answer_labelB);
			frame.add(Answer_labelC);
			frame.add(Answer_labelD);
			
			frame.add(buttonA);
			frame.add(buttonB);
			frame.add(buttonC);
			frame.add(buttonD);
			
			frame.add(textarea);
			frame.add(textfield);
			frame.setVisible(true);
			
			nextquestion();
			

		
		
		}

	public void nextquestion() {
		if(index>=total_questions) {
			result();
		}
		else {
			
			
			textfield.setText("Question"+(index+1));
			textarea.setText(question1[index]);
			Answer_labelA.setText(options1[index][0]);
			Answer_labelB.setText(options1[index][1]);
			Answer_labelC.setText(options1[index][2]);
			Answer_labelD.setText(options1[index][3]);
			timer.start(); 
			}
			
			
		}
		


	@Override
	public void actionPerformed(ActionEvent e) {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		
		if(e.getSource()==buttonE) {
			frame.setVisible(false);
			new Level3();
		}
		if (e.getSource()==buttonA) {
			answer = 'A';
			if(answer == answers1[index]) {
				correct_guesses++;
			}
			
			
		}
		if (e.getSource()==buttonB) {
			answer = 'B';
			if(answer == answers1[index]) {
				correct_guesses++;
			}
			
			
		}
		if (e.getSource()==buttonC) {
			answer = 'C';
			if(answer == answers1[index]) {
				correct_guesses++;
			}
			
			
		}
		if (e.getSource()==buttonD) {
			answer = 'D';
			if(answer == answers1[index]) {
				correct_guesses++;
			}
		
			
		}
	displayanswer();	
	}
	public void displayanswer() {
		timer.stop();
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		
		
		
		if(answers1[index]!='A') 
			Answer_labelA.setForeground(new Color(255,0,0));
		if(answers1[index]!='B') 
			Answer_labelB.setForeground(new Color(255,0,0));
		if(answers1[index]!='C') 
			Answer_labelC.setForeground(new Color(255,0,0));
		if(answers1[index]!='D') 
			Answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Answer_labelA.setForeground(new Color(25,255,0));
				Answer_labelB.setForeground(new Color(25,255,0));
				Answer_labelC.setForeground(new Color(25,255,0));
				Answer_labelD.setForeground(new Color(25,255,0));
				
				answer = ' ';
				seconds = 10;
				Seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextquestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}




	public void result() {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		result = (int)((correct_guesses/(double)total_questions)*100);
		textfield.setText("RESULTS!");
		textarea.setText("");
		Answer_labelA.setText("");
		Answer_labelB.setText("");
		Answer_labelC.setText("");
		Answer_labelD.setText("");
		

		if(correct_guesses==total_questions) {
			textarea.setText("New Record.!!");
		}
		else if (correct_guesses == 3) {
			textarea.setText("30 points");
		}
		
		else if (correct_guesses == 2) {
			textarea.setText("20 points");
		}
		else if (correct_guesses == 1) {
			textarea.setText("10 points");
		}
		else {
			textarea.setText("Nice Try!!");
		}
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		frame.add(buttonE);
		frame.add(number_right);
		frame.add(percentage);
		
	}


}
