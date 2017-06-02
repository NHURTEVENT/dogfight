package dogfight.vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import dogfight.gameframe.IGraphicsBuilder;
import dogfight.model.DogfightModel;
import dogfight.model.IDogfightModel;
import dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	/*private BufferedImage epmtySky;
	private IDogfightModel dogfightModel;*/

	public GraphicsBuilder(IDogfightModel dogfightModel){
		
		IDogfightModel dogfightModel2 = new DogfightModel(); //ou alors faut faire un truc avec dogfightmodel
		BufferedImage epmtySky = new BufferedImage(getGlobalWidth(),getGlobalHeight(),BufferedImage.TYPE_INT_RGB /*<- int ImageType*/);
		
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
