package Database;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DatabaseSource extends JFrame{
	static JComboBox<String> ComboBoxCity = new JComboBox<String>();
	static JComboBox<String> ComboBoxAtheticLevel = new JComboBox<String>();
	
	static Font FontC = new Font("Arial Hebrew",Font.TYPE1_FONT,15);
	static JPanel NamePanel = new JPanel();
	static JPanel AgePanel = new JPanel();
	static JPanel CityPanel = new JPanel();
	static JPanel AcivPanel = new JPanel();
	static JPanel AtheticLevelPanel = new JPanel();
	static JPanel GenderPanel = new JPanel();
	//
	static JCheckBox cheeseCheckBox = new JCheckBox();
	//
	static JTextField NameField = new JTextField(10);
	static JTextField AgeField = new JTextField(10);
	//
	static JButton buildButton = new JButton();
	//
	static ButtonGroup GenderGroupButtons = new ButtonGroup();
	//
	static JRadioButton FemaleRadioButton = new JRadioButton();
	static JRadioButton MaleRadioButton = new JRadioButton();
	static JRadioButton MicrowaveRadioButton = new JRadioButton();
	
	static JCheckBox RunningCheckBox = new JCheckBox();
	static JCheckBox SprintingCheckBox = new JCheckBox();
	static JCheckBox JoggingCheckBox = new JCheckBox();
	static JCheckBox GallopingCheckBox = new JCheckBox();
	static JCheckBox ClashOfClansCheckBox = new JCheckBox();
	
	Color c1 = new Color(240,240,240);
	Color c2 = new Color(100,100,100);
	Color bgColor = new Color(250,250,250);
	Color bgColor2 = new Color(5,45,255);
	
	static JCheckBox[]Boxes = new JCheckBox[5];
	
	static String Gender;
	public static void main(String[] args) {
		ComboBoxCity.addItem("Seattle");
		ComboBoxCity.addItem("New york");
		ComboBoxCity.addItem("Portland");
		ComboBoxCity.addItem("Mexico city");
		ComboBoxCity.addItem("Berlin");
		ComboBoxCity.addItem("Kyiv");
		ComboBoxCity.addItem("Moscow");
		ComboBoxCity.addItem("Warsaw");
		ComboBoxCity.addItem("Paris");
		ComboBoxCity.addItem("London");
		ComboBoxCity.addItem("Dubai");
		ComboBoxCity.addItem("Rome");
		ComboBoxCity.addItem("Tokyo");
		ComboBoxCity.addItem("San Francisco");
		ComboBoxCity.addItem("Beijing");
		ComboBoxCity.addItem("Los Angeles");
		ComboBoxCity.addItem("Barcelona");
		//
		ComboBoxAtheticLevel.addItem("Beginner");
		ComboBoxAtheticLevel.addItem("Intermediate");
		ComboBoxAtheticLevel.addItem("Advanced");
		ComboBoxAtheticLevel.addItem("Extreme");
		ComboBoxAtheticLevel.addItem("Never moved a muscle");

		Boxes[0]=RunningCheckBox;
		Boxes[1]=SprintingCheckBox;
		Boxes[2]=JoggingCheckBox;
		Boxes[3]=GallopingCheckBox;
		Boxes[4]=ClashOfClansCheckBox;
		
		new DatabaseSource();
		
	}
	
	public DatabaseSource(){
		setTitle("Database");
		setVisible(true);
		setResizable(true);
		setPreferredSize(new Dimension(300,540));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		getContentPane().setBackground(bgColor);
		//PANELS
		NamePanel.setLayout(new GridBagLayout() );
		NamePanel.setBorder(BorderFactory.createTitledBorder("Name"));
		NamePanel.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(NamePanel,gbc);
		//--
		AgePanel.setLayout(new GridBagLayout() );
		AgePanel.setBorder(BorderFactory.createTitledBorder("Age"));
		AgePanel.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(AgePanel,gbc);
		//
		GenderPanel.setLayout(new GridBagLayout() );
		GenderPanel.setBorder(BorderFactory.createTitledBorder("Sex (Gender)"));
		GenderPanel.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(GenderPanel,gbc);
		//
		CityPanel.setLayout(new GridBagLayout() );
		CityPanel.setBorder(BorderFactory.createTitledBorder("City of residence"));
		CityPanel.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(CityPanel,gbc);

		AcivPanel.setLayout(new GridBagLayout() );
		AcivPanel.setBorder(BorderFactory.createTitledBorder("Activities"));
		AcivPanel.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(AcivPanel,gbc);
		
		AtheticLevelPanel.setLayout(new GridBagLayout() );
		AtheticLevelPanel.setBorder(BorderFactory.createTitledBorder("Athetic Level"));
		AtheticLevelPanel.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		getContentPane().add(AtheticLevelPanel,gbc);
		
		//BUTTONS AND FIELDS++
		NameField.setLayout(new GridBagLayout() );
		NameField.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		NamePanel.add(NameField,gbc);

		//----
		AgeField.setLayout(new GridBagLayout() );
		AgeField.setBackground(c1);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		AgePanel.add(AgeField,gbc);
		// -- Cities -----------------------------\\

		ComboBoxCity.setBackground(Color.WHITE);
		ComboBoxCity.setPreferredSize(new Dimension(150,25));
		ComboBoxCity.setEditable(true);
		gbc.insets = new Insets(0,-0,3,0);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.NORTH;
		getContentPane().add(ComboBoxCity,gbc);
		CityPanel.add(ComboBoxCity,gbc);
		
		
		ComboBoxAtheticLevel.setBackground(Color.WHITE);
		ComboBoxAtheticLevel.setPreferredSize(new Dimension(150,25));
		ComboBoxAtheticLevel.setEditable(true);
		gbc.insets = new Insets(0,-0,3,0);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.NORTH;
		getContentPane().add(ComboBoxAtheticLevel,gbc);
		AtheticLevelPanel.add(ComboBoxAtheticLevel,gbc);
		
		buildButton.setText("Complete");
		gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=6;
		getContentPane().add(buildButton,gbc);
		buildButton.addActionListener(this::buildButtonActionPerformed);
		buildButton.setFont(FontC);
		buildButton.setBackground(new Color(230,230,230));
		
		MaleRadioButton.setText("Male");
		MaleRadioButton.setOpaque(false);
		GenderGroupButtons.add(MaleRadioButton);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.anchor = GridBagConstraints.WEST;
		GenderPanel.add(MaleRadioButton, gbc);
		MaleRadioButton.addActionListener(this::GenderButtonActionPerformed);
		
		FemaleRadioButton.setText("Female");
		FemaleRadioButton.setOpaque(false);
		GenderGroupButtons.add(FemaleRadioButton);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.anchor = GridBagConstraints.WEST;
		GenderPanel.add(FemaleRadioButton, gbc);
		FemaleRadioButton.addActionListener(this::GenderButtonActionPerformed);
		
		MicrowaveRadioButton.setText("Microwave");
		MicrowaveRadioButton.setOpaque(false);
		GenderGroupButtons.add(MicrowaveRadioButton);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.anchor = GridBagConstraints.WEST;
		GenderPanel.add(MicrowaveRadioButton, gbc);
		MicrowaveRadioButton.addActionListener(this::GenderButtonActionPerformed);
		// CheckBoxes

		RunningCheckBox.setText("Running");
		RunningCheckBox.setOpaque(false);
		gbc.gridx=0;
		gbc.gridy=0;
		AcivPanel.add(RunningCheckBox, gbc);
		
		SprintingCheckBox.setText("Sprinting");
		SprintingCheckBox.setOpaque(false);
		gbc.gridx=0;
		gbc.gridy=1;
		AcivPanel.add(SprintingCheckBox, gbc);
		
		JoggingCheckBox.setText("Jogging");
		JoggingCheckBox.setOpaque(false);
		gbc.gridx=0;
		gbc.gridy=2;
		AcivPanel.add(JoggingCheckBox, gbc);
		
		GallopingCheckBox.setText("Galloping");
		GallopingCheckBox.setOpaque(false);
		gbc.gridx=0;
		gbc.gridy=3;
		AcivPanel.add(GallopingCheckBox, gbc);
		
		ClashOfClansCheckBox.setText("Clash Of Clans");
		ClashOfClansCheckBox.setOpaque(false);
		gbc.gridx=0;
		gbc.gridy=4;
		AcivPanel.add(ClashOfClansCheckBox, gbc);
		
		pack();
	}
	
		
	private void buildButtonActionPerformed(ActionEvent e){
		String message = "";
		String SayGenderType = "Something";
		int count =0;
		switch(Gender) {
		case "Male":{SayGenderType="He";break;}
		case "Female":{SayGenderType="She";break;}
		case "Microwave":{SayGenderType="It";break;}
		}
		String Athe = "";
		if (ComboBoxAtheticLevel.getSelectedItem().toString() == "Never moved a muscle") {
			Athe = " has "+ComboBoxAtheticLevel.getSelectedItem().toString()+"\n";
		} else {
			Athe = " is a "+ComboBoxAtheticLevel.getSelectedItem().toString()+" athlete\n";
		}
		message =message+NameField.getText()+" is "+AgeField.getText()+" years old\n";
		message =message+SayGenderType+" lives in "+ComboBoxCity.getSelectedItem()+"\n";
		message =message+SayGenderType+Athe;
		message =message+"Activities include:\n";
		for (int i=0; i<5; i++) {
			if (Boxes[i].isSelected()) {
				message+="-  "+Boxes[i].getText()+"\n";
			}
			else {
				count++;
			}
		}
		if (count==6) {
			message+="None \n";
		}
		JOptionPane.showConfirmDialog(null,message, 
				"Application",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
	}
	private void GenderButtonActionPerformed(ActionEvent e){
		Gender = e.getActionCommand();
		System.out.println(Gender);
	}
}
