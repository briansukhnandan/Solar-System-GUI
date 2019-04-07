import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class init {
	
	public static void main(String args[]) throws IOException {
		
		//Diameter in miles.
		//Revolution calculated in number of earth days.
		//Rotation is the length of one day, expressed in hours.
		//Distance from the sun expressed in miles.
		Planet Mercury = new Planet(3032, 0, 88.0f, 360.5f, 35.98e6,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Venus = new Planet(7521, 0, 225.0f, 2802.0f, 67.24e6,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Earth = new Planet(7917, 1, 365.0f, 24.0f, 92.96e6,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Mars = new Planet(4212, 2, 687.0f, 24.5f, 141.6e6,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Jupiter = new Planet(86881, 79, 4380.0f, 9.9f, 483.8e6,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Saturn = new Planet(72367, 62, 10585.0f, 10.6f, 886.0e6,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Uranus = new Planet(31518, 27, 30660.0f, 17.2f, 1.78e9,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		Planet Neptune = new Planet(30599, 13, 60225.0f, 16.1f, 2.79e9,ImageIO.read(new File("C:\\Users\\dbz0w\\CS212\\Solar System\\Images\\earth.jpg")));
		
		PlanetGUI Interface = new PlanetGUI("The Solar System");
		
		Interface.showGUI();
		
		Interface.insertPictures(Earth.pictureOfPlanet);
		
	}
	
	
}