import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

class PlanetGUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


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
			
		label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		String[] listOfLinks = {
				"https://www.nasa.gov/planetmercury",
				"https://www.nasa.gov/venus",
				"https://www.nasa.gov/topics/earth/index.html",
				"https://mars.nasa.gov",
				"https://www.nasa.gov/jupiter",
				"https://www.nasa.gov/saturn",
				"https://www.nasa.gov/uranus",
				"https://solarsystem.nasa.gov/planets/neptune/overview/"
		};
		
		String link = new String();
/*		
		switch (xyz.getName()) {
		
		case "Mercury":
			link = listOfLinks[0];
		
		case "Venus":
			link = listOfLinks[1];
			
		case "Earth":
			link = listOfLinks[2];
			
		case "Mars":
			link = listOfLinks[3];
			
		case "Jupiter":
			link = listOfLinks[4];
		
		case "Saturn":
			link = listOfLinks[5];
			
		case "Uranus":
			link = listOfLinks[6];
			
		case "Neptune":
			link = listOfLinks[7];
		
		} */
		
		if (xyz.name == "Mercury") {
			link = listOfLinks[0];
		}
		else if (xyz.name == "Venus") {
			link = listOfLinks[1];
		}
		else if (xyz.name == "Earth") {
			link = listOfLinks[2];
		}
		else if (xyz.name == "Mars") {
			link = listOfLinks[3];
		}
		else if (xyz.name == "Jupiter") {
			link = listOfLinks[4];
		}
		else if (xyz.name == "Saturn") {
			link = listOfLinks[5];
		}
		else if (xyz.name == "Uranus") {
			link = listOfLinks[6];
		}
		else if (xyz.name == "Neptune") {
			link = listOfLinks[7];
		}
		
	//	System.out.println(link);
		
		final String finalLink = link;
		
		
		label1.addMouseListener(new MouseListener() {
			
	        public void mousePressed(MouseEvent me) { }
	        public void mouseReleased(MouseEvent me) { }
	        public void mouseEntered(MouseEvent me) { }
	        public void mouseExited(MouseEvent me) { }
	        public void mouseClicked(MouseEvent me) { 
	        
	        	//If the user left or right clicks on the picture.
		        if((me.getButton() == MouseEvent.BUTTON1) || (me.getButton() == MouseEvent.BUTTON2) ) {
		        	  
		            JOptionPane.showMessageDialog(null, finalLink);
		            
		        }
	          
	        }
	        
	    });
		
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
