package Exam;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class examsource extends JFrame {
	static Font F = new Font("Arial Hebrew",Font.TYPE1_FONT,11);
	//ELECTIVES
	static JComboBox<String> ElectiveComboBox = new JComboBox<String>();
	static JLabel Label = new JLabel();
	
	static JPanel EnglishPanel = new JPanel();
	static JPanel MathPanel = new JPanel();
	static JPanel PEPanel = new JPanel();
	static JPanel ElectivesPanel = new JPanel();
	// BUTTON GROUPS
	static ButtonGroup EnglishGroupButtons = new ButtonGroup();
	// ENGLISH
	static JRadioButton English9RadioButton = new JRadioButton();
	static JRadioButton English10RadioButton = new JRadioButton();
	static JRadioButton English11RadioButton = new JRadioButton();
	static JRadioButton English12RadioButton = new JRadioButton();
	// PE CHECKBOX
	static JCheckBox HealthBOX = new JCheckBox();
	static JCheckBox YogaBox = new JCheckBox();
	static JCheckBox SportsBox = new JCheckBox();
	static JCheckBox LiftingBox = new JCheckBox();
	static JCheckBox AerobricsBox = new JCheckBox();
	static JCheckBox SwimmingBox = new JCheckBox();
	static JCheckBox ArcheryBox = new JCheckBox();
	static JCheckBox BowlingBox = new JCheckBox();
	//MATH
	static JList<String> MathListClasses = new JList<String>();
	static DefaultListModel<String>MathListModel = new DefaultListModel(); 
	static JScrollPane ScrollPaneMATH = new JScrollPane();
	// BUTTON
	static JButton ResetRadioButton = new JButton();
	static JButton CreateRadioButton = new JButton();
	
	Color c1 = new Color(240,240,240);
	Color c2 = new Color(100,100,100);
	Color bgColor = new Color(250,250,250);
	Color bgColor2 = new Color(5,45,255);
	
	static JCheckBox[]Boxes = new JCheckBox[8];
	
	static GridBagLayout Grid = new GridBagLayout();
	public static void main(String[] args) {
		ElectiveComboBox.addItem("Java");
		ElectiveComboBox.addItem("Web Design");
		ElectiveComboBox.addItem("Welding");
		ElectiveComboBox.addItem("Woods");
		ElectiveComboBox.addItem("Art");
		ElectiveComboBox.addItem("Band");
		ElectiveComboBox.addItem("GameDesign");
		ElectiveComboBox.addItem("Graphic Arts");
		ElectiveComboBox.setSelectedIndex(0);
		
		MathListModel.addElement("Algebra 1-2");
		MathListModel.addElement("Algebra 3-4");
		MathListModel.addElement("Geometry");
		MathListModel.addElement("Pre-calculus");
		MathListModel.addElement("calculus");
		MathListClasses.setModel(MathListModel);
		MathListClasses.setSelectedIndex(1);
		
		Boxes[0]=HealthBOX;
		Boxes[1]=YogaBox;
		Boxes[2]=SportsBox;
		Boxes[3]=LiftingBox;
		Boxes[4]=AerobricsBox;
		Boxes[5]=SwimmingBox;
		Boxes[6]=ArcheryBox;
		Boxes[7]=BowlingBox;
		
		English9RadioButton.setSelected(true);
		new examsource(); 
	}
	static String EnglishChoosen = "English 9";
	public examsource() {
		setTitle("Class register");
		
		setPreferredSize(new Dimension(500,500));
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		getContentPane().setBackground(new Color(190,190,190));
		
		// COMBO BOX
		ElectiveComboBox.setBackground(Color.WHITE);
		ElectiveComboBox.setPreferredSize(new Dimension(130,25));
		ElectiveComboBox.setEditable(false);
		ElectiveComboBox.setFont(F);
		gbc.gridx = 0;
		gbc.gridy = 1;
		ElectivesPanel.add(ElectiveComboBox, gbc);
		
	
		
		// -- PANEL
		EnglishPanel.setLayout(new GridBagLayout() );
		EnglishPanel.setBorder(BorderFactory.createTitledBorder("ENGLISH"));
		EnglishPanel.setBackground(c1);
		gbc.gridx=0;
		EnglishPanel.setFont(F);
		gbc.gridy=0;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(EnglishPanel,gbc);
		// -- PANEL
		MathPanel.setLayout(new GridBagLayout() );
		MathPanel.setBorder(BorderFactory.createTitledBorder("MATH"));
		MathPanel.setBackground(c1);
		MathPanel.setFont(F);
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(MathPanel,gbc);
		// -- PANEL
		PEPanel.setLayout(new GridBagLayout() );
		PEPanel.setBorder(BorderFactory.createTitledBorder("PE"));
		PEPanel.setBackground(c1);
		PEPanel.setFont(F);
		gbc.gridx=1;
		gbc.gridy=0;
		getContentPane().add(PEPanel,gbc);
		// -- PANEL
		ElectivesPanel.setBorder(BorderFactory.createTitledBorder("Electives"));
		ElectivesPanel.setBackground(c1);
		ElectivesPanel.setFont(F);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill=GridBagConstraints.VERTICAL;
		gbc.gridy=1;
		getContentPane().add(ElectivesPanel,gbc);
		// ENGLISH
		
		English9RadioButton.setText("English 9");
		English9RadioButton.setOpaque(false);
		English9RadioButton.setFont(F);
		EnglishGroupButtons.add(English9RadioButton);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.anchor = GridBagConstraints.WEST;
		EnglishPanel.add(English9RadioButton, gbc);
		English9RadioButton.addActionListener(this::EnglishButtonsAction);
		
		English10RadioButton.setText("English 10");
		English10RadioButton.setOpaque(false);
		EnglishGroupButtons.add(English10RadioButton);
		English10RadioButton.setFont(F);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.anchor = GridBagConstraints.WEST;
		EnglishPanel.add(English10RadioButton, gbc);
		English10RadioButton.addActionListener(this::EnglishButtonsAction);

		English11RadioButton.setText("English 11");
		English11RadioButton.setOpaque(false);
		English11RadioButton.setFont(F);
		EnglishGroupButtons.add(English11RadioButton);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.anchor = GridBagConstraints.WEST;
		EnglishPanel.add(English11RadioButton, gbc);
		English11RadioButton.addActionListener(this::EnglishButtonsAction);
		
		English12RadioButton.setText("English 12");
		English12RadioButton.setOpaque(false);
		EnglishGroupButtons.add(English12RadioButton);
		English12RadioButton.setFont(F);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.anchor = GridBagConstraints.WEST;
		EnglishPanel.add(English12RadioButton, gbc);
		English12RadioButton.addActionListener(this::EnglishButtonsAction);
		//MATH
		ScrollPaneMATH.setPreferredSize(new Dimension(150,100));
		ScrollPaneMATH.setViewportView(MathListClasses);
		ScrollPaneMATH.setFont(F);
		gbc.gridx = 0;
		gbc.gridy = 0;
		//gbc.insets = new Insets(10,0,0,10);
		getContentPane().add(ScrollPaneMATH,gbc);
		MathPanel.add(ScrollPaneMATH, gbc);
		/// !! CHECKBOXES PE! !! \\\
		HealthBOX.setText("Health");
		HealthBOX.setOpaque(false);
		HealthBOX.setFont(F);
		gbc.gridx=0;
		gbc.gridy=0;
		PEPanel.add(HealthBOX, gbc);
		
		YogaBox.setText("Yoga");
		YogaBox.setOpaque(false);
		YogaBox.setFont(F);
		gbc.gridx=1;
		gbc.gridy=0;
		PEPanel.add(YogaBox, gbc);

		SportsBox.setText("Sports");
		SportsBox.setOpaque(false);
		SportsBox.setFont(F);
		gbc.gridx=0;
		gbc.gridy=1;
		PEPanel.add(SportsBox, gbc);
		
		LiftingBox.setText("Lifting");
		LiftingBox.setOpaque(false);
		LiftingBox.setFont(F);
		gbc.gridx=0;
		gbc.gridy=2;
		PEPanel.add(LiftingBox, gbc);

		AerobricsBox.setText("Aerobrics");
		AerobricsBox.setOpaque(false);
		AerobricsBox.setFont(F);
		gbc.gridx=0;
		gbc.gridy=3;
		PEPanel.add(AerobricsBox, gbc);
		
		ArcheryBox.setText("Archery");
		ArcheryBox.setOpaque(false);
		ArcheryBox.setFont(F);
		gbc.gridx=1;
		gbc.gridy=1;
		PEPanel.add(ArcheryBox, gbc);
		
		SwimmingBox.setText("Swimming");
		SwimmingBox.setOpaque(false);
		SwimmingBox.setFont(F);
		gbc.gridx=1;
		gbc.gridy=2;
		PEPanel.add(SwimmingBox, gbc);
		
		BowlingBox.setText("Bowling");
		BowlingBox.setOpaque(false);
		BowlingBox.setFont(F);
		gbc.gridx=1;
		gbc.gridy=3;
		PEPanel.add(BowlingBox, gbc);
		//BUTTONS
		
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.anchor = GridBagConstraints.CENTER;
		getContentPane().add(CreateRadioButton,gbc);
		CreateRadioButton.setText("Create request");
		CreateRadioButton.setFont(F);
		CreateRadioButton.addActionListener(this::MainButtonsAction);
		
		gbc.gridx=1;
		gbc.gridy=3;
		
		gbc.anchor = GridBagConstraints.CENTER;
		getContentPane().add(ResetRadioButton,gbc);
		ResetRadioButton.setText("Reset");
		ResetRadioButton.setFont(F);
		ResetRadioButton.addActionListener(this::ResetButtonsAction);
		pack();
	}
	
	private void EnglishButtonsAction(ActionEvent e) {
		EnglishChoosen = e.getActionCommand();
		System.out.println(EnglishChoosen);
	}
	private void MainButtonsAction(ActionEvent e) {
		String Message;
		int count =0;
		Message = "######<<//** CLASSES **\\\\>>######\n";
		Message+="English: - "+EnglishChoosen+"\n---------------------------------\n";
		Message+="Math: - "+MathListClasses.getSelectedValue()+"\n---------------------------------\n";
		Message+="Elective: - "+ElectiveComboBox.getSelectedItem()+"\n---------------------------------\n";
		Message+="** PE: **\n";
		for (int i=0; i<5; i++) {
			if (Boxes[i].isSelected()) {
				Message+="- "+Boxes[i].getText()+"\n";
			}
			else {
				count++;
			}
		}
		JOptionPane.showConfirmDialog(null,Message, 
				"Classes",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
	}
	private void ResetButtonsAction(ActionEvent e) {
		English9RadioButton.setSelected(false);
		English10RadioButton.setSelected(false);
		English11RadioButton.setSelected(false);
		English12RadioButton.setSelected(false);
		English9RadioButton.doClick();
		
		HealthBOX.setSelected(false);
		YogaBox.setSelected(false);
		SportsBox.setSelected(false);
		LiftingBox.setSelected(false);
		AerobricsBox.setSelected(false);
		SwimmingBox.setSelected(false);
		ArcheryBox.setSelected(false);
		BowlingBox.setSelected(false);
		
		MathListClasses.setSelectedIndex(0);
		
		
		ElectiveComboBox.setSelectedIndex(0);
	}
	private void ResetButtonAction(ActionEvent e) {
		
	}
}
