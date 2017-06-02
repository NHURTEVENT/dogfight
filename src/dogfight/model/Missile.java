package dogfight.model;

public class Missile extends Mobile{

	public static int SPEED=4;
	
	public static int WIDTH=30;
	
	public static int HEIGHT=10;
	
	public static int MAX_DISTANCE_TRAVELED = 1400;
	
	public static String IMAGE ="missile";
	
	private int distanceTraveled =0;
	
	
	public Missile(Direction direction,Dimension dimension){
		
		super(direction, new Position(0, 0, 100, 100)/*devant l'avion je suppose*/, dimension, SPEED,IMAGE );
	}
	
	public static int getWidthWithADirection(Direction direction){
		return WIDTH; // pas bon
		
	}
	
	public static int getHeightWithADirection(Direction direction){
		return HEIGHT; //pas bon
	}
}
