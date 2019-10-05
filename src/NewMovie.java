import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import oracle.jdbc.pool.OracleDataSource;

public class NewMovie extends JFrame
{

	JLabel strImageName=new JLabel();
	JTextField txtStartDate=new JTextField(),txtEndDate=new JTextField();
	public NewMovie()
	{ 
		 setLayout(null);
JPanel jpnlImg=new JPanel(new FlowLayout());
jpnlImg.add(strImageName);
jpnlImg.setBackground(Color.pink);

ImageIcon icnbg=new ImageIcon("adminbg.jpg");

JLabel lblBG=new JLabel(icnbg);
	lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	c.add(lblBG);
		
	


JScrollPane jsp=new JScrollPane(jpnlImg);
jsp.setBounds(400,100,500,350);
lblBG.add(jsp);

JButton btn=new JButton("Choose File");
btn.setBounds(400,60,100,20);
lblBG.add(btn);

btn.addActionListener(new ButtonHandler(this));

  
	}
		
	final DbHandler3 objDH=new DbHandler3();
		Container c=getContentPane();
		{
	 setLayout(null);
	 
	 	
	 
	 
	 JLabel lblMovieID=new JLabel("Movie ID");
	 lblMovieID.setBounds(50,80,100,20);
add(lblMovieID);
	 
	 final JTextField txtMovieID=new JTextField();
	 txtMovieID.setBounds(160,80,100,20);
	 add(txtMovieID);
	 
	 lblMovieID.setForeground(Color.white);
	 Font f = new Font("Arial",Font.BOLD,15);
	 lblMovieID.setFont(f);
	 
	 JLabel lblMovieName=new JLabel("Movie Name");
	 lblMovieName.setBounds(50,120,100,20);
	 add(lblMovieName);
	 
	 final JTextField txtMovieName=new JTextField();
	 txtMovieName.setBounds(160,120,100,20);
	 add(txtMovieName);
	 
	 lblMovieName.setForeground(Color.white);
	 Font f1 = new Font("Arial",Font.BOLD,15);
	 lblMovieName.setFont(f1);
	
	 
	 JLabel lblStars=new JLabel("Stars");
	 lblStars.setBounds(50,160,100,20);
	 add(lblStars);
	
	 final JTextField txtStars=new JTextField();
	 txtStars.setBounds(160,160,100,20);
	 add(txtStars);
	 lblStars.setForeground(Color.white);
	 Font f2 = new Font("Arial",Font.BOLD,15);
	 lblStars.setFont(f2);
	
	 
	 JLabel lblStartDate=new JLabel("Start Date (dd-mm-yyyy)");
	 lblStartDate.setBounds(50,240,300,20);
	 add(lblStartDate);
	 
	 
	 //String strStartDate[]= {" 20 july","21  july","22 july","23 july"};
	 
	 txtStartDate.setBounds(160,240,100,20);
	 add(txtStartDate);
	 
	 lblStartDate.setForeground(Color.white);
	 Font f3 = new Font("Arial",Font.BOLD,15);
	 lblStartDate.setFont(f3);
	
	 
	 JLabel lblEndDate=new JLabel("End Date (dd-mm-yyyy)");
	 lblEndDate.setBounds(50,280,100,20);
	// add(lblEndDate);
	 
	 //String strEndDate[]= {"20 july","21 july","22 july","23 july","24 july","25 july","26 july","27 july"};
	 
	 txtEndDate.setBounds(160,280,100,20);
	 add(txtEndDate);
	 lblEndDate.setForeground(Color.white);
	 Font f4 = new Font("Arial",Font.BOLD,15);
	 lblEndDate.setFont(f4);
	 

	 JLabel lblTimeSlot=new JLabel("Time SLOT");
	 lblTimeSlot.setBounds(50,500,100,20);
	 add(lblTimeSlot);
	 
	 final JCheckBox chb912=new JCheckBox("912");
	 chb912.setBounds(160,500,100,20);
	 add(chb912);
	 
	 final JCheckBox chb1215=new JCheckBox("1215");
	 chb1215.setBounds(260,500,100,20);
	 add(chb1215);
	 

	 final JCheckBox chb1518=new JCheckBox("1518");
	 chb1518.setBounds(360,500,100,20);
	 add(chb1518);
	 

	 final JCheckBox chb1821=new JCheckBox("1821");
	 chb1821.setBounds(460,500,100,20);
	 add(chb1821);

	 
	 lblTimeSlot.setForeground(Color.white);
	 Font f5 = new Font("Arial",Font.BOLD,15);
	 lblTimeSlot.setFont(f5);
	 
	 
	 
	 JLabel lblPlatinum=new JLabel("Platinum Price");
	 lblPlatinum.setBounds(50,310,100,20);
	 add(lblPlatinum);
	 
	 final JTextField txtPlatinum=new JTextField();
	 txtPlatinum.setBounds(160,310,100,20);
	add(txtPlatinum);
	 
	 lblPlatinum.setForeground(Color.white);
	 Font f6 = new Font("Arial",Font.BOLD,15);
	 lblPlatinum.setFont(f6);
	 
	 JLabel lblGold=new JLabel("Gold Price");
	 lblGold.setBounds(50,350,100,20);
	add(lblGold);
	
	 final JTextField txtGold=new JTextField();
	 txtGold.setBounds(160,350,100,20);
	 add(txtGold);
	 lblGold.setForeground(Color.white);
	 Font f7 = new Font("Arial",Font.BOLD,15);
	 lblGold.setFont(f7);
	 
	 
	 JLabel lblSilver=new JLabel("Silver Price");
	 lblSilver.setBounds(50,400,100,20);
	 add(lblSilver);
	 
	 final JTextField txtSilver=new JTextField();
	 txtSilver.setBounds(160,400,100,20);
	 add(txtSilver);
	 
		 
	 lblSilver.setForeground(Color.white);
	 Font f8 = new Font("Arial",Font.BOLD,15);
	 lblSilver.setFont(f8);	 
	 	 
	 
	 JButton btnDelete=new JButton("Delete");
		btnDelete.setBounds(160, 580, 100, 20);
      add(btnDelete);
      
      btnDelete.addActionListener(new ActionListener(){
	public void actionPerformed (ActionEvent arg0){
		String strMovieID;
  strMovieID=txtMovieID.getText();
		objDH.deleteFromtblNewMoviesbyMovieID(strMovieID);
		JOptionPane.showMessageDialog(null,"data deleted");
	}
});

	
		JButton btnUpdate=new JButton("Update");
		btnUpdate.setBounds(270, 580, 100, 20);
	add(btnUpdate);
		
		btnUpdate.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0){
		String strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912, strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice, strImageName;
		
		strMovieID=txtMovieID.getText();
		strMovieName=txtMovieName.getText();
		strStars=txtStars.getText();
		strStartDate=txtStartDate.getText();
		strEndDate=txtEndDate.getText();
		strSlot912=chb912.getText();
		strSlot1215=chb1215.getText();
		strSlot1518=chb1518.getText();
		strSlot1821=chb1821.getText();
		strPlatinumPrice=txtPlatinum.getText();
		strGoldPrice=txtGold.getText();
		strSilverPrice=txtSilver.getText();
	//strImageName=lblImageName.getText();
	
		objDH.updateIntotblNewMoviesbyMovieID(strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912, strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice, "strImageName");
		JOptionPane.showMessageDialog(null,"data Updated");
	}
});

	 
		JButton jbtnInsert=new JButton ("insert");
		jbtnInsert.setBounds(380, 580, 100, 20);
		add(jbtnInsert);
		
		ImageIcon icn=new ImageIcon("");
		JLabel lblBG=new JLabel(icn);
		lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		 c.add(lblBG);
		 
		jbtnInsert.addActionListener(new ActionListener(){
		 
		public void actionPerformed(ActionEvent arg0){
			String strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912 = null, strSlot1215 = null, strSlot1518 = null, strSlot1821 = null, strPlatinumPrice = null, strGoldPrice = null, strSilverPrice = null,strImageName;
			//JLabel lblMovieID=new JLabel("MovieID");
			//lblMovieID.setBounds(50, 50, 100, 20);
			
			//txtMovieID.setBounds(160, 50, 100, 20);
			//lblBG.add(txtMovieID);
			
			
			strMovieID=txtMovieID.getText();
			strMovieName=txtMovieName.getText();
			strStars=txtStars.getText();
			strStartDate=txtStartDate.getText();
			strEndDate=txtEndDate.getText();
			
			   SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
			   java.util.Date javaStartDate = null;
			   java.util.Date javaEndDate=null;
			
				try {
					javaStartDate = sdf1.parse(strStartDate);
					javaEndDate=sdf1.parse(strEndDate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			DBHandler objDH=new DBHandler();
			
			
			int diff=objDH.daysBetween(javaStartDate,javaEndDate);
			
			for(int i=0;i<=diff;i++)
			{
			    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
			    String strDateOfShow= formatter.format(javaStartDate);  
			    System.out.println(strDateOfShow); 
			//String strDateOfShow=javaStartDate.toString();
				
			if(chb912.isSelected())
			{
				
				//tblseatsbooked
//				(
//						ID                   Number(10),  1
//						MOVIEID            NUMBER(5) NOT NULL , 1
//						PLATINUMSEATS           NUMBER(8), 100
//						GOLDSEATS               NUMBER(8),     100
//						SILVERSEATS             NUMBER(8) ,100
//						PLATINUMSEATSBOOKED     VARCHAR(300), ""
//						GOLDSEATSBOOKED         VARCHAR(250) ,""
//						SILVERSEATSBOOKED       VARCHAR(200) ,""
//						DATEOFSHOW              VARCHAR(50),
//						PLATINUMAVAILSEATS      NUMBER(8),100
//						GOLDAVAILSEATS          NUMBER(8), 100
//						SILVERAVAILSEATS        NUMBER(8),100
//						SLOTOFSHOW              VARCHAR(10)912
//						);
				
				
				
				//String strDateOfTravel="28-02-2015";
//				int noofDays=3;
//				java.util.Date d=objDH.addDays(strDateOfTravel, noofDays);
//				System.out.println(d);
				 
				String strID, strPlatinumSeats="20", strGoldSeats="50",strSilverSeats="20",
				 strPlatinumSeatsbooked="", strGoldSeatsbooked="", strSilverSeatsbooked="",
				strPlatinumAvailSeats="20", strGoldAvailSeats="50",strSilverAvailSeats="20", strSlotOfShow="912";
				
				strID=String.valueOf(objDH.getMaxId("tblseatsbooked", "ID"));
			
					strSlot912=chb912.getText();
					
				//	JOptionPane.showMessageDialog(null, strDateOfShow+" oooooooo ");
					objDH.insertIntotblseatbooked(strID, strMovieID, strPlatinumSeats, strGoldSeats, strSilverSeats, strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked, strDateOfShow, strPlatinumAvailSeats, strGoldAvailSeats, strSilverAvailSeats, strSlotOfShow);
					
					
			}
			else
			{
				strSlot912="false";
			}
			if(chb1215.isSelected())
			{
				String strID, strPlatinumSeats="20", strGoldSeats="50",strSilverSeats="20",
						 strPlatinumSeatsbooked="", strGoldSeatsbooked="", strSilverSeatsbooked="",
						strPlatinumAvailSeats="20", strGoldAvailSeats="50",strSilverAvailSeats="20", strSlotOfShow="1215";
						
						strID=String.valueOf(objDH.getMaxId("tblseatsbooked", "ID"));
					
							strSlot1215=chb1215.getText();
							
							objDH.insertIntotblseatbooked(strID, strMovieID, strPlatinumSeats, strGoldSeats, strSilverSeats, strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked, strDateOfShow, strPlatinumAvailSeats, strGoldAvailSeats, strSilverAvailSeats, strSlotOfShow);
							
						
						
			}
			else
			{
				strSlot1215="false";
			}
			if(chb1518.isSelected())
			{
				String strID, strPlatinumSeats="20", strGoldSeats="50",strSilverSeats="20",
						 strPlatinumSeatsbooked="", strGoldSeatsbooked="", strSilverSeatsbooked="",
						strPlatinumAvailSeats="20", strGoldAvailSeats="50",strSilverAvailSeats="20", strSlotOfShow="1518";
						
						strID=String.valueOf(objDH.getMaxId("tblseatsbooked", "ID"));
					
							strSlot1518=chb1518.getText();
							
							objDH.insertIntotblseatbooked(strID, strMovieID, strPlatinumSeats, strGoldSeats, strSilverSeats, strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked, strDateOfShow, strPlatinumAvailSeats, strGoldAvailSeats, strSilverAvailSeats, strSlotOfShow);
							
							
						
			}
			else
			{
				strSlot1518="false";
			}
			if(chb1821.isSelected())
			{
				String strID, strPlatinumSeats="20", strGoldSeats="50",strSilverSeats="20",
						 strPlatinumSeatsbooked="", strGoldSeatsbooked="", strSilverSeatsbooked="",
						strPlatinumAvailSeats="20", strGoldAvailSeats="50",strSilverAvailSeats="20", strSlotOfShow="1821";
						
						strID=String.valueOf(objDH.getMaxId("tblseatsbooked", "ID"));
					
							strSlot1821=chb1821.getText();
							
							objDH.insertIntotblseatbooked(strID, strMovieID, strPlatinumSeats, strGoldSeats, strSilverSeats, strPlatinumSeatsbooked, strGoldSeatsbooked, strSilverSeatsbooked, strDateOfShow, strPlatinumAvailSeats, strGoldAvailSeats, strSilverAvailSeats, strSlotOfShow);
							
						
						
			}
			else
			{
				strSlot1821="false";
			}
			
			javaStartDate=objDH.addDays(javaStartDate, 1);	
			}//end of for loop
			
			
			
			strPlatinumPrice=txtPlatinum.getText();
			strGoldPrice=txtGold.getText();
			strSilverPrice=txtSilver.getText();
		//strImageName=lblImageName.getText();
			
			objDH.insertIntotblNewMovies( strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912,
					 strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice,ButtonHandler.strFileName);
			 
			JOptionPane.showMessageDialog(null, "data inserted");
			
		}
		});
						
		c.setBackground(Color.magenta);

	 setTitle("New Movie");
	 setVisible(true);
	 setBounds(0,0,700,800);
	 setSize(Toolkit.getDefaultToolkit().getScreenSize());
	
	// System.exit(DISPOSE_ON_CLOSE);
	 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }
}

