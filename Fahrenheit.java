package firstProject;
import javax.swing.JFrame;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Fahrenheit"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FahrenheitPanel panel = new FahrenheitPanel();
		frame.getContentPane().add(panel); 
		
		frame.pack();
		frame.setVisible(true);
				
	}

}
