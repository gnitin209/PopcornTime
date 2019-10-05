import java.awt.Container;
import java.awt.Toolkit;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Signup extends JFrame
{
	DBHandler objDH=new DBHandler();
	Container c=null;
	JTextField txtUserID=new JTextField();
	JTextField txtUnm=new JTextField();
	 JPasswordField txtPwd=new JPasswordField();
	//JTextField txtUName=new JTextField();
	JTextField txtUEID=new JTextField();
	//JTextField txtUPwd=new JTextField();
	JTextField txtUMob=new JTextField();
	public Signup()
	{
	c=getContentPane();
	ImageIcon icn=new ImageIcon("16.jpg");
	 JLabel lblBG=new JLabel(icn);
	lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	c.add(lblBG);

	JLabel lblUserID=new JLabel("UserID");
	lblUserID.setBounds(50, 30, 100, 20);
	lblBG.add(lblUserID);
	
	txtUserID.setBounds(120, 30, 100, 20);
	lblBG.add(txtUserID);	
	
	JLabel lblUnm=new JLabel("username");
	lblUnm.setBounds(50,60,100,20);
	lblBG.add(lblUnm);
	
	txtUnm.setBounds(120, 60, 100, 20);
	lblBG.add(txtUnm);
	
	JLabel lblPwd=new JLabel("Password");
	lblPwd.setBounds(50,120,100,20);
	lblBG.add(lblPwd);
	
	   
	txtPwd.setBounds(120, 120, 100, 20);
	lblBG.add(txtPwd);
	
	
	
	
	JLabel lblUEID=new JLabel("UEmailid");
	lblUEID.setBounds(50, 90, 100, 20);
	lblBG.add(lblUEID);
	
	txtUEID.setBounds(120, 90, 100, 20);
	lblBG.add(txtUEID);
	

	JLabel lblUMob=new JLabel("UMobile");
	lblUMob.setBounds(50, 150, 100, 20);
	lblBG.add(lblUMob);

	txtUMob.setBounds(120, 150, 100, 20);
	lblBG.add(txtUMob);

	ImageIcon icnsignupBtn=new ImageIcon("button_sign-up-now.png");
	JButton btnSignUpNow=new JButton (icnsignupBtn);
	btnSignUpNow.setBounds(80,200,200,70);
	lblBG.add(btnSignUpNow);
	
	 btnSignUpNow.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	Bookmovie bm =new Bookmovie();
	}
	});
	
	 
//	btnSignUpNow.addActionListener(new ActionListener()
//	{
//	public void actionPerformed (ActionEvent arg0){
//	String strUnm,strPwd;
//	strUnm=txtUnm.getText();
//	strPwd=String.valueOf(txtPwd.getPassword());
//	
//	System.out.println(strUnm+""+strPwd);
//	
//	boolean res=objDH.isValidUser(strUnm, strPwd);
//	
//	
//	if(res==true)
//	{
//	JOptionPane.showMessageDialog(null, "welcome user");
//	}
//	else
//	{
//	JOptionPane.showMessageDialog(null,"invalid user or Pwd");
//	}
//	}
//	});
//
//	
	
	
	setTitle("Signup");
	setVisible(true);
	setBounds(0,0,500,500);
	setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}
