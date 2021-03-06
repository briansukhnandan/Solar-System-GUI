import java.awt.Image;

public class Planet extends Celestial_Object {
	
	public String name;
	public int diameter; 
	public int numOfMoons;
	public float revolution; 
	public float rotation;
	public double distanceFromSun;
	public Image pictureOfPlanet;
	
	
	public Planet(String name, int diameter, int numOfMoons, float revolution, float rotation, double distanceFromSun, Image pictureOfPlanet) {
		
		super(diameter, rotation, name);
		
		this.name = name;
		this.diameter = diameter;
		this.numOfMoons = numOfMoons;
		this.revolution = revolution;
		this.distanceFromSun = distanceFromSun;
		this.rotation = rotation;	
		this.pictureOfPlanet = pictureOfPlanet;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiameter(int diameter) {
		return diameter;
	}
	
	public int numOfMoons(int numOfMoons) {
		return numOfMoons;
	}
	
	public float revolution(float revolution) {
		return revolution;
	}
	
	public float rotation(float rotation) {
		return rotation;
	}
	
	public double distanceFromSun(double distanceFromSun) {
		return distanceFromSun;
	}
	
	
	
}