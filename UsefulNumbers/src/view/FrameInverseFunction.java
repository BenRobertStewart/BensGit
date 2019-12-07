package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.GCD;
import model.InverseCoefficients;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameInverseFunction extends Frame{

	private JFrame frame;
	private JLabel lblGcd;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel lblAnswer;
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
					FrameInverseFunction window = new FrameInverseFunction();
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
	public FrameInverseFunction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1248, 800);
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
		btnNewButton.setBounds(61, 279, 270, 142);
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
		button.setBounds(61, 432, 270, 142);
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
		button_1.setBounds(61, 585, 270, 142);
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
		button_2.setBounds(341, 279, 270, 142);
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
		button_3.setBounds(341, 432, 270, 142);
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
		button_4.setBounds(341, 585, 270, 142);
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
		button_5.setBounds(621, 279, 270, 142);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("<--");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = 1;
				theNumEntered1 = theNumEntered1.substring(0, theNumEntered1.length() - 1);
				textArea.setText(theNumEntered1);
				
				theNumEntered2 = theNumEntered2.substring(0, theNumEntered2.length() - 1);
				textArea_1.setText(theNumEntered2);
				lblGcd.setText("");
				lblAnswer.setText("");
				
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_6.setBounds(901, 279, 270, 142);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
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
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_7.setBounds(621, 432, 270, 142);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
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
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_8.setBounds(621, 585, 270, 142);
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
		button_9.setBounds(901, 432, 270, 142);
		frame.getContentPane().add(button_9);

		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id++;
				InverseCoefficients ic = new InverseCoefficients();
				GCD gcd = new GCD();
				theNumber1 = Integer.parseInt(theNumEntered1);
				theNumber2 = Integer.parseInt(theNumEntered2);
				if (id == 3) {
					ic.findCoefficient(theNumber1, theNumber2);
					int num1 = ic.getFirstCoefficient();
					int num2 = ic.getSecondCoefficient();
					int someGCD = gcd.gcd(theNumber1, theNumber2);
					lblGcd.setText("" + someGCD) ;
					lblAnswer.setText("(" + num1 + ")" + theNumber1 + " + " + " (" + num2 + ")" + theNumber2);
					
				} 
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnEnter.setBounds(901, 585, 270, 142);
		frame.getContentPane().add(btnEnter);

		lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblAnswer.setBounds(61, 114, 830, 154);
		frame.getContentPane().add(lblAnswer);

		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 50));
		textArea.setBounds(61, 11, 275, 89);
		frame.getContentPane().add(textArea);

		JLabel label = new JLabel("&");
		label.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label.setBounds(397, 39, 64, 41);
		frame.getContentPane().add(label);

		textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 50));
		textArea_1.setBounds(471, 11, 284, 92);
		frame.getContentPane().add(textArea_1);

		JLabel label_1 = new JLabel("=");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label_1.setBounds(901, 180, 46, 28);
		frame.getContentPane().add(label_1);

		lblGcd = new JLabel("GCD");
		lblGcd.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblGcd.setBounds(965, 114, 206, 154);
		frame.getContentPane().add(lblGcd);
	}
}
