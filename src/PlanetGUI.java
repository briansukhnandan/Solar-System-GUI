import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;

class PlanetGUI extends JFrame {
	
	public PlanetGUI(String title) throws IOException {
		
		//Initializers
		
		super(title);
		
		this.setSize(300,100);
		this.setLocation(300,100);
		this.setPreferredSize(new Dimension(1280, 720));
		this.getContentPane().setLayout(new GridLayout(8,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);
		
	}
	
	public void insertPictures(Planet xyz) {
			
		JLabel label1 = new JLabel();
		label1.setIcon(new ImageIcon(xyz.pictureOfPlanet));
		this.getContentPane().add(label1);
		
		StringBuilder b = new StringBuilder();
		
		b.append(String.format("<html><u>%s</u><br>- Diameter: %s miles<br>- Distance from the Sun: %s miles<br>- Number of Moons: %s<br>"
							+ "- Time to complete one revolution: %s days<br>"
							+ "- Length of one day: %s hours<br>"
							+ "</html>",
							xyz.getName(), xyz.diameter, xyz.distanceFromSun, xyz.numOfMoons, xyz.revolution, xyz.rotation));
		
		//Testing
	//	System.out.println(b.toString());
		
		JLabel textBox1 = new JLabel(b.toString(), SwingConstants.CENTER);
		
		textBox1.setText(b.toString());
		
		textBox1.setFont(new Font("Helvetica", Font.BOLD, 20));
		textBox1.setForeground(Color.white);
		
		this.getContentPane().add(textBox1);
				
	}
	
	
	public void showGUI() {
		
		//Wrap the entire content pane around a JScrollPane so we can
		//scroll down the interface.
		Container c = this.getContentPane();
		JScrollPane scroll = new JScrollPane(c);
		this.setContentPane(scroll);
		
		this.pack();
		this.setVisible(true);
		
	}
	
	
}