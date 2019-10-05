import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;


public class welcome extends JFrame {
	public welcome()
	{
	setTitle("Welcome");
	setVisible(true);
	setBounds(0,0,500,500);
	//setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
}
}