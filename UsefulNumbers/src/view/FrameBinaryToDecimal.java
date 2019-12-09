package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;

import model.BinaryToDecimal;


import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameBinaryToDecimal {

	private JFrame frame;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private String theNumEntered ="";
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBinaryToDecimal window = new FrameBinaryToDecimal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameBinaryToDecimal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1042, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				theNumEntered = theNumEntered + 1;
				textArea.setText(theNumEntered);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button.setBounds(10, 293, 280, 322);
		frame.getContentPane().add(button);
		
		JButton button_9 = new JButton("<--");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered.substring(0, theNumEntered.length() - 1);
				textArea.setText(theNumEntered);
				
				BinaryToDecimal bd = new BinaryToDecimal();
				double num = bd.getDecimalOf(theNumEntered);
				lblNewLabel.setText("" + num);
				
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_9.setBounds(596, 293, 420, 167);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 0;
				textArea.setText(theNumEntered);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_10.setBounds(300, 293, 286, 322);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("ENTER");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				BinaryToDecimal bd = new BinaryToDecimal();
				double num = bd.getDecimalOf(theNumEntered);
				lblNewLabel.setText("" + num);
				
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_11.setBounds(596, 471, 420, 144);
		frame.getContentPane().add(button_11);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 50));
		textArea.setBounds(10, 11, 1006, 100);
		frame.getContentPane().add(textArea);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 182, 1006, 100);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("   =");
		label.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label.setBounds(418, 122, 112, 49);
		frame.getContentPane().add(label);
	}
}
