public class Moon extends Celestial_Object {
	
	public int diameter; 
	public float rotation;
	public float revolution;
	public Planet planetOrbit;
	
	public Moon(int diameter, float rotation, float revolution, Planet planetOrbit) {
		
		super(diameter, rotation);
		
		this.revolution = revolution;
		this.planetOrbit = planetOrbit;
		
		
	}
	
	
}