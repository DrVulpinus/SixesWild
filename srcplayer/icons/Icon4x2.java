package icons;

import javax.swing.ImageIcon;

public class Icon4x2 extends Icon{
	
	public Icon4x2(){
		ImageIcon i = new ImageIcon("Images/Block_4x2.png");
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