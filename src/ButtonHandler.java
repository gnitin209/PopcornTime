
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class ButtonHandler implements ActionListener 
{
	static String strFileName;
	NewMovie frm6;
public ButtonHandler(NewMovie newmovie)
{
	frm6=newmovie;
}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser fc=new JFileChooser();
		if(e.getActionCommand().equals("Choose File"))
		{
			fc.showOpenDialog(frm6);
			{
				File fileSelected =fc.getSelectedFile();
				String strFilePath=fileSelected.getAbsolutePath();
				JOptionPane.showMessageDialog(null, "file path="+strFilePath);
				 strFileName=fileSelected.getName();
				
				File imgUploaded=new File(strFileName);
				System.out.println(strFilePath);
				System.out.println(strFileName);
				try {
					FileInputStream fis=new FileInputStream(fileSelected);
					byte rawData[]=new byte[(int) fileSelected.length()];
					fis.read(rawData);
					
					FileOutputStream fos=new FileOutputStream(imgUploaded);
					fos.write(rawData);
					fis.close();
					fos.close();
					
					System.out.println("image Copied");
					
					ImageIcon icnImg=new ImageIcon(strFileName);
					
					frm6.strImageName.setIcon(icnImg);
					JOptionPane.showMessageDialog(null, "image Copied or Uploaded");
					
					
				} catch (FileNotFoundException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				catch(IOException e1){
					e1.printStackTrace();
				}
			}
			}

	}

}
