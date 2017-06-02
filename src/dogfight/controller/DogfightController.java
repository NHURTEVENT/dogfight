package dogfight.controller;

import dogfight.model.IDogfightModel;
import dogfight.model.Missile;
import dogfight.vue.IViewSystem;

/** import de model.missile*/

public class DogfightController implements IOrderPerformer{

	public static int TIME_SLEEP =30;
	private IDogfightModel dogfightModel; // je ne sais pas si l uml réfère au fonction ou veut des attributs également
	private IViewSystem viewSystem;	//cf au dessus
	
	public DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel= dogfightModel; //je passerais bien par un setter mais l uml n en a pas
		
	}	
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
	private void launchMissile(int player){
		Missile missile = new Missile(null,null);
		
	}
	
	private void gameLoop(){
		
	}
	

}
