import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FrontPage extends JFrame
{
Container c=null;
	
    public FrontPage()
	{
			setLayout(null);
		c=getContentPane();
		ImageIcon icnbg=new ImageIcon("seats1.jpg");
		
	JLabel lblBG=new JLabel(icnbg);
		lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBG);
			
		
		JLabel lblCinema=new JLabel("Cinema....");
		 lblCinema.setBounds(100,120,400,60);
	lblBG.add(lblCinema);
	
    			
	 lblCinema.setForeground(Color.white);
	 Font f3 = new Font("Arial",Font.BOLD,60);
	 lblCinema.setFont(f3);
	 
	 JLabel lblMovieplex=new JLabel("Movieplex");
	 lblMovieplex.setBounds(50,60,400,60);
lblBG.add(lblMovieplex);

			
 lblMovieplex.setForeground(Color.white);
 Font f4 = new Font("Arial",Font.BOLD,60);
 lblMovieplex.setFont(f4);
 
 JLabel lblWhereFunIsEndless=new JLabel("Where Fun Is Endless");
 lblWhereFunIsEndless.setBounds(150,180,600,90);
lblBG.add(lblWhereFunIsEndless);

		
lblWhereFunIsEndless.setForeground(Color.white);
Font f5 = new Font("Arial",Font.ITALIC,40);
lblWhereFunIsEndless.setFont(f5);
	 
		JButton btn=new JButton("Admin");
		 btn.setBounds(700,300,300,90);
		 lblBG.add(btn);
		btn.setForeground(Color.BLACK);
		Font f=new Font("Arial",Font.BOLD,24);
			btn.setFont(f);
		
		 JLabel lblch1=new JLabel("Selected Seat");
          btn.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent arg0){
				 AddMovie ad=new AddMovie();
		}
	 });
		

		 JButton btn1=new JButton("Book Movie");
		 btn1.setBounds(700,450,300,90);
		 lblBG.add(btn1);
		 btn1.setForeground(Color.BLACK);
		// Font f=new Font("Arial",Font.BOLD,24);
		 btn1.setFont(f);
			
		 			
		
			
		 btn1.addActionListener(new ActionListener(){
			 
			 public void actionPerformed(ActionEvent arg0){
				 Bookmovie bk=new Bookmovie();
			 }
		 });
			 
		 
			 
		 
		 setTitle("BookMyShow");
		 setVisible(true);
		 setBounds(0,0,700,800);
		 setSize(Toolkit.getDefaultToolkit().getScreenSize());
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
			 }
			 
          	

          }

