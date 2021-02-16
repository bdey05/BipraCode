package bdey;
import java.awt.Graphics;

public class SmileyFace extends Face{
	public void drawLips(Graphics g){
		g.drawArc(25,25,20,20,225,90);
	}
}