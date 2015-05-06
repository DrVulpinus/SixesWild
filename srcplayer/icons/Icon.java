package icons;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Icons images for block
 * @author Qiaoyu Liao
 * @author Alex Wald
 */
public abstract class Icon {
	ImageIcon image;
	String text;
	
	
	public ImageIcon getScaledImage(int width, int height)
	{
		if (width == 0 || height == 0){
			width = 1;
			height = 1;
		}
		
		Image i = image.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(i);
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
