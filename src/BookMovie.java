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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

		public class Bookmovie  extends JFrame
		{
			DBHandler objDH=new DBHandler();
			Container c=null;

			public Bookmovie()
			{
				c=getContentPane();
				ImageIcon icn=new ImageIcon("welcome.jpg");
				JLabel lblBG=new JLabel(icn);
				lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
				//setBounds(0,0,1500,1500);

				c.add(lblBG);
				
				JLabel lblUnm=new JLabel("Username");
				lblUnm.setBounds(200,50,150,30);
				lblBG.add(lblUnm);
				lblUnm.setForeground(Color.black);
				Font f=new Font("Arial",Font.ITALIC,20);
					lblUnm.setFont(f);
				

				final JTextField txtUnm=new JTextField();
				txtUnm.setBounds(300, 50, 150, 30);
				lblBG.add(txtUnm);
				
				
				JLabel lblPwd=new JLabel("Password");
				lblPwd.setBounds(200,100,150,30);
				lblBG.add(lblPwd);
				lblPwd.setForeground(Color.black);
				//Font f=new Font("Arial",Font.BOLD,18);
					lblPwd.setFont(f);
				

			    final JPasswordField txtPwd=new JPasswordField();
				txtPwd.setBounds(300, 100, 150, 30);
				lblBG.add(txtPwd);
				
				
				ImageIcon icnLBtn=new ImageIcon("login.png");
				JButton btnLogin=new JButton (icnLBtn);
				btnLogin.setBounds(320,150,91,40);
				lblBG.add(btnLogin);
				
                 btnLogin.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Movies mv=new Movies();
					}
				});
				
				
				
				
//				ImageIcon icnsBtn=new ImageIcon("signup.png");
//				JButton btnSignUp=new JButton (icnsBtn);
//				btnSignUp.setBounds(320,200,91,40);
//				lblBG.add(btnSignUp);
//				btnSignUp.addActionListener(new ActionListener() {
//					
//					public void actionPerformed(ActionEvent arg0) {
//						// TODO Auto-generated method stub
//						Signup su=new Signup();
//					}
//				});
//				
				btnLogin.addActionListener(new ActionListener()
				{
					public void actionPerformed (ActionEvent arg0){
						String strUnm,strPwd;
						strUnm=txtUnm.getText();
						strPwd=String.valueOf(txtPwd.getPassword());
						
						System.out.println(strUnm+""+strPwd);
						
						boolean res=objDH.isValidUser(strUnm, strPwd);
					
				
				if(res==true)
				{
				JOptionPane.showMessageDialog(null, "welcome user");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid user or Pwd");
				}
					}
				});

				setTitle("Book My Show");
				setVisible(true);
				setBounds(0,0,1500,1500);
				setSize(Toolkit.getDefaultToolkit().getScreenSize());
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					}
}
