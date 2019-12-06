package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JTextPane;

import model.Primes;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class swing {
	
	private JFrame frame;
	private JInternalFrame internalFramePrimes;
	private JTextField textField;
	private JLabel lblThatNumberIs;
	private JLabel lblThatNumberIs_1;
	private String enteredNumber;
	private int primeNum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
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
	public swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.menu);
		frame.setBounds(100, 100, 1035, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnButton = new JButton("Find Prime Status");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				internalFramePrimes.setVisible(true);
				
				
			}
		});
		btnButton.setForeground(Color.BLACK);
		btnButton.setBackground(SystemColor.inactiveCaption);
		btnButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnButton.setBounds(10, 11, 191, 23);
		frame.getContentPane().add(btnButton);
		
		JButton btnFindGcd = new JButton("Find GCD");
		btnFindGcd.setForeground(Color.BLACK);
		btnFindGcd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnFindGcd.setBackground(SystemColor.inactiveCaption);
		btnFindGcd.setBounds(10, 45, 191, 23);
		frame.getContentPane().add(btnFindGcd);
		
		JButton btnFindInverseFunction = new JButton("Find Inverse Function");
		btnFindInverseFunction.setForeground(Color.BLACK);
		btnFindInverseFunction.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnFindInverseFunction.setBackground(SystemColor.inactiveCaption);
		btnFindInverseFunction.setBounds(10, 79, 191, 23);
		frame.getContentPane().add(btnFindInverseFunction);
		
		JButton btnGeneratePrimeList = new JButton("Generate Prime List");
		btnGeneratePrimeList.setForeground(Color.BLACK);
		btnGeneratePrimeList.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnGeneratePrimeList.setBackground(SystemColor.inactiveCaption);
		btnGeneratePrimeList.setBounds(10, 113, 191, 23);
		frame.getContentPane().add(btnGeneratePrimeList);
		
		JButton btnConvertBooleanTo = new JButton("Convert Boolean to Decimal");
		btnConvertBooleanTo.setForeground(Color.BLACK);
		btnConvertBooleanTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnConvertBooleanTo.setBackground(SystemColor.inactiveCaption);
		btnConvertBooleanTo.setBounds(10, 147, 191, 23);
		frame.getContentPane().add(btnConvertBooleanTo);
		
		JButton btnConvertDecimalTo = new JButton("Convert Decimal to Boolean");
		btnConvertDecimalTo.setForeground(Color.BLACK);
		btnConvertDecimalTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnConvertDecimalTo.setBackground(SystemColor.inactiveCaption);
		btnConvertDecimalTo.setBounds(10, 181, 191, 23);
		frame.getContentPane().add(btnConvertDecimalTo);
		
		internalFramePrimes = new JInternalFrame("Find Prime Status");
		internalFramePrimes.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		internalFramePrimes.setBounds(352, 11, 498, 477);
		frame.getContentPane().add(internalFramePrimes);
		internalFramePrimes.getContentPane().setLayout(null);
		
		JLabel lblEnterANumber = new JLabel("Enter a number  to find the prime status of: ");
		lblEnterANumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnterANumber.setBounds(92, 11, 265, 33);
		internalFramePrimes.getContentPane().add(lblEnterANumber);
		
		lblThatNumberIs = new JLabel("That Number IS Prime!");
		lblThatNumberIs.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblThatNumberIs.setVisible(false);
		lblThatNumberIs.setBounds(88, 138, 319, 109);
		internalFramePrimes.getContentPane().add(lblThatNumberIs);
		
		lblThatNumberIs_1 = new JLabel("That Number is NOT Prime!");
		lblThatNumberIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblThatNumberIs_1.setVisible(false);
		lblThatNumberIs_1.setBounds(92, 270, 369, 143);
		internalFramePrimes.getContentPane().add(lblThatNumberIs_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 55, 300, 58);
		internalFramePrimes.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enteredNumber = textField.getText();
				primeNum = Integer.parseInt(enteredNumber);
				Primes p = new Primes();
				if (p.isPrime(primeNum)) {
					lblThatNumberIs.setVisible(true);
					lblThatNumberIs_1.setVisible(false);
				} else {
					lblThatNumberIs_1.setVisible(true);
					lblThatNumberIs.setVisible(false);
				}
				
			}
		});
		panel.add(textField);
		textField.setColumns(10);
	}
}
