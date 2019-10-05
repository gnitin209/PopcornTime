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

		public class AddMovie  extends JFrame
		{
			DbHandlerAdmin objDH=new DbHandlerAdmin();
			Container c=null;

			public AddMovie()
			{
				c=getContentPane();
				ImageIcon icn=new ImageIcon("admin.jpg");
				JLabel lblBG=new JLabel(icn);
				lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
				//setBounds(0,0,1500,1500);

				c.add(lblBG);
				
				JLabel lblANM=new JLabel("Admin Name");
				lblANM.setBounds(700,300,200,50);
				lblBG.add(lblANM);
				lblANM.setForeground(Color.black);
				Font f=new Font("Arial",Font.BOLD,25);
					lblANM.setFont(f);
				

				final JTextField txtANM=new JTextField();
				txtANM.setBounds(900, 300, 200, 50);
				lblBG.add(txtANM);
				
				JLabel lblAPWD=new JLabel("Password");
				lblAPWD.setBounds(700,400,150,30);
				lblBG.add(lblAPWD);
				lblAPWD.setForeground(Color.black);
				//Font f=new Font("Arial",Font.BOLD,24);
					lblAPWD.setFont(f);
				

			    final JPasswordField txtAPWD=new JPasswordField();
				txtAPWD.setBounds(900, 400, 200, 50);
				lblBG.add(txtAPWD);
				
				
				ImageIcon icnLBtn=new ImageIcon("login.png");
				JButton btnLogin=new JButton (icnLBtn);
				btnLogin.setBounds(900,500,90,40);
				lblBG.add(btnLogin);
				
                btnLogin.addActionListener(new ActionListener() {
			
					public void actionPerformed (ActionEvent arg0){
						String strANM,strAPWD;
						strANM=txtANM.getText();
						strAPWD=String.valueOf(txtAPWD.getPassword());
						
						System.out.println(strANM+""+strAPWD);
						
						boolean res=objDH.isValidUser(strANM, strAPWD);
					
				
				if(res==true)
				{
				JOptionPane.showMessageDialog(null, "welcome user");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid user or Pwd");
				}
				Admin ad=new Admin();
					}
					
				});

				setTitle("Add Movie");
				setVisible(true);
				setBounds(0,0,1500,1500);
				setSize(Toolkit.getDefaultToolkit().getScreenSize());
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					}
}

