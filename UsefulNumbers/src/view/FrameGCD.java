package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import model.GCD;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameGCD extends Frame {

	private JFrame frame;
	private JLabel lblNewLabel_2;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private String theNumEntered1 ="";
	private String theNumEntered2 = "";
	private int theNumber1;
	private int theNumber2;
	private int id = 1;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGCD window = new FrameGCD();
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
	public FrameGCD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1111, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 1;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 1;
					textArea_1.setText(theNumEntered2);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton.setBounds(37, 190, 244, 100);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 4;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 4;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button.setBounds(37, 301, 244, 100);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 7;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 7;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_1.setBounds(37, 412, 244, 100);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 2;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 2;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_2.setBounds(291, 190, 244, 100);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 5;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 5;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_3.setBounds(291, 301, 244, 100);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 8;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 8;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_4.setBounds(291, 412, 244, 100);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 3;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 3;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_5.setBounds(545, 190, 244, 100);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 6;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 6;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_6.setBounds(545, 301, 244, 100);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 9;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 9;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_7.setBounds(545, 412, 244, 100);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("<--");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = 1;
				theNumEntered1 = theNumEntered1.substring(0, theNumEntered1.length() - 1);
				textArea.setText(theNumEntered1);
				
				theNumEntered2 = theNumEntered2.substring(0, theNumEntered2.length() - 1);
				textArea_1.setText(theNumEntered2);
				lblNewLabel_2.setText("");
				
				
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_8.setBounds(799, 190, 244, 100);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (id == 1) {
					theNumEntered1 = theNumEntered1 + 0;
					textArea.setText(theNumEntered1);

				}
				if (id == 2) {
					theNumEntered2 = theNumEntered2 + 0;
					textArea_1.setText(theNumEntered2);
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_9.setBounds(799, 301, 244, 100);
		frame.getContentPane().add(button_9);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id++;
				GCD gcd = new GCD();
				theNumber1 = Integer.parseInt(theNumEntered1);
				theNumber2 = Integer.parseInt(theNumEntered2);
				if (id == 3) {
					int num = gcd.gcd(theNumber1, theNumber2);
					lblNewLabel_2.setText("" + num) ;
					
				} 
				
				
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnEnter.setBounds(799, 412, 244, 100);
		frame.getContentPane().add(btnEnter);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
		textArea.setBounds(37, 60, 337, 100);
		frame.getContentPane().add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		textArea_1.setBounds(416, 60, 337, 100);
		frame.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("ENTER NUMBER 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(64, 11, 337, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterNumber = new JLabel("ENTER NUMBER 2");
		lblEnterNumber.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblEnterNumber.setBounds(436, 11, 337, 38);
		frame.getContentPane().add(lblEnterNumber);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(781, 64, 44, 87);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblGcd = new JLabel("GCD");
		lblGcd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGcd.setBounds(774, 50, 44, 58);
		frame.getContentPane().add(lblGcd);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(826, 57, 205, 101);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
