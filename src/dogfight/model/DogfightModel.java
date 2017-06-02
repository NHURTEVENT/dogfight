package dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

import dogfight.model.IMobile;

public class DogfightModel extends Observable implements IDogfightModel{
	
	private ArrayList<IMobile> mobiles;
	
	public DogfightModel(){
		
	}
	
	public void addMobile(IMobile mobile){
		
	}
	
	public void removeMobile(IMobile mobile){
		
		//
	}
	
	public ArrayList<IMobile> getMobiles(){
		return this.mobiles;
	}
	
	public IMobile getMobileByPlayer(int player){
		return null;
	}
	
	public void setMobilesHavesMoved(){
		
	}

	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	public void buildArea(dogfight.model.Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
}
