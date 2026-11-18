import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    Font a, b, c, d, e, f;

    public MyPanel() {
        a = new Font("Serif", Font.PLAIN, 20);
        b = new Font("SansSerif", Font.ITALIC, 20);
        c = new Font("Monospaced", Font.PLAIN, 20);
        d = new Font("Dialog", Font.BOLD, 20);
        e = new Font("DialogInput", Font.ITALIC, 20);
        f = new Font("Serif", Font.BOLD, 20);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        

        g.setFont(a);
        g.drawString("HelloWorld (Serif Plain)", 20, 35);
        
        g.setFont(b);
        g.drawString("HelloWorld (SansSerif Italic)", 20, 70);
        
        g.setFont(c);
        g.drawString("HelloWorld (Monospaced Plain)", 20, 105);
        
        g.setFont(d);
        g.drawString("HelloWorld (Dialog Bold)", 20, 140);
        
        g.setFont(e);
        g.drawString("HelloWorld (DialogInput Italic)", 20, 175);
        
        g.setFont(f);
        g.drawString("HelloWorld (Serif Bold)", 20, 210);
    }
}

public class FontTest extends JFrame {
  
    public FontTest() {
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("폰트");
        
        JPanel panel = new MyPanel();
        add(panel);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new FontTest();
    }
}