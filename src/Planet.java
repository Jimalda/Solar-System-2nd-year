
public class Planet extends Solar_Body {
	/* this is the subclass Planet of Solar_Body*/


	public Planet(double distance, double angle, int diameter, String col,double rotation_speed, Sun rotates_over, SolarSystem Solar) {
		/* this is the constructor of the class*/
		super(distance, angle, diameter, col, rotation_speed);
		/* the variables below will take the values of the variables of the Sun is rotating over*/
		this.centreOfRotationdistance=rotates_over.distance;
		this.centreOfRotationangle=rotates_over.angle;
		this.centreOfRotationspeed=rotates_over.rotationspeed;
		Create_system.System.add(this);/* we add it to the solar system list upon constructing the object*/
	}
	
	@Override
	
	public void move(SolarSystem Solar) {
		/* we implement the move method so that it draws the planet. This will be used in a global move method in create_system*/
		Solar.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationdistance, centreOfRotationangle);
	
			
		
				
			}
}
