package icons;

import javax.swing.ImageIcon;

/**
 * Icons images for block
 * @author Qiaoyu Liao
 *
 */
public class Icon2x2 extends Icon {
	
	public Icon2x2(){
		ImageIcon i = new ImageIcon("images/Block_2x2.png");
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
