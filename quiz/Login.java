package quiz;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8506704971763605975L;

	JTextField tfname;
	JButton rules, back;
	
	public Login() {
		
//		Background color
		getContentPane().setBackground(Color.WHITE);

//		Custom Layout
		setLayout(null);
		
//		Frame Title
		setTitle("Simple Minds | Login");
		
//		Layout Image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0,500, 480);
		add(image);
		
//		Frame size and location
		setSize(1000, 500);
		setLocationRelativeTo(null);
		
//		Layout heading
		JLabel heading = new JLabel("Simple Minds");
		heading.setBounds(640, 60, 300, 45);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 36));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
//		Input label
		JLabel name = new JLabel("Enter your name");
		name.setBounds(680, 150, 300, 16);
		name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		name.setForeground(new Color(30,144,254));
		add(name);
		
//		Text field
		tfname = new JTextField();
		tfname.setBounds(540, 200, 400, 25);
		tfname.setFont(new Font("Times New Roman", Font.PLAIN ,14));
		add(tfname);
		
//		Rules Button
		rules = new JButton("Rules");
		rules.setBounds(560, 260, 100, 25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
//		Back Button
		back = new JButton("Back");
		back.setBounds(820, 260, 100, 25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == rules) {
			String name = tfname.getText();
			setVisible(false);
			new Rules(name);
		} else if(ae.getSource() == back) {
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		new Login();

	}

}
