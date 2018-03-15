import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Applet extends java.applet.Applet{
	Font f = new Font("TimesRoman", Font.BOLD, 36);
	
	public void paint(Graphics g) {
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString("Hello", 5, 25);
	  }

  }
