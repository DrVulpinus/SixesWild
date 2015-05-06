package icons;

import javax.swing.ImageIcon;

public class Icon6x3 extends Icon{
	
	public Icon6x3(){
		ImageIcon i = new ImageIcon("Images/Block_6x3.png");
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