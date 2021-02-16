package bdey;

import java.awt.Image;
import java.awt.Graphics;

public class Coin{
	private Image heads;
	private Image tails;
	private int sideDisplayed;
	
	public Coin(Image h, Image t){
		heads = h;
		tails = t;
		sideDisplayed = 0;
	}
	public void flip(){
		if (sideDisplayed == 0){
			sideDisplayed = 1;
		}
		else{
			sideDisplayed = 0;
		}
	}
	public void draw(Graphics g, int x, int y){
		Image pic;
		
		if (sideDisplayed == 0){
			pic = heads;
		}
		else{
			pic = tails;
		}
	     
		g.drawImage(pic, pic.getWidth(null)/3, pic.getHeight(null)/3, null);
		
	}
	
}