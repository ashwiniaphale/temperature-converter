package firstProject;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class FahrenheitPanel extends JPanel {

	private JLabel inputLabel, outputLabel, resultLabel;
	private JButton fah, cel; 
	private JTextField fahrenheit; 
	
	public FahrenheitPanel()
	{
		inputLabel = new JLabel("Enter Fahrenheit temperature: ");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		
		fahrenheit = new JTextField(5);
		//fahrenheit.addActionListener(new TempListener());
		
		fah = new JButton("Fahrenheit"); 
		cel = new JButton("Celsius"); 
		fah.addActionListener(new TempListener()); 
		cel.addActionListener(new TempListener()); 
		
		add(inputLabel); 
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		
		add(fah); 
		add(cel); 
		
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.yellow);
	}
	
	

	private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			int fahrenheitTemp, celsiusTemp; 
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp-32) * 5/9; 
			
			resultLabel.setText(Integer.toString(celsiusTemp));
			
			if(event.getSource() == cel)
				{
					celsiusTemp = (fahrenheitTemp-32) * 5/9; 
					resultLabel.setText(Integer.toString(celsiusTemp));
				}
			else 
				{
				fahrenheitTemp = (celsiusTemp*9/5) +32; 
				resultLabel.setText(Integer.toString(fahrenheitTemp));
				}
			}
	}
}
