public abstract class Celestial_Object {
	
	// Take diameter in miles.
	public int diameter;
	public float rotation;
	public String name;
	
	Celestial_Object(int diameter, float rotation, String name) {
		
		this.name = name;
		this.diameter = diameter;
		this.rotation = rotation;
		
	}
	
	
}