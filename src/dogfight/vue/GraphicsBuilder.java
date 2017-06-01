package dogfight.vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import dogfight.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	/*private BufferedImage epmtySky;
	private IDogfightModel dogfightModel;*/

	public GraphicsBuilder(IDogfightModel dogfightModel){
		
		IDogfightModel dogfightModel = new IDogfightModel(); 
		BufferedImage epmtySky = new BufferedImage(getGlobalWidth(),getGlobalHeight(), 0/*<- int ImageType*/);
		
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}
	
	public int getGlobalWidth(){
		return 1; /**TODO mettre un vrai return  */
	}
	
	public int getGlobalHeight(){
		return 1; /**TODO mettre un vrai return  */
	}

	
}
