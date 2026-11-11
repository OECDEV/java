import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Line {
	public static void main(String args[]) {
		JFrame f = new JFrame("선");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300,200);
		f.setVisible(true);
	}
}

class MyPanel extends JPanel {
	public MyPanel() {
	setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(10,10,-10,-10);
		int[] xPoints = {20,40,60,80,100};
		int[] yPoints = {120,40,60,180,150};
		int npoints = xPoints.length;
		g.setColor(Color.blue);
		g.drawPolyline(xPoints, yPoints, npoints);
		}
		
	}

