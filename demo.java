import java.awt.*;
class Demo{
public static void main(String[] args)

Frame f=new Frame("Frame Demo");
f.setSize(500,500);
f.setBackGround(color.yellow);
Button b=new Button("Username:");
TextField t=new TextField(" ");
f.setLayout(new FlowLayout());
f.add(b);
f.add(t);
f.setVisible(true);
}

