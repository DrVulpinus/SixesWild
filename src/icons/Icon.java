package icons;

import java.awt.Image;

public abstract class Icon {
	Image image;
	String text;
	
	
	public Image getImage(){
		return image;
	}
	
	public String getText(){
		return text;
	}
	
	public void setImage(Image i){
		image = i;
	}
	
	public void setText(String s){
		text = s;
	}


	
}
