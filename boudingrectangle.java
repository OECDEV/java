import java.awt.Graphics;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bouding {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300,200);
		f.setVisible(true);
	}
}

class MyPanel extends JPanel {
	public MyPanel() {
		
	}
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawOval(40, 40, 100, 100);
		g.setColor(Color.green);
		g.fillOval(70, 80, 200, 200);
		
	}
}
