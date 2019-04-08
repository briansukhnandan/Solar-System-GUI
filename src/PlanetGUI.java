import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

class PlanetGUI extends JFrame {
	
	private StringBuilder textBoxHandler;
	
	public PlanetGUI(String title) throws IOException {
		
		super(title);
		
		this.setSize(300,100);
		this.setLocation(575, 95);
		this.setPreferredSize(new Dimension(840, 720));
		this.getContentPane().setLayout(new GridLayout(8,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);
		
	}
	
	public void insertPictures(Planet xyz) {
		
		
		
		JLabel label1 = new JLabel();
		label1.setIcon(new ImageIcon(xyz.pictureOfPlanet));
		this.getContentPane().add(label1);
		
		StringBuilder b = new StringBuilder();
		
		b.append(String.format("<html>%s<br> </html>", xyz.getName()));
		b.append(String.format("<html>Distance from Sun: %s<br></html>",xyz.distanceFromSun));
		
		System.out.println(b.toString());
		
		JLabel textBox1 = new JLabel(b.toString(), SwingConstants.CENTER);
		
		textBox1.setText(b.toString());
		
		textBox1.setFont(new Font("Helvetica", Font.BOLD, 24));
		textBox1.setForeground(Color.white);
		
		this.getContentPane().add(textBox1);
		
		
	}
	
	public void showGUI() {
		
		Container c = this.getContentPane();
		JScrollPane scroll = new JScrollPane( c );
		setContentPane( scroll );
		
		this.pack();
		this.setVisible(true);
		
	}
	
	
}