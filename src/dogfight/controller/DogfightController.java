package dogfight.controller;
/** import de model.missile*/

public class DogfightController implements IOrderPerformer{

	public static int TIME_SLEEP =30;
	private IDogFightModel dogfightModel; // je ne sais pas si l uml réfère au fonction ou veut des attributs également
	private IViewSystem viewSystem;	//cf au dessus
	
	public DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel= dogfightModel; //je passerais bien par un setter mais l uml n en a pas
		
		
	}	
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		Missile missile = new Missile();
	}
	
	private void launchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}
	

}
