
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class Movies extends JFrame implements ListSelectionListener 
{
	 JComboBox<String>chbShowDates=new JComboBox<String>();
	JPanel pnlProdDesc=new JPanel();
	JLabel lblPic;
	JLabel lblBG;
	JSplitPane splitPane;
	JLabel lblProdDesc;
	JLabel lblImg=new JLabel();
	//String[]ImageNames={"strImageName"};
	Container c=getContentPane();
	 JComboBox<String> chbShowTimes=new JComboBox<String>();
	JRadioButton rdbSlot912=new JRadioButton("9-12");
	JRadioButton rdbSlot1215=new JRadioButton("12-15");
	JRadioButton rdbSlot1518=new JRadioButton("15-18");
	JRadioButton rdbSlot1821=new JRadioButton("18-21");

	static String strMovieId="";
	static String strSlotSelected="";
	static String strDateOfShowSelected="";
	public void valueChanged(ListSelectionEvent arg0) {
	
		// TODO Auto-generated method stub
	}
		
		public Movies()
		{ 
			setLayout(null);
			
			Container c=getContentPane();
							
			c.add(pnlProdDesc);
			
			lblProdDesc=new JLabel("");
			lblProdDesc.setBounds(50,50,100,20);
			
			pnlProdDesc.setLayout(null);
			pnlProdDesc.setBounds(50,150,100,20);
				
		
		JPanel jpnlImg=new JPanel(new FlowLayout());
		jpnlImg.add(lblImg);
		jpnlImg.setBackground(Color.pink);
		
		ImageIcon icnbg=new ImageIcon("adminbg.jpg");

		JLabel lblBG=new JLabel(icnbg);
			lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
			c.add(lblBG);
				



		JScrollPane jsp=new JScrollPane(jpnlImg);
		jsp.setBounds(400,100,500,350);
	 lblBG.add(jsp);
		
	}
		
			
		final DbHandler3 objDH=new DbHandler3();
			{
		 setLayout(null);
		 
		 	
		 
		 
		 JLabel lblMovieID=new JLabel("Movie ID");
		 lblMovieID.setBounds(50,80,100,20);
	add(lblMovieID);
		 
		 final JTextField txtMovieID=new JTextField();
		 txtMovieID.setBounds(160,80,100,20);
		 add(txtMovieID);
		 txtMovieID.disable();
		 
		 
		 lblMovieID.setForeground(Color.white);
		 Font f = new Font("Arial",Font.BOLD,15);
		 lblMovieID.setFont(f);
		txtMovieID.setForeground(Color.red);
			Font f12=new Font("Arial",Font.BOLD,20);
				txtMovieID.setFont(f12);
			
//		 txtMovieID.setForeground(Color.red);
//		 Font f12 = new Font("Arial",Font.BOLD,15);
//		 txtMovieID.setFont(f12);
		 
		 JLabel lblMovieName=new JLabel("Movie Name");
		 lblMovieName.setBounds(50,120,100,20);
		 add(lblMovieName);
		 
		 final JTextField txtMovieName=new JTextField();
		 txtMovieName.setBounds(160,120,100,20);
		 add(txtMovieName);
		 txtMovieName.disable();
		 
		 lblMovieName.setForeground(Color.white);
		 Font f1 = new Font("Arial",Font.BOLD,15);
		 lblMovieName.setFont(f1);
		 txtMovieName.setForeground(Color.red);
			Font f13=new Font("Arial",Font.BOLD,20);
				txtMovieName.setFont(f13);
		 
		 JLabel lblStars=new JLabel("Stars");
		 lblStars.setBounds(50,160,100,20);
		 add(lblStars);
		
		 final JTextField txtStars=new JTextField();
		 txtStars.setBounds(160,160,100,20);
		 add(txtStars);
		 txtStars.disable();
		 lblStars.setForeground(Color.white);
		 Font f2 = new Font("Arial",Font.BOLD,15);
		 lblStars.setFont(f2);
		 txtStars.setForeground(Color.red);
			Font f14=new Font("Arial",Font.BOLD,20);
				txtMovieID.setFont(f14);
		 
		 JLabel lblStartDate=new JLabel("Start Date");
		 lblStartDate.setBounds(50,240,100,20);
		 add(lblStartDate);
		
		 final JTextField txtStartDate=new JTextField();
		 txtStartDate.setBounds(160,240,100,20);
		 add(txtStartDate);
		 txtStartDate.disable();

		 lblStartDate.setForeground(Color.white);
		 Font f3 = new Font("Arial",Font.BOLD,15);
		 lblStartDate.setFont(f3);
		
		 txtStartDate.setForeground(Color.red);
			Font f15=new Font("Arial",Font.BOLD,20);
				txtStartDate.setFont(f15);
				
		 JLabel lblEndDate=new JLabel("End Date");
		 lblEndDate.setBounds(50,280,100,20);
		 add(lblEndDate);
		 
		 final JTextField txtEndDate=new JTextField();
		 txtEndDate.setBounds(160,280,100,20);
		 add(txtEndDate);
		 txtEndDate.disable();
		 lblEndDate.setForeground(Color.white);
		 Font f4 = new Font("Arial",Font.BOLD,15);
		 lblEndDate.setFont(f4);
		 
		 txtEndDate.setForeground(Color.red);
			Font f16=new Font("Arial",Font.BOLD,20);
				txtEndDate.setFont(f16);
				
		 JLabel lblTimeSlot=new JLabel("Time SLOT");
		 lblTimeSlot.setBounds(50,500,100,20);
		 add(lblTimeSlot);
		 
		
		 rdbSlot912.setBounds(160,500,100,20);
		 add(rdbSlot912);
		 //rdbSlot912.disable();
		
		 
		 rdbSlot1215.setBounds(160,530,100,20);
		 add(rdbSlot1215);
		 
		 

		 rdbSlot1518.setBounds(160,560,100,20);
		 add(rdbSlot1518);

		 
		 rdbSlot1821.setBounds(160,590,100,20);
		 add(rdbSlot1821);
		 
		 lblTimeSlot.setForeground(Color.white);
		 Font f5 = new Font("Arial",Font.BOLD,15);
		 lblTimeSlot.setFont(f5);
		 
		 rdbSlot912.setForeground(Color.red);
			Font f17=new Font("Arial",Font.BOLD,20);
			rdbSlot912.setFont(f17);
				
				rdbSlot1215.setForeground(Color.red);
				Font f21=new Font("Arial",Font.BOLD,20);
				rdbSlot1215.setFont(f21);
					
					rdbSlot1518.setForeground(Color.red);
					Font f22=new Font("Arial",Font.BOLD,20);
					rdbSlot1518.setFont(f22);
						
						rdbSlot1821.setForeground(Color.red);
						Font f23=new Font("Arial",Font.BOLD,20);
						rdbSlot1821.setFont(f23);
							
			JLabel lblShowDates =new JLabel("ShowDates");
			lblShowDates.setBounds(750,450,100,20);
			add(lblShowDates);
			
		//	String strShowDates[]={"20-7-2018","21-7-2018","22-7-2018","23-7-2018","24-7-2018","25-7-2018","26-7-2018","27-7-2018"};
			
			
			chbShowDates.setBounds(750,480,100,40);
			add(chbShowDates);
			
			
			lblShowDates.setForeground(Color.white);
			 Font f9 = new Font("Arial",Font.BOLD,15);
			// lblTimeSlot.setFont(f9);
			
//			JLabel lblShowTimes =new JLabel("ShowTimes");
//			lblShowTimes.setBounds(900,450,100,20);
//			add(lblShowTimes);
//			
			//String strShowTimes[]={"9-12 AM","12-15 PM","15-18 PM","18-21 PM"};
			
//			chbShowTimes.setBounds(900,480,100,40);
//			add(chbShowTimes);
//			lblShowTimes.setForeground(Color.white);
//			 Font f10 = new Font("Arial",Font.BOLD,15);
//			 lblTimeSlot.setFont(f10);
//			
		 
		 
		 
		 JLabel lblPlatinum=new JLabel("Platinum Price");
		 lblPlatinum.setBounds(50,310,100,20);
		 add(lblPlatinum);
		 
		 final JTextField txtPlatinum=new JTextField();
		 txtPlatinum.setBounds(160,310,100,20);
		add(txtPlatinum);
		 txtPlatinum.disable();
		 lblPlatinum.setForeground(Color.white);
		 Font f6 = new Font("Arial",Font.BOLD,15);
		 lblPlatinum.setFont(f6);
		 txtPlatinum.setForeground(Color.red);
			Font f18=new Font("Arial",Font.BOLD,20);
				txtPlatinum.setFont(f18);
		 
		 JLabel lblGold=new JLabel("Gold Price");
		 lblGold.setBounds(50,350,100,20);
		add(lblGold);
		
		 final JTextField txtGold=new JTextField();
		 txtGold.setBounds(160,350,100,20);
		 add(txtGold);
		 txtGold.disable();
		 lblGold.setForeground(Color.white);
		 Font f7 = new Font("Arial",Font.BOLD,15);
		 lblGold.setFont(f7);
		 txtGold.setForeground(Color.red);
			Font f19=new Font("Arial",Font.BOLD,20);
				txtGold.setFont(f19);
		 
		 JLabel lblSilver=new JLabel("Silver Price");
		 lblSilver.setBounds(50,400,100,20);
		 add(lblSilver);
		 
		 final JTextField txtSilver=new JTextField();
		 txtSilver.setBounds(160,400,100,20);
		 add(txtSilver);
		 txtSilver.disable();
		 lblSilver.setForeground(Color.white);
		 Font f8 = new Font("Arial",Font.BOLD,15);
		 lblSilver.setFont(f8);	 
		 	 
		 txtSilver.setForeground(Color.red);
			Font f20=new Font("Arial",Font.BOLD,20);
				txtSilver.setFont(f20);
				
	      ImageIcon icnSBtn=new ImageIcon("button_submit.png");
	      JButton btnSUBMIT=new JButton (icnSBtn);
	      	btnSUBMIT.setBounds(320,550,91,40);
	      	add(btnSUBMIT);
	      	
	      	 btnSUBMIT.addActionListener(new ActionListener() {
	      			
	      			public void actionPerformed(ActionEvent arg0) {
	      				// TODO Auto-generated method stub
	      				strMovieId=txtMovieID.getText();
	      				strDateOfShowSelected=chbShowDates.getSelectedItem().toString();
	      				
	      				if(rdbSlot1215.isSelected())
	      				{
	      					strSlotSelected=rdbSlot1215.getText();
	      				}
	      				else if(rdbSlot1518.isSelected())
	      				{
	      					strSlotSelected=rdbSlot1518.getText();
	      				}
	      				else if(rdbSlot1821.isSelected())
	      				{
	      					strSlotSelected=rdbSlot1821.getText();
	      				}
	      				else if(rdbSlot912.isSelected())
	      				{
	      					strSlotSelected=rdbSlot912.getText();
	      				}
	      				JOptionPane.showMessageDialog(null, "Date selected by user is : "+ strDateOfShowSelected + " movie selected is "+ strMovieId+" slot of show selected is "+ strSlotSelected);
	      				Seats st=new Seats();
	      			}
	      		});
	      		
	      		

		 LinkedList<Admin1>objList=objDH.getNewMoviesTable();
			final JComboBox<String>cboMovieIDs=new JComboBox<String>();
			 JLabel lblListofmovies=new JLabel("Listofmovies");
			 lblListofmovies.setBounds(50,50,100,20);
			 add(lblListofmovies);
			 lblListofmovies.setForeground(Color.white);
			 Font f11 = new Font("Arial",Font.BOLD,15);
			 lblListofmovies.setFont(f11);
			
			cboMovieIDs.setBounds(160, 50, 100, 20);
			add(cboMovieIDs);
		for(Admin1 NewMovies:objList)
		{
				cboMovieIDs.addItem(NewMovies.strMovieID);
			}


			cboMovieIDs.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent arg0)
				{
					String strMovieID=(String)cboMovieIDs.getSelectedItem();
					//setTitle(strMovieID);
					Admin1 m1=objDH.getAdmin1RowByMovieID(strMovieID);
					txtMovieID.setText(m1.getstrMovieID());
					txtMovieName.setText(m1.getstrMovieName());
					txtStars.setText(m1.getStrStars());
					txtStartDate.setText(m1.getStrStartDate());
					txtEndDate.setText(m1.getStrEndDate());
//					txt912.setText(m1.getStrSlot912());
//					txt1215.setText(m1.getStrSlot1215());
//					txt1518.setText(m1.getStrSlot1518());
//					txt1821.setText(m1.getStrSlot1821());
					
					if(m1.getStrSlot912().equals("false"))
					{
						rdbSlot912.setEnabled(false);
					}
					else
					{
						rdbSlot912.setEnabled(true);
					
					}
					
					
					if(m1.getStrSlot1215().equals("false"))
					{
						rdbSlot1215.setEnabled(false);
					}
					else
					{
						rdbSlot1215.setEnabled(true);
					
					}
					
					
					
					if(m1.getStrSlot1518().equals("false"))
					{
						rdbSlot1518.setEnabled(false);
					}
					else
					{
						rdbSlot1518.setEnabled(true);
					
					}
					
					
					
					if(m1.getStrSlot1821().equals("false"))
					{
						rdbSlot1821.setEnabled(false);
					}
					else
					{
						rdbSlot1821.setEnabled(true);
					
					}
					
					
					ButtonGroup grp=new ButtonGroup();
					grp.add(rdbSlot1215);
					grp.add(rdbSlot912);
					grp.add(rdbSlot1518);
					grp.add(rdbSlot1821);
					
					
					
					
					txtPlatinum.setText(m1.getStrPlatinumPrice());
					txtGold.setText(m1.getStrGoldPrice());
					txtSilver.setText(m1.getStrSilverPrice());
					
					lblImg.setIcon(new ImageIcon(m1.strImageName));
					
					String  strStartDate=txtStartDate.getText();
					String strEndDate=txtEndDate.getText();
					
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
					chbShowDates.removeAllItems();
					for(int i=0;i<=diff;i++)
					{
						SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
					    String strDateOfShow= formatter.format(javaStartDate);  
					    System.out.println(strDateOfShow); 
					    
						chbShowDates.addItem(strDateOfShow);
						javaStartDate=objDH.addDays(strDateOfShow, 1);
					}
					
					
					
				}
			});

			//c.setBackground(Color.orange);


		 
		 setTitle("Movies");
		   setVisible(true);
		   setLocation(0,10);
		   setSize(500,500);
		   setSize(Toolkit.getDefaultToolkit().getScreenSize());
		   //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

			 

		
	
		}

