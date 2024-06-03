package RGBcolor;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.*;

public class rgbsource extends JFrame{
	static Font FontC = new Font("Arial Hebrew",Font.TYPE1_FONT,14);
	static JLabel Totaltext = new JLabel("Total: ");
	static JLabel REDtext  = new JLabel("Red: ");
	static JLabel GREENtext  = new JLabel("Green: ");
	static JLabel BLUEtext  = new JLabel("Blue: ");
	
	static JPanel Totalframe = new JPanel();
	static JPanel REDframe  = new JPanel();
	static JPanel GREENframe  = new JPanel();
	static JPanel BLUEframe  = new JPanel();
	
	static JScrollBar REDscrollbar = new JScrollBar();
	static JScrollBar GREENscrollbar = new JScrollBar();
	static JScrollBar BLUEscrollbar = new JScrollBar();
	
	static JTextField TOTALCField = new JTextField();
	static JTextField REDCField = new JTextField();
	static JTextField GREENCField = new JTextField();
	static JTextField BLUECField = new JTextField();
	
	public static void main(String[] args) {
		new rgbsource();
		
	}
	int R,G,B;
	public rgbsource(){
		setTitle("RGB COLOR CHANGER");
		setVisible(true);
		setResizable(true);
		setPreferredSize(new Dimension(286,580));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		getContentPane().setBackground(new Color(238,238,238));
		/// --------------- |FRAMES|  ---------------\\\
	
		Totalframe.setBackground(Color.white);
		Totalframe.setPreferredSize(new Dimension(270,100));
		TOTALCField.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,0,0,0);
		getContentPane().add(Totalframe,gbc);
		
		REDframe.setBackground(Color.RED);
		REDframe.setPreferredSize(new Dimension(270,100));
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,0,0,0);
		getContentPane().add(REDframe,gbc);
		;
		GREENframe.setBackground(Color.GREEN);
		GREENframe.setPreferredSize(new Dimension(270,100));
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,0,0,0);
		getContentPane().add(GREENframe,gbc);
		
		BLUEframe.setBackground(Color.BLUE);
		BLUEframe.setPreferredSize(new Dimension(270,100));
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,0,0,0);
		getContentPane().add(BLUEframe,gbc);
		/// --------------- |FIELDS AND TEXT|  ---------------\\\
		// Total
		TOTALCField.setText("0,0,0");
		TOTALCField.setColumns(10);
		TOTALCField.setEditable(false);
		TOTALCField.setBackground(Color.WHITE);
		TOTALCField.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,80,0,0);
		getContentPane().add(TOTALCField,gbc);
		
		Totaltext.setVisible(true);
		Totaltext.setBackground(new Color(1,1,1));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets=new Insets(0,0,0,0);
		gbc.anchor = GridBagConstraints.WEST;
		getContentPane().add(Totaltext,gbc);
		//Red
		REDCField.setText("0");
		REDCField.setColumns(10);
		REDCField.setEditable(false);
		REDCField.setBackground(Color.WHITE);
		REDCField.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,80,0,0);
		getContentPane().add(REDCField,gbc);
		
		REDtext.setVisible(true);
		REDtext.setBackground(new Color(1,1,1));
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets=new Insets(0,0,0,0);
		gbc.anchor = GridBagConstraints.WEST;
		getContentPane().add(REDtext,gbc);
		// Green
		GREENCField.setText("0");
		GREENCField.setColumns(10);
		GREENCField.setEditable(false);
		GREENCField.setBackground(Color.WHITE);
		GREENCField.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,80,0,0);
		getContentPane().add(GREENCField,gbc);
		
		GREENtext.setVisible(true);
		GREENtext.setBackground(new Color(1,1,1));
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.insets=new Insets(0,0,0,0);
		gbc.anchor = GridBagConstraints.WEST;
		getContentPane().add(GREENtext,gbc);
		// Blue
		BLUECField.setText("0");
		BLUECField.setColumns(10);
		BLUECField.setEditable(false);
		BLUECField.setBackground(Color.WHITE);
		BLUECField.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets=new Insets(0,80,0,0);
		getContentPane().add(BLUECField,gbc);
		
		BLUEtext.setVisible(true);
		BLUEtext.setBackground(new Color(1,1,1));
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.insets=new Insets(0,0,0,0);
		gbc.anchor = GridBagConstraints.WEST;
		getContentPane().add(BLUEtext,gbc);
		/// --------------- |SCROLLBARS|  ---------------\\\
		
		REDscrollbar.setMinimum(1);
		REDscrollbar.setMaximum(265);
		REDscrollbar.setBlockIncrement(10);
		REDscrollbar.setUnitIncrement(1);
		REDscrollbar.setValue(320);
		REDscrollbar.setBackground(Color.LIGHT_GRAY);
		REDscrollbar.setOrientation(JScrollBar.HORIZONTAL);
		REDscrollbar.setPreferredSize(new Dimension(200,30));
		REDscrollbar.addAdjustmentListener(this::Changed_RED);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets=new Insets(0,0,0,0);
		REDframe.add(REDscrollbar,gbc);
		
		GREENscrollbar.setMinimum(1);
		GREENscrollbar.setMaximum(265);
		GREENscrollbar.setBlockIncrement(10);
		GREENscrollbar.setUnitIncrement(1);
		GREENscrollbar.setValue(320);
		GREENscrollbar.setBackground(Color.LIGHT_GRAY);
		GREENscrollbar.setOrientation(JScrollBar.HORIZONTAL);
		GREENscrollbar.setPreferredSize(new Dimension(200,30));
		GREENscrollbar.addAdjustmentListener(this::Changed_GREEN);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets=new Insets(0,0,0,0);
		GREENframe.add(GREENscrollbar,gbc);

		BLUEscrollbar.setMinimum(1);
		BLUEscrollbar.setMaximum(265);
		BLUEscrollbar.setBlockIncrement(10);
		BLUEscrollbar.setUnitIncrement(1);
		BLUEscrollbar.setValue(320);
		BLUEscrollbar.setBackground(Color.LIGHT_GRAY);
		BLUEscrollbar.setOrientation(JScrollBar.HORIZONTAL);
		BLUEscrollbar.setPreferredSize(new Dimension(200,30));
		BLUEscrollbar.addAdjustmentListener(this::Changed_BLUE);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets=new Insets(0,0,0,0);
		BLUEframe.add(BLUEscrollbar,gbc);
		pack();

	}
	private void Changed_RED(AdjustmentEvent e) {
		R = (int)REDscrollbar.getValue();
		REDframe.setBackground(new Color(R,0,0));
		REDCField.setText(String.valueOf(R));
		TOTALCField.setText(String.valueOf(R)+","+String.valueOf(G)+","+String.valueOf(B));
		Totalframe.setBackground(new Color(R,G,B));
	}
	private void Changed_GREEN(AdjustmentEvent e) {
		G = (int)GREENscrollbar.getValue();
		GREENframe.setBackground(new Color(0,G,0));
		GREENCField.setText(String.valueOf(G));
		TOTALCField.setText(String.valueOf(R)+","+String.valueOf(G)+","+String.valueOf(B));
		Totalframe.setBackground(new Color(R,G,B));
	}
	private void Changed_BLUE(AdjustmentEvent e) {
		B = (int)BLUEscrollbar.getValue();
		BLUEframe.setBackground(new Color(0,0,B));
		BLUECField.setText(String.valueOf(B));
		TOTALCField.setText(String.valueOf(R)+","+String.valueOf(G)+","+String.valueOf(B));
		Totalframe.setBackground(new Color(R,G,B));
	}
}
