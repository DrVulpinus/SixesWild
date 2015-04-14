package icons;

import java.awt.Image;

public abstract class Icon {
	Image image;
	String text;
	
	public Icon(Image image, String text){
		this.image = image;
		this.text = text;
	}
	
	public Image getImage(){
		return image;
	}
	
	public String getText(){
		return text;
	}
	
}
