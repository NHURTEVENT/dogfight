package dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

// how the fuck on peut extend JPanel et Observable en même temps
public abstract class GamePanel extends JPanel implements Observer{ //pour le moment abstract car update de l'uml ne marche pas sinn
	
	private IGraphicsBuilder graphicsBuilder;

	public GamePanel(IGraphicsBuilder graphicsBuilder){
		
	}
	
	public void update(Observable observable){
		
	}
	
	public void paintComponent(Graphics graphics){
		
	}

	
}
