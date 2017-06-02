package dogfight.model;

public class Plane extends Mobile{
	
	public static int SPEED=2;
	
	public static int WIDTH=100;
	
	public static int HEIGHT=30;
	
	private int player;
	
	
	
	public Plane(int player, Direction direction, Position position, String image){
		
		//j'ai du set une position au pif avec maxX et Y au pif
		
		super(direction, new Position(0, 0, 100, 100), new Dimension(WIDTH, HEIGHT), SPEED, "Avion"); //tiens il a pas d'image lui
	}
	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	public boolean hit(){
		return false;
	}
	

}
