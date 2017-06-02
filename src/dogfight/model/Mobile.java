package dogfight.model;

import dogfight.model.Direction;

import java.awt.Color;
import java.awt.Image;

import dogfight.model.Dimension;
import dogfight.model.Position;

public class Mobile {
	
	private int speed;
	private Direction direction;
	private Dimension dimension;
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
	
	public Dimension getDimension(){
		return this.dimension;
	}
	
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getWidth(){
		return (int) this.dimension.getWidth();
	}
	
	public int getHeight(){
		return (int) this.dimension.getHeight();
	}
	
	public void move(){
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public boolean isPlayer(int player){
		return false;
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
		return null;//<Color>;
		
	}
	
	public IDogfightModel getIDogfightModel(){
		return null;//<IDogfightModel>;
	}
	
	public void setIDogfightModel(IDogfightModel dogfightModel){
		
	}
	
	public boolean hit(){
		return false;
		
	}
	
	public boolean isWeapon(){
		return false;
		
	}
	
	public Image getImage(){
		return null;//<Image>;
	}
	
}
