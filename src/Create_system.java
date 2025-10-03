import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Create_system {
	static List<Solar_Body> System = new ArrayList<Solar_Body>();/* we create a list containing all the solar bodies of the system*/
	public static void move_Planets(List<Solar_Body> System, SolarSystem Solarsystem) throws InterruptedException {
		/* this method allows us to move all planets in the system depending on their rotation speed*/
		for (int a=0; a<System.size(); a++) {
			double velocity =System.get(a).rotationspeed;
			System.get(a).angle+=velocity;
			if ((System.get(a).getClass()== Moon.class)) {/* if the solar body is a moon, then we will also move its centerofrotationangle so it follows its planet*/
				System.get(a).centreOfRotationangle+=System.get(a).centreOfRotationspeed;
			}
			System.get(a).move(Solarsystem);
			
			
			}
		
		
		Solarsystem.finishedDrawing();
		TimeUnit.MILLISECONDS.sleep(40);/* every 40 milisecond, the planets move.*/
		
		move_Planets(System, Solarsystem);/* we use recursion so the method moves indefinetly*/
		}
	
	
	
	
	
	public static void main (String[] arg) throws InterruptedException {
		SolarSystem Solar= new SolarSystem(900,900) ;/* we create our solar system with all the planets and most of the moves*/
		/*we add the sun, the planets and the moons*/
		Sun Sun1= new Sun (0,0,75,"#ffbb00",Solar);
		Planet Mercury = new Planet (50,40,14,"#bfbfbf",10, Sun1, Solar);
		Planet Venus = new Planet (70, 10, 15, "#e8dec3",7, Sun1, Solar );
		Planet Earth = new Planet(90, 120, 18, "#0080ff", 6, Sun1, Solar) ;
		Planet Mars = new Planet(110, 50, 18, "#eb4807", 5, Sun1, Solar) ;
		Planet Jupiter = new Planet(170, 200, 45, "#ff3700", 4, Sun1, Solar) ;
		Planet Saturn = new Planet(250, 270, 37, "#f0eca8", 3, Sun1, Solar) ;
		Planet Uranus = new Planet(320, 90, 40, "#94e4ff", 2, Sun1, Solar) ;
		Planet Neptune = new Planet(390, 320, 40, "#4a47fc", 1, Sun1, Solar) ;
		Moon Luna=new Moon(10, 10, 5, "WHITE",20,Earth);
		Moon Phobos= new Moon (11,3,3,"GREEN",30,Mars);
		Moon Deimos= new Moon (18,240,3,"#b0a380",24,Mars);
		Moon Io = new Moon(30, 240, 4,"#ffee00",25,Jupiter);
		Moon Europa = new Moon(32, 3 , 2,"#cc9c5e",20,Jupiter);
		Moon Ganymede = new Moon(34, 67, 10,"#c7c4c3",17,Jupiter);
		Moon Callisto = new Moon(37, 128, 8,"#800121",13,Jupiter);
		Moon  Titan= new Moon(34, 150, 9,"#ffd930",14,Saturn);
		Moon Rhea= new Moon(28,100, 2, "LIGHT_GRAY",17,Saturn);
		Moon Miranda= new Moon(27,234, 2, "LIGHT_GRAY",23,Uranus);
		Moon Ariel = new Moon(30, 320, 3, "LIGHT_GRAY",20,Uranus);
		Moon Titiana = new Moon(37, 180, 5, "GRAY",12,Uranus);
		Moon Oberon = new Moon(40, 50, 4, "DARK_GRAY",8,Uranus);
		Moon Triton = new Moon(27, 189, 5, "GRAY",19,Neptune);
		Moon Proteus = new Moon(20, 250, 2, "LIGHT_GRAY",10,Neptune);
		move_Planets(System, Solar);/* we make all the planets move*/
	
		}}
