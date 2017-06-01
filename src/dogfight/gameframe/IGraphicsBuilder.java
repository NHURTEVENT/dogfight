package dogfight.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

	public void applyModelToGraphics(Graphics gaphics,ImageObserver Observer);
	
	public int getGlobalWidth();

	public int getGlobalHeight();
	
}
