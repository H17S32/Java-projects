// 2024
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class exam2Source extends JFrame {
	static JTextField IntialVelTextField = new JTextField("");
	static JTextField TimeField = new JTextField("");
	static JTextField DistanceField = new JTextField("");
	
	static JButton Calculate = new JButton("Calculate");
	static JButton ClearButton = new JButton("Clear");
	
	static JLabel IntialVelText = new JLabel("Intial Velocity (m/s):");
	static JLabel TimeText = new JLabel("Time (Seconds): ");
	static JLabel FinalBalance_TEXT = new JLabel("Distance (meters): ");
	
	static Font FontC = new Font("Arial Hebrew",Font.BOLD,24);
	
	public static void main(String[] args) {
		new exam2Source();
	}
	static double InitialVelocity,TimeValue;
	public exam2Source() {
		setTitle("Initial Velocity");
		
		setPreferredSize(new Dimension(500,300));
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		getContentPane().setBackground(new Color(190,190,190));
		
		Calculate.setVisible(true);
		Calculate.setBackground(new Color(40,40,40));
		Calculate.setForeground(new Color(130,255,130));
		Calculate.setPreferredSize(new Dimension(150,30));
		Calculate.setFont(FontC);
		
		ClearButton.setVisible(true);
		ClearButton.setBackground(new Color(40,40,40));
		ClearButton.setForeground(new Color(255,70,70));
		ClearButton.setPreferredSize(new Dimension(150,30));
		ClearButton.setFont(FontC);
		
		IntialVelText.setVisible(true);
		IntialVelText.setFont(FontC);
		TimeText.setVisible(true);
		TimeText.setFont(FontC);
		
		//
		FinalBalance_TEXT.setVisible(true);
		FinalBalance_TEXT.setFont(FontC);
		FinalBalance_TEXT.setVisible(true);
		FinalBalance_TEXT.setFont(FontC);
		
		Calculate.addActionListener(this::click);
		ClearButton.addActionListener(this::Exit);
		
		IntialVelTextField.setVisible(true);
		IntialVelTextField.setPreferredSize(new Dimension(150,30));
		IntialVelTextField.setFont(FontC);
		IntialVelTextField.setForeground(new Color(150,150,150));
		IntialVelTextField.setColumns(10);
	
		DistanceField.setVisible(true);
		DistanceField.setPreferredSize(new Dimension(150,30));
		DistanceField.setFont(FontC);
		DistanceField.setForeground(new Color(150,150,150));
		DistanceField.setColumns(10);
		
		TimeField.setFont(FontC);
		TimeField.setColumns(10);
		TimeField.setVisible(true);
		TimeField.setPreferredSize(new Dimension(150,30));
		TimeField.setForeground(new Color(150,150,150));
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		getContentPane().add(IntialVelTextField, gbc);
		
		gbc.gridx=2;
		gbc.gridy=4;
		getContentPane().add(DistanceField,gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		getContentPane().add(TimeField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		getContentPane().add(IntialVelText, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		getContentPane().add(TimeText, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		getContentPane().add(FinalBalance_TEXT, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 5;
		getContentPane().add(Calculate, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 6;
		getContentPane().add(ClearButton, gbc);
		pack();
		
	}
	private void click(ActionEvent e) {
		TimeValue = Double.valueOf(TimeField.getText()).doubleValue();
		InitialVelocity = Double.valueOf(IntialVelTextField.getText()).doubleValue();
		double Calculation = InitialVelocity*TimeValue+4.9*TimeValue*TimeValue;
		DistanceField.setText(String.valueOf(Calculation));
	}
	private void Exit(ActionEvent e) {
		DistanceField.setText("");
		TimeField.setText("");
		IntialVelTextField.setText("");
	}

}

