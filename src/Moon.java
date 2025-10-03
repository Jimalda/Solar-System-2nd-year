
public class Moon extends Solar_Body {
	/* this is the subclass Moon of Solar_Body*/

	
	public Moon(double distance, double angle, int diameter, String col, double rotation_speed, Planet rotates_over) {
		/* this is the constructor of the class*/
		super(distance, angle, diameter, col,rotation_speed);
		/* the variables below will take the values of the variables of  the planet is rotating over*/
		this.centreOfRotationdistance=rotates_over.distance;
		this.centreOfRotationangle=rotates_over.angle;
		this.centreOfRotationspeed=rotates_over.rotationspeed;
		/* we add it to the solar system list upon constructing the object*/
		Create_system.System.add(this);
	}
	
	
	public void move(SolarSystem Solar) {
		/* we implement the move method so that it draws the moon. This will be used in a global move method in create_system*/
		Solar.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationdistance, centreOfRotationangle);
	
			
		
				
			}
}
