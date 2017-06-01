package dogfight.model;

import java.util.ArrayList;
import dogfight.model.IMobile;

public class DogfightModel extends Observable implements IDogfightModel{
	
	private ArrayList<IMobile> mobile;
	
	public DogfightModel(){
		
	}
	
	public void addMobile(IMobile mobile){
		
	}
	
	public void removeMobile(IMobile mobile){
		
		
	}
	
	public ArrayList<IMobile> getMobiles(){
		return mobile;
	}
	
	public IMobile getMobileByPlayer(int player){
		return null;
	}
	
	public void setMobilesHavesMoved(){
		
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(dogfight.model.Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
}
