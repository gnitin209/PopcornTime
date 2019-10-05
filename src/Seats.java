import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Seats extends JFrame {
//	Entry seats;
	
	


	
	LinkedList<String> lstPlatUserSelected=new LinkedList<String>();
	
	 String strMovieId="";
	 String strSlotSelected="";
	 String strDateOfShowSelected="";
	//JCheckBox chb=new JCheckBox();
	
	DBHandler objDH=new DBHandler();
	Container c=null;
	{
	c=getContentPane();
	ImageIcon icn=new ImageIcon("welcome.jpg");
	JLabel lblBG=new JLabel(icn);
	lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	strMovieId=Movies.strMovieId;
	strSlotSelected=Movies.strSlotSelected;
	strDateOfShowSelected=Movies.strDateOfShowSelected;
	
	
	}
	
	int f=1;
//	public Seats(Entry seats)
//	{
//	this.seats=seats;
//	
//	}
	//Container c=null;
	
	JCheckBox chbplatinum[]=new JCheckBox[23];
	
	JCheckBox chbsilver[]=new JCheckBox[23];
	int i=0;
	 public Seats()
	 {
	 //AlreadygetPlseatsBooked
	 
	 
	 //setUndecorated(true);
	 c=getContentPane(); 
	 c.setLayout(null);
	 	 
	 
	 
	 int xpos=100;
	 int ypos=50;
	 
	 for(i=0;i<20;i++)
	 {
	 
	 
	 
	 
	 chbplatinum[i]=new JCheckBox(String .valueOf(f));
	 chbplatinum[i].setVisible(true);
	 //chbplatinum[i+1]
	 f++;
	 if(i<10)
	 chbplatinum[i].setBounds(xpos,50,70,40);
	 if(i==10)
	 {
	 xpos=100;
	 
	 }
	 if(i>9)
	 chbplatinum[i].setBounds(xpos,100,70,40);
	 chbplatinum[i].setBackground(Color.white);
	c. add(chbplatinum[i]);
	 xpos=xpos+100;
	
	 }
	 
	 try
	 {
	 ClsSeatsBooked objClsSeatsBooked=objDH.getRowFromtblseatbookedByMovieidDosSS(strMovieId, strDateOfShowSelected, strSlotSelected);
	 
	 String strPlatSeatsBooked=objClsSeatsBooked.getStrPlatinumSeatsbooked();//1,2,3,4
	 String[] arrPlatSeatsBookedAlready=strPlatSeatsBooked.split(",");
	 for (String str : arrPlatSeatsBookedAlready) 
	 {
	 chbplatinum[Integer.parseInt(str)-1].setEnabled(false);
	}
	 }
	 catch(Exception e)
	 {
	 
	 }
	 
	 
	 
	 
	 for(i=0;i<20;i++)
	 {
	 
	 chbplatinum[i].addItemListener(new ItemListener(){

	public void itemStateChanged(ItemEvent arg0) 
	{
	// TODO Auto-generated method stub
	//if(seats.chb.isSelected())
	
	JCheckBox chb=(JCheckBox) arg0.getSource();
	chb.setSelected(true);
	//JOptionPane.showMessageDialog(null, chb.getText());
	System.out.println("................1 p..........................");
	lstPlatUserSelected.add(chb.getText());
	System.out.println("................2 p..........................");
	//SeatSelected frm=new SeatSelected();
	setTitle(chb.getText());
	
	System.out.println(".................uuuuuuuuuuu start......................");
	for (String	 str : lstPlatUserSelected) 
	{
	System.out.println(str);
	}
	System.out.println(".................uuuuuuuuuuu end......................");
	chb.setEnabled(false);
	
	}///Endo f itemstate changed
	 });
	 }
	 
	
	 xpos=100;
	 ypos=220;
	 
	 
	 final JCheckBox chbgold[]=new JCheckBox[23];
	 for(int y=0;y<5;y++)
	 {
	 for(i=0;i<10;i++)
	 {
	 chbgold[i]=new JCheckBox(String.valueOf(f+"G"));
	 chbgold[i].setVisible(true);
	 f++;
	 chbgold[i].setBounds(xpos,ypos,100,40);
	 chbgold[i].setBackground(Color.white);
	 c.add(chbgold[i]);
	 
	 xpos=xpos+100;
	chbgold[i].addItemListener(new ItemListener(){
	
	 
	 

	public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	//JCheckBox chbgold=(JCheckBox)arg0.getSource();
	JCheckBox chb=(JCheckBox) arg0.getSource();
	chb.setSelected(true);
	JOptionPane.showMessageDialog(null, chb.getText());
	//SeatSelected frm=new SeatSelected();
	setTitle(chb.getText());
	
//	
	}
	
	 });
	 }
	 
	 ypos=ypos+50;
	 xpos=100;
	 }
	
	 
	 
	 xpos=100;
	 ypos=530;
	
	 for(i=0;i<20;i++)
	 {
	 chbsilver[i]=new JCheckBox(String.valueOf(f+"s"));
	 chbsilver[i].setVisible(true);
	 f++;
	 if(i<10)
	 chbsilver[i].setBounds(xpos,500,70,40);
	 if(i==10)
	 {
	 xpos=100;
	 
	 }
	 if(i>9)
	 {
	 chbsilver[i].setBounds(xpos,530,70,40);
	 
	 }
	 chbsilver[i].setBackground(Color.white);
	 c.add(chbsilver[i]);
	 xpos=xpos+100;
	 chbsilver[i].addItemListener(new ItemListener(){

	public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	chbsilver[i]=new JCheckBox();
	//JCheckBox chbsilver=(JCheckBox)arg0.getSource();
	JCheckBox chb=(JCheckBox) arg0.getSource();
	chb.setSelected(true);
	JOptionPane.showMessageDialog(null, chb.getText());
	//SeatSelected frm=new SeatSelected();
	setTitle(chb.getText());
	
	}
	 });
	 }
	
	 
	 JLabel lblScreenThisWay=new JLabel("ScreenThisWay");
	 lblScreenThisWay.setBounds(550,650,200,40);
	 add(lblScreenThisWay);
	 lblScreenThisWay.setForeground(Color.black);
	Font f=new Font("Arial",Font.BOLD,25);
	lblScreenThisWay.setFont(f);
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////CONFIRM/////////////////////////////////////
	 /////////////////////////////////////////////////////////////////////////////////
	 final JButton btncnfrm=new JButton("Confirm");
	 btncnfrm.setBounds(1500,250,200,40);
	 c.add(btncnfrm);
	 btncnfrm.addActionListener(new ActionListener(){
	 

	public void actionPerformed(ActionEvent arg0) 
	{
	
	
	
	
	String strPlatSeatSelByUser="";
	System.out.println("..............btn confirm.s................");
	int i=0;
	
	for (String str : lstPlatUserSelected) 
	{
	if(i==0)
	{
	strPlatSeatSelByUser=strPlatSeatSelByUser+str;
	}
	else
	{
	strPlatSeatSelByUser=strPlatSeatSelByUser+","+str;
	}
	i++;
	//System.out.println(str);
	}
	System.out.println(strPlatSeatSelByUser);
	
	//we need old platinum seats by moviedid,dos,slotofshow
	ClsSeatsBooked objClsSeatsBooked=objDH.getRowFromtblseatbookedByMovieidDosSS(strMovieId, strDateOfShowSelected, strSlotSelected);
	String strNOofAvailPlatinumSeats=objClsSeatsBooked.getStrPlatinumAvailSeats();
	int intNoOfAvailPlatSeats=Integer.parseInt(strNOofAvailPlatinumSeats)-i;//20-4= 16
	
	String strOldPlatSeatsBooked=objClsSeatsBooked.getStrPlatinumSeatsbooked();
	String strNewPlatSeatsBooked="";
	if(strOldPlatSeatsBooked!=null)
	{
	 strNewPlatSeatsBooked=strOldPlatSeatsBooked+","+strPlatSeatSelByUser;
	}
	else
	{
	strNewPlatSeatsBooked=strPlatSeatSelByUser;
	}
	//strPlatSeatSelByUser-- for ticket table 
	//                                                            strMovieId,String strDateOfShow,String strSlotShow,String strPLATINUMAVAILSEATS,String strPLATINUMSEATSBOOKED
	objDH.updtPSPseatsBookedPlatSeatsTblSeatsBookedByMvoiedIdDosSS(strMovieId, strDateOfShowSelected, strSlotSelected, String.valueOf(intNoOfAvailPlatSeats), strNewPlatSeatsBooked);
	
	
	//we need maxticketid,unm,mob,eid,strplatseatsselbyuser,,ps-=4,dos,slot,totalprice.
	System.out.println("..............btn confirm.e.............count platinum seats ="+ i+" strPlatSeatSelected ByUser "+ strPlatSeatSelByUser + "  date of show "+ strDateOfShowSelected +  " ");
	
	
	//	Receipt rp=new Receipt();
	}
	});
	
	/////////////////////////////////CONFIRM/////////////////////////////////////
	
	
	
//	}
//	});

	
	
	 
JPanel panelPlatinum=new JPanel();
panelPlatinum.setBounds(80,30,1150,125);
panelPlatinum.setBackground(Color.white);
c.add(panelPlatinum);


JPanel panelGold=new JPanel();
panelGold.setBounds(80,30,1150,125);
panelGold.setBackground(Color.lightGray);
c.add(panelGold);


JPanel panelSilver=new JPanel();
panelSilver.setBounds(80,30,1150,125);
panelSilver.setBackground(Color.white);
c.add(panelSilver);

c.setBackground(Color.pink);

//ImageIcon icnExitBtn=new ImageIcon("EXIT.png");
//JButton btnExit=new JButton (icnExitBtn);
//btnExit.setBounds(1100,70,100,60);
//c.add(btnExit);

//System.exit(DISPOSE_ON_CLOSE);
//lblBG.add(btnExit);


//ImageIcon icnEntryBtn=new ImageIcon("ENTRY (2).png");
//JButton btnEntry=new JButton (icnEntryBtn);
//btnEntry.setBounds(1100,500,100,60);
//c.add(btnEntry);


setTitle("Seats");
setVisible(true);
repaint();
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(3);
//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}

