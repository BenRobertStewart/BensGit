package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.Primes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FramePrimes extends Frame{

	private JFrame frame;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private String theNumEntered = "";
	private int theNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrimes window = new FramePrimes();
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
	public FramePrimes() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1114, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				theNumEntered = theNumEntered + 1;
				textArea.setText(theNumEntered);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton.setBounds(10, 168, 231, 114);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				theNumEntered = theNumEntered + 4;
				textArea.setText(theNumEntered);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button.setBounds(10, 293, 231, 114);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 7;
				textArea.setText(theNumEntered);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_1.setBounds(10, 418, 231, 114);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 2;
				textArea.setText(theNumEntered);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_2.setBounds(270, 168, 231, 114);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 5;
				textArea.setText(theNumEntered);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_3.setBounds(270, 293, 231, 114);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 8;
				textArea.setText(theNumEntered);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_4.setBounds(270, 418, 231, 114);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("3");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 3;
				textArea.setText(theNumEntered);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_5.setBounds(539, 168, 231, 114);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 6;
				textArea.setText(theNumEntered);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_6.setBounds(539, 293, 231, 114);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 9;
				textArea.setText(theNumEntered);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_7.setBounds(539, 418, 231, 114);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered + 0;
				textArea.setText(theNumEntered);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_8.setBounds(804, 293, 261, 114);
		frame.getContentPane().add(button_8);

		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumber = Integer.parseInt(theNumEntered);
				Primes p = new Primes();
				if (p.isPrime(theNumber)) {
					lblNewLabel.setText("PRIME");
				} else {
					lblNewLabel.setText("NOT PRIME");
				}

			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnEnter.setBounds(804, 418, 261, 114);
		frame.getContentPane().add(btnEnter);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(856, 19, 217, 136);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("    =");
		label.setFont(new Font("Tahoma", Font.PLAIN, 45));
		label.setBounds(719, 37, 95, 90);
		frame.getContentPane().add(label);

		textArea = new JTextArea();
		
	
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 50));
		textArea.setBounds(12, 17, 758, 136);
		frame.getContentPane().add(textArea);
		
		JButton button_9 = new JButton("<---");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theNumEntered = theNumEntered.substring(0, theNumEntered.length() - 1);
				textArea.setText(theNumEntered);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_9.setBounds(804, 168, 261, 114);
		frame.getContentPane().add(button_9);
	}
}
