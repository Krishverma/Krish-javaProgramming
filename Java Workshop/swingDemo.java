import javax.swing.*;
import java.awt.*;

public class swingDemo{
    void simpleDemo(){
        JFrame f = new JFrame();
        JButton b = new JButton("Click Me");
        f.add(b);
        f.setSize(500,500);
        b.setBounds(100,100,100,100);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        swingDemo sd = new swingDemo();
        sd.simpleDemo();
    }
}