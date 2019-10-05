
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Receipt extends JFrame
{
	public Receipt()
	{
		Container c=getContentPane();
	setLayout(null);
	ImageIcon icnbg=new ImageIcon("receipt1.jpg");

	JLabel lblBG=new JLabel(icnbg);
		lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBG);
			
//		 
//		 JLabel lblMovieID=new JLabel("Movie ID");
//		 lblMovieID.setBounds(50,80,100,20);
//	lblBG.add(lblMovieID);
//		 
//		 final JTextField txtMovieID=new JTextField();
//		 txtMovieID.setBounds(160,80,100,20);
//		 lblBG.add(txtMovieID);
//		
	
	 JLabel lblMovieName=new JLabel("Movie Name");
	 lblMovieName.setBounds(400,120,100,20);
	 lblBG.add(lblMovieName);
	 
	final  JTextField txtMovieName=new JTextField();
	 txtMovieName.setBounds(500,120,100,20);
	 lblBG.add(txtMovieName);
	 
	 lblMovieName.setForeground(Color.white);
	 Font f1 = new Font("Arial",Font.BOLD,15);
	 lblMovieName.setFont(f1);
	 
	 txtMovieName.setForeground(Color.white);
		Font f6=new Font("Arial",Font.BOLD,20);
			txtMovieName.setFont(f6);
	 
	 
	 JLabel lblDate=new JLabel("Date");
	 lblDate.setBounds(400,160,100,20);
	 lblBG.add(lblDate);
	 
	 final JTextField txtDate=new JTextField();
	 txtDate.setBounds(500,160,100,20);
	 add(txtDate);
	 
	 lblDate.setForeground(Color.white);
	 Font f2 = new Font("Arial",Font.BOLD,15);
	 lblDate.setFont(f2);
	 txtDate.setForeground(Color.white);
		Font f7=new Font("Arial",Font.BOLD,20);
			txtDate.setFont(f7);
	 
	 
	 JLabel lblShowTiming=new JLabel("ShowTiming");
	 lblShowTiming.setBounds(400,200,100,20);
     lblBG.add(lblShowTiming);
	 
	 final JTextField txtShowTiming=new JTextField();
	 txtShowTiming.setBounds(500,200,100,20);
	 add(txtShowTiming);
	 
	 lblShowTiming.setForeground(Color.white);
	 Font f3 = new Font("Arial",Font.BOLD,15);
	 lblShowTiming.setFont(f3);
	 txtShowTiming.setForeground(Color.white);
		Font f8=new Font("Arial",Font.BOLD,20);
			txtShowTiming.setFont(f8);
	 
	 JLabel lblSeatNo=new JLabel("Seat No.");
	 lblSeatNo.setBounds(400,240,100,20);
	 lblBG.add(lblSeatNo);
	 
	 final JTextField txtSeatNo=new JTextField();
	 txtSeatNo.setBounds(500,240,100,20);
	 add(txtSeatNo);
	 
	 lblSeatNo.setForeground(Color.white);
	 Font f4 = new Font("Arial",Font.BOLD,15);
	 lblSeatNo.setFont(f4);
	 txtSeatNo.setForeground(Color.white);
		Font f9=new Font("Arial",Font.BOLD,20);
			txtSeatNo.setFont(f9);
	 
	 JLabel lblTotalAmount=new JLabel("Total Amount");
	 lblTotalAmount.setBounds(400,280,100,20);
	 lblBG.add(lblTotalAmount);
	 
	 final JTextField txtTotalAmount=new JTextField();
	 txtTotalAmount.setBounds(500,280,100,20);
	 add(txtTotalAmount);
	 
	 lblTotalAmount.setForeground(Color.white);
	 Font f5 = new Font("Arial",Font.BOLD,15);
	 lblTotalAmount.setFont(f5);
	 txtTotalAmount.setForeground(Color.white);
		Font f10=new Font("Arial",Font.BOLD,20);
			txtTotalAmount.setFont(f10);
	 
	 setTitle("Receipt");
	   setVisible(true);
	   setBounds(0,0,1500,1500);
	  
	   setSize(Toolkit.getDefaultToolkit().getScreenSize());
	   //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}


}