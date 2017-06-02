package dogfight.model;

public class Cloud extends Mobile{

	public static int SPEED =1;
	
	public static int WIDTH = 300;

	public static int HEIGHT =150;
	
	public static String IMAGE = "cloud";
	
	public Cloud(Direction direction, Dimension dimension){
		super(direction, new Position(0, 0, 100, 100)/*position random*/ ,dimension, SPEED, IMAGE); //je sais pas faire
	}
	//
}
