package dogfight.vue;

import java.util.Observable;

import dogfight.controller.IOrderPerformer;
import dogfight.gameframe.GameFrame;
import dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable {
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		EventPerformer eventPerformer = new EventPerformer(orderPerformer);
		GraphicsBuilder graphicsBuilder = new GraphicsBuilder(dogfightModel);
		GameFrame gameFrame = new GameFrame("titre",eventPerformer,graphicsBuilder,observable);
	}
	
	//l'uml la donne en private mais éclipse n'est pas content
	public void run(){
		
	}
	
	public void displayMessage(String message){
		
	}
	
	public void closeAll(){
		
	}
}
