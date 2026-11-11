import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class drawRectandOval {
    public static void main(String args[]) {
        JFrame f = new JFrame("사각형과 원");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.setSize(300, 200);
        f.setVisible(true);
    }
}

class MyPanel extends JPanel {
    //  생성자를 만들어서 그 안에서 테두리(Border)를 설정.
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.blue));
    }

  
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 60, 60); // (50,50) 위치에 가로60, 세로60 사각형
        g.drawOval(50, 50, 60, 60); // 사각형 안에 꽉 차는 원
    }
}