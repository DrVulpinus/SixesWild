package icons;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Icon {
	ImageIcon image;
	String text;
	
	
	public Image getScaledImage(int width, int height)
	{
		return image.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
	}
	
	
	public ImageIcon getImage(){
		return image;
	}
	
	public String getText(){
		return text;
	}
	
	public void setImage(ImageIcon i){
		image = i;
	}
	
	public void setText(String s){
		text = s;
	}


	
}
