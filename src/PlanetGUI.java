import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class PlanetGUI extends JFrame {
	
	
	
	public PlanetGUI(String title) throws IOException {
		
		super(title);
		
		this.setSize(1280,720);
		this.setLocation(200, 200);
		this.setLayout(new GridLayout(8,2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void insertPictures(Image planetImage) {
		
		JLabel label1 = new JLabel();
		this.add(label1);
		
		label1.setIcon(new ImageIcon(planetImage));
			
		
	}
	
	public void showGUI() {
		
//		this.pack();
		this.setVisible(true);
		
	}
	
	
}