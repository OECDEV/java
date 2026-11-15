import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arc {
    public static void main(String[] args) {
        JFrame f = new JFrame("호 그리기");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.setSize(300, 200);
        f.setVisible(true);
    }
}

class MyPanel extends JPanel {
    public MyPanel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawArc(50, 50, 50, 50, 50, 50);
        g.setColor(Color.blue);
        g.fillArc(100, 100, 100, 100, 100, 100);
    }
}
