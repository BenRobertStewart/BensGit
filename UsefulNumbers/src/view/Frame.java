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
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class Frame {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblEnterANumber1;
	private JLabel lblThatNumberIs;
	private JLabel lblThatNumberIs_1;
	private String enteredNumber;
	private JButton btnButton;
	private JButton btnFindGcd;
	private JButton btnFindInverseFunction;
	private JButton btnGeneratePrimeList;
	private JButton btnConvertBooleanTo;
	private JButton btnConvertDecimalTo;

	private int primeNum;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
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

		btnButton = new JButton("Find Prime Status");
		buttonGroup.add(btnButton);
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FramePrimes.main(null);
		
		
				
				
				
			}
		});
		btnButton.setForeground(Color.BLACK);
		btnButton.setBackground(SystemColor.inactiveCaption);
		btnButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnButton.setBounds(10, 11, 191, 71);
		frame.getContentPane().add(btnButton);

		btnFindGcd = new JButton("Find GCD");
		buttonGroup.add(btnFindGcd);
		btnFindGcd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameGCD.main(null);
			
			}

		});
		btnFindGcd.setForeground(Color.BLACK);
		btnFindGcd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnFindGcd.setBackground(SystemColor.inactiveCaption);
		btnFindGcd.setBounds(10, 95, 191, 71);
		frame.getContentPane().add(btnFindGcd);

		btnFindInverseFunction = new JButton("Find Inverse Function");
		buttonGroup.add(btnFindInverseFunction);
		btnFindInverseFunction.setForeground(Color.BLACK);
		btnFindInverseFunction.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnFindInverseFunction.setBackground(SystemColor.inactiveCaption);
		btnFindInverseFunction.setBounds(10, 179, 191, 71);
		frame.getContentPane().add(btnFindInverseFunction);

		btnGeneratePrimeList = new JButton("Generate Prime List");
		buttonGroup.add(btnGeneratePrimeList);
		btnGeneratePrimeList.setForeground(Color.BLACK);
		btnGeneratePrimeList.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnGeneratePrimeList.setBackground(SystemColor.inactiveCaption);
		btnGeneratePrimeList.setBounds(10, 263, 191, 71);
		frame.getContentPane().add(btnGeneratePrimeList);

		btnConvertBooleanTo = new JButton("Convert Boolean to Decimal");
		buttonGroup.add(btnConvertBooleanTo);
		btnConvertBooleanTo.setForeground(Color.BLACK);
		btnConvertBooleanTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnConvertBooleanTo.setBackground(SystemColor.inactiveCaption);
		btnConvertBooleanTo.setBounds(10, 347, 191, 71);
		frame.getContentPane().add(btnConvertBooleanTo);

		btnConvertDecimalTo = new JButton("Convert Decimal to Boolean");
		buttonGroup.add(btnConvertDecimalTo);
		btnConvertDecimalTo.setForeground(Color.BLACK);
		btnConvertDecimalTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnConvertDecimalTo.setBackground(SystemColor.inactiveCaption);
		btnConvertDecimalTo.setBounds(10, 431, 191, 71);
		frame.getContentPane().add(btnConvertDecimalTo);

	}
}
