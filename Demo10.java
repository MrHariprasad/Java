import java.awt.*;
class Demo10
{
public static void main(String[] args)
{
	Frame f=new Frame("Frame Demo");
	f.setSize(500,500);
	f.setBackground(Color.yellow);
	Button b=new Button("User Name:");
	TextField t=new TextField( "");
	f.setLayout(new FlowLayout());
	f.add(b);
	f.add(t);
	f.setVisible(true);
}
}
