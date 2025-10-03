
public class Sun extends Solar_Body {
	/* this is the subclass Sun of Solar_Body*/

	public Sun(double distance, double angle, int diameter, String col, SolarSystem Solar) {
		/* this is the constructor of the class*/
		super(distance, angle, diameter, col, angle);
		Solar.drawSolarObject(distance, angle, diameter, col);
		double rotation_speed=0;/* a star will not move so the rotation speed is 0*/
		Create_system.System.add(this);/* we add it to the solar system list upon constructing the object*/
		
	}

	@Override
	public void move(SolarSystem Solar) {
	/* we implement the move method so that it draws the sun. This will be used in a global move method in create_system*/
	Solar.drawSolarObject(distance, angle, diameter, col);
	}


	
}


