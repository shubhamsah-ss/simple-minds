package quiz;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Score extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3008531799764990259L;

	JButton submit;
	
	public Score(String name, int score) {
		
//		Frame size and location
		setBounds(400,150,750,550);
		
//		Custom Layout
		setLayout(null);
		
//		Background color
		getContentPane().setBackground(Color.WHITE);
		
//		Banner Image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,150,300, 240);
		add(image);
		
//		Frame Title
		setTitle("Simple Minds | " + name + " | Score");
		
		JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds!");
		heading.setBounds(45,30,700,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN, 26));
		add(heading);
		
		JLabel score_label = new JLabel("Your score is " + score + ".");
		score_label.setBounds(450,200,300, 30);
		score_label.setFont(new Font("Tahoma",Font.PLAIN, 26));
		add(score_label);
		
		submit = new JButton("Play Again");
        submit.setBounds(480,270,120, 30);
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFocusable(false);
        
        add(submit);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Score("User", 0);

	}

	
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
		
	}

}
