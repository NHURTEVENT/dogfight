package dogfight.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import dogfight.model.Dimension;

public class Sky implements IArea{
	
	private Dimension dimension;
	
	
	
	public Sky(Dimension dimension){
		Image image = new Image() {
			
			@Override
			public int getWidth(ImageObserver observer) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ImageProducer getSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getProperty(String name, ImageObserver observer) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getHeight(ImageObserver observer) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Graphics getGraphics() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
	}
	
	public Dimension getDimension(){
		return this.dimension;
	}
	
	public Image getImage(){
		return null;//<Image>;
	}
	
}
