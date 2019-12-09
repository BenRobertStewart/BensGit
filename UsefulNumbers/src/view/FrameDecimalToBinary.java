package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;

import model.DecimalToBinary;


import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameDecimalToBinary extends Frame{

	private JFrame frame;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private String theNumEntered ="";
	private int theNumber;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDecimalToBinary window = new FrameDecimalToBinary();
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
	public FrameDecimalToBinary() {
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
		button.setBounds(10, 293, 244, 100);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 4;
				textArea.setText(theNumEntered);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_1.setBounds(10, 404, 244, 100);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 7;
				textArea.setText(theNumEntered);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_2.setBounds(10, 515, 244, 100);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 2;
				textArea.setText(theNumEntered);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_3.setBounds(264, 293, 244, 100);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 5;
				textArea.setText(theNumEntered);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_4.setBounds(264, 404, 244, 100);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 8;
				textArea.setText(theNumEntered);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_5.setBounds(264, 515, 244, 100);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 3;
				textArea.setText(theNumEntered);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_6.setBounds(518, 293, 244, 100);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 6;
				textArea.setText(theNumEntered);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_7.setBounds(518, 404, 244, 100);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 9;
				textArea.setText(theNumEntered);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_8.setBounds(518, 515, 244, 100);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("<--");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (theNumEntered.length() > 1) {
					theNumEntered = theNumEntered.substring(0, theNumEntered.length() - 1);
				} else {
					theNumEntered = "";
				}
				textArea.setText(theNumEntered);
				theNumber = Integer.parseInt(theNumEntered);
				DecimalToBinary db = new DecimalToBinary();
				String num = db.getBinaryOf(theNumber);
				lblNewLabel.setText(num);
				if(theNumEntered.equals("") || theNumEntered.equals("0")) {
					lblNewLabel.setText("0");
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_9.setBounds(772, 293, 244, 100);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 0;
				textArea.setText(theNumEntered);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_10.setBounds(772, 404, 244, 100);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("ENTER");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumber = Integer.parseInt(theNumEntered);
				DecimalToBinary db = new DecimalToBinary();
				String num = db.getBinaryOf(theNumber);
				lblNewLabel.setText(num);
				if(theNumEntered.equals("") || theNumEntered.equals("0")) {
					lblNewLabel.setText("0");
				}
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_11.setBounds(772, 515, 244, 100);
		frame.getContentPane().add(button_11);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 50));
		textArea.setBounds(10, 11, 1006, 100);
		frame.getContentPane().add(textArea);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 182, 1006, 100);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("  =");
		label.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label.setBounds(418, 122, 112, 49);
		frame.getContentPane().add(label);
	}
}
