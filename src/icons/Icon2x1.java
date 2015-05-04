package icons;

import javax.swing.ImageIcon;

public class Icon2x1 extends Icon{
	
	public Icon2x1(){
		ImageIcon i = new ImageIcon("Images/Block_2x1.png");
		String t = null;
		super.setImage(i);
		super.setText(t);
	}

	
	public ImageIcon getImage(){
		return super.getImage();
	}
	
	public String getText(){
		return super.getText();
	}
	
	public void setImage(ImageIcon i){
		super.setImage(i);
	}
	
	public void setText(String s){
		super.setText(s);
	}

}
