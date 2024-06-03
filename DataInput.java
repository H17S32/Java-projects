package Datainput;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class DatainputSource extends JFrame
{

	static JSpinner monthSpinner = new JSpinner();
	static JSpinner daySpinner = new JSpinner();
	static JLabel dateLabel = new JLabel();
	static String theMonth;
	
	static String[]monthNames= new String[12];
	int dayMax=31;
	SpinnerNumberModel dayNumberModel = new SpinnerNumberModel(1,1,dayMax,1);
	
	Font myFont = new Font("Ariel", Font.BOLD, 18);
	public static void main (String[] args)
	{
		new DatainputSource();
		//initialize Array
		monthNames[0]="January";
		monthNames[1]="February";
		monthNames[2]="March";
		monthNames[3]="April";
		monthNames[4]="May";
		monthNames[5]="June";
		monthNames[6]="July";
		monthNames[7]="August";
		monthNames[8]="September";
		monthNames[9]="October";
		monthNames[10]="November";
		monthNames[11]="December";
		
		
	}
	
	public DatainputSource(){
		
		setTitle("Date Input");
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
	
		
		monthSpinner.setPreferredSize(new Dimension(150,30));
		monthSpinner.setModel(new SpinnerListModel(monthNames));
		((JSpinner.DefaultEditor)monthSpinner.getEditor()).getTextField().setFont(myFont);
		((JSpinner.DefaultEditor)monthSpinner.getEditor()).getTextField().setForeground(Color.blue);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.insets = new Insets(10,10,10,10);
		getContentPane().add(monthSpinner,gbc);
		monthSpinner.addChangeListener(this::dateStateChanged);
		
		daySpinner.setPreferredSize(new Dimension(150,30));
		daySpinner.setModel(dayNumberModel);
		((JSpinner.DefaultEditor)daySpinner.getEditor()).getTextField()
		.setHorizontalAlignment(SwingConstants.CENTER);;
		((JSpinner.DefaultEditor)monthSpinner.getEditor()).getTextField().setFont(myFont);
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.insets = new Insets(10,10,10,10);
		getContentPane().add(daySpinner,gbc);
		daySpinner.addChangeListener(this::dateStateChanged);
		
		dateLabel.setText("January 1");
		dateLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.insets = new Insets(5,5,10,5);
		getContentPane().add(dateLabel,gbc);
		
		pack();
		
		setLocationRelativeTo(null);
	}
	private void dateStateChanged(ChangeEvent e) {
		theMonth = (String)monthSpinner.getValue();
		System.out.println(theMonth+" "+daySpinner.getValue());
		
		if (theMonth.equals("April") || theMonth.equals("June") || theMonth.equals("September")|| theMonth.equals("November"));{
			dayMax=30;
		}
		if (theMonth.equals("February")){
			dayMax=28;
			}
		else {
			dayMax=31;
		}
		
		dayNumberModel.setMaximum(dayMax);
		
		dateLabel.setText(monthSpinner.getValue()+" "+daySpinner.getValue());
	}
	
	
	
}
	
