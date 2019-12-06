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
import java.awt.BorderLayout;

public class swingReal {
	
	private JFrame frame;
	private JInternalFrame internalFramePrimes;
	private JInternalFrame internalFrameGCD;
	private JInternalFrame internalFrameInverse;
	private JInternalFrame internalFramePrimeList;
	private JInternalFrame internalFrameBtoD;
	private JInternalFrame internalFrameDtoB;
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
					swingReal window = new swingReal();
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
	public swingReal() {
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
			    
			    internalFramePrimes = new JInternalFrame("Find Prime Status");
                internalFramePrimes.setBounds(321, 27, 482, 475);
                frame.getContentPane().add(internalFramePrimes);
                internalFramePrimes.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
                internalFramePrimes.getContentPane().setLayout(null);
                
                JLabel lblEnterANumber = new JLabel("Enter a number  to find the prime status of: ");
                lblEnterANumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                lblEnterANumber.setBounds(57, 11, 350, 58);
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
                panel.setBounds(57, 67, 300, 76);
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
		        textField.setColumns(8);
		        if (internalFrameGCD.isVisible()) {
                    internalFrameGCD.setVisible(false);
                }
		        internalFramePrimes.setVisible(true);
		        
				
			}
		});
		btnButton.setForeground(Color.BLACK);
		btnButton.setBackground(SystemColor.inactiveCaption);
		btnButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnButton.setBounds(10, 11, 191, 71);
		frame.getContentPane().add(btnButton);
		
		JButton btnFindGcd = new JButton("Find GCD");
		btnFindGcd.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        if (internalFramePrimes.isVisible()) {
                    internalFramePrimes.setVisible(false);
                } 
		        internalFrameGCD = new JInternalFrame("Find GCD");
                internalFrameGCD.setBounds(321, 27, 482, 475);
                frame.getContentPane().add(internalFrameGCD);
                internalFrameGCD.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
                internalFrameGCD.getContentPane().setLayout(null);
                
                
                
                internalFrameGCD.setVisible(true);
		    }
		    
		    
		});
		btnFindGcd.setForeground(Color.BLACK);
		btnFindGcd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnFindGcd.setBackground(SystemColor.inactiveCaption);
		btnFindGcd.setBounds(10, 95, 191, 71);
		frame.getContentPane().add(btnFindGcd);
		
		JButton btnFindInverseFunction = new JButton("Find Inverse Function");
		btnFindInverseFunction.setForeground(Color.BLACK);
		btnFindInverseFunction.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnFindInverseFunction.setBackground(SystemColor.inactiveCaption);
		btnFindInverseFunction.setBounds(10, 179, 191, 71);
		frame.getContentPane().add(btnFindInverseFunction);
		
		JButton btnGeneratePrimeList = new JButton("Generate Prime List");
		btnGeneratePrimeList.setForeground(Color.BLACK);
		btnGeneratePrimeList.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnGeneratePrimeList.setBackground(SystemColor.inactiveCaption);
		btnGeneratePrimeList.setBounds(10, 263, 191, 71);
		frame.getContentPane().add(btnGeneratePrimeList);
		
		JButton btnConvertBooleanTo = new JButton("Convert Boolean to Decimal");
		btnConvertBooleanTo.setForeground(Color.BLACK);
		btnConvertBooleanTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnConvertBooleanTo.setBackground(SystemColor.inactiveCaption);
		btnConvertBooleanTo.setBounds(10, 347, 191, 71);
		frame.getContentPane().add(btnConvertBooleanTo);
		
		JButton btnConvertDecimalTo = new JButton("Convert Decimal to Boolean");
		btnConvertDecimalTo.setForeground(Color.BLACK);
		btnConvertDecimalTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnConvertDecimalTo.setBackground(SystemColor.inactiveCaption);
		btnConvertDecimalTo.setBounds(10, 431, 191, 71);
		frame.getContentPane().add(btnConvertDecimalTo);
		
		

	}
}
