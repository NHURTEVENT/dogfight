package dogfight.model;

public class Plane extends Mobile{
	
	public static int SPEED=2;
	
	public static int WIDTH=100;
	
	public static int HEIGHT=30;
	
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image){
		
	}
	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	public boolean hit(){
		return false;
	}
	

}
