package dogfight.model;

import dogfight.model.Direction;
import dogfight.model.Dimension;
import dogfight.model.Position;

public class Mobile {
	
	private int speed;
	private Direction direction;
	private java.awt.Dimension dimension;
	private Position position;
	
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}
	
	public Direction getDirection(){
		return this.direction;
	}
	
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	
	public Position getPosition(){
		return this.position;
	}
	
	public void setPosition(){
		this.position = position;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getWidth(){
		return this.dimension.getWidth();
	}
	
	public int getHeight(){
		return this.dimension.getHeight();
	}
	
	public void move(){
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public boolean isPlayer(int player){
		
	}
	
	private void moveUp(){
		
	}
	
	private void moveRight(){
		
	}
	
	private void moveDown(){
		
	}
	
	private void moveLeft(){
		
	}
	
	public Color getColor(){
		
	}
	
	public IDogfightModel getIDogfightModel(){
		
	}
	
	public void setIDogfightModel(IDoghtfightModel dogfightModel){
		
	}
	
	public boolean hit(){
		
	}
	
	public boolean isWeapon(){
		
	}
	
	public Image getImage(){
		
	}
	
}
