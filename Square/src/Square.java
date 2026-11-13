import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Square {
public static void main(String[] args) {
JFrame f = new JFrame("사각형");

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(new MyPanel());
    f.setSize(300, 250);
    f.setVisible(true);
}

}

class MyPanel extends JPanel {

public MyPanel() {
    setBorder(BorderFactory.createLineBorder(Color.BLUE));
}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // 기본 사각형
    g.drawRect(10, 10, 50, 50);

    // 채워진 사각형
    g.setColor(Color.RED);
    g.fillRect(70, 10, 50, 50);

    // 모서리가 둥근 사각형
    g.setColor(Color.BLACK);
    g.drawRoundRect(130, 10, 50, 50, 20, 20);

    // 모서리가 둥근 사각형 채우기
    g.fillRoundRect(190, 10, 50, 50, 20, 20);

    // 입체적인 사각형
    g.draw3DRect(10, 100, 50, 50, true);

    // 입체적인 사각형 채우기
    g.fill3DRect(70, 100, 50, 50, true);
}

}