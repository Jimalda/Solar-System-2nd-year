
public abstract class Solar_Body {
	/* we create an abstract class for the following solar bodies: Sun, Moon and Planets.*/
	public double rotationspeed;/*this variable will determine the speed of rotation of the solar body*/
	public double distance;/* this determines the distance between the solar body and its center of rotation*/
	public double angle;/* this determines the angle of the solar body in contrast to its center of rotation*/
	public double diameter; /* this determines the size of the solar body*/
	public String col;/* this determines the colour of the solar body*/
	
	/* the variables below are the distance, angle and the speed of the solar body's centre of rotation*/
	public double centreOfRotationdistance;
	public double centreOfRotationangle;
	public double centreOfRotationspeed;

	public Solar_Body(double distance, double angle, int diameter, String col, double rotationspeed)
	{
		/* this is the constructor*/
		this.distance = distance;
		this.angle = angle;
		this.diameter = diameter;
		this.col = col;
		this.rotationspeed=rotationspeed;

}

	public abstract void move(SolarSystem Solar);/* we create a move method that will be abstract since every solar_body will have a different movement*/


}

