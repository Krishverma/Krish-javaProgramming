import java.awt.*;
public class guiDemo extends Frame{
    void exampleButton(){
        Frame f = new Frame();
        Label l = new Label("Employeee");
        TextField t = new TextField();
        Button b = new Button("Click Me");
        f.setBackground(Color.blue);
        f.setSize(500,500);
        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setTitle("Info Demo");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        guiDemo eg = new guiDemo();
        eg.exampleButton();
    }
}