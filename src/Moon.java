public class Moon extends Celestial_Object {
	
	public String name;
	public int diameter; 
	public float rotation;
	public float revolution;
	public Planet planetOrbit;
	
	public Moon(int diameter, float rotation, float revolution, String name, Planet planetOrbit) {
		
		super(diameter, rotation, name);
		
		this.planetOrbit = planetOrbit;
		this.revolution = revolution;
		this.planetOrbit = planetOrbit;
		
		
	}
	
	
}