import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawObjecPlayHouse extends JFrame
	implements ActionListener {
	
	private JButton button;          // �ŧi�@�ӫ��s�C
	private JPanel panel;            // �ŧi�@�ӭ��O�C
	
	public static void main(String[] args) {
		DrawObjecPlayHouse frame = new DrawObjecPlayHouse(); // �ج[�C
		frame.setSize(500, 450);      // �ج[�ؤo�j�p�C
		frame.createGUI();            
		frame.setVisible(true);       // �i���C
	}
	
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();                               // �e�O�C
		panel.setPreferredSize(new Dimension(400, 350));    // �e�O�ؤo�j�p�C
		panel.setBackground(Color.white);                   // �e�O�I���C��C
		window.add(panel);
		button = new JButton("Press me");                   // ���s�� title�C
		window.add(button);
		button.addActionListener(this);                     // ��ť��ʡA�S����ť���󤣲z�C
	}
	
	public void actionPerformed(ActionEvent event) {
		Graphics paper = panel.getGraphics();
		paper.setColor(Color.black);	                    // �e�����C��A�����¦�C
		for(int i=0;i<=60;i++)
			paper.drawLine(90-i,70+i,300+i,70+i );          // �e�Ыγ��A��ΡC
		paper.fillRect(70,130, 250, 170);                   // �e�ЫΨ��A���C��A�x�ΡC		
		
		for(int i=0;i<=150;i+=150)                          // �e����������ơC
		{
		 for(int j=0;j<=70;j+=70)                           // �e����������ơC
		 {
		  paper.setColor(Color.white);	                    // �e�����C��A�����զ�C
		  paper.fillRect(100+i,160+j,40,30);                // �e����A���C��A�x�ΡC		
		  paper.setColor(Color.black);	                    // �e�����C��A�����¦�
		  paper.drawLine(100+i,175+j,140+i,175+j );         // �e����ج[�A��@�u���C
		  paper.drawLine(120+i,160+j,120+i,190+j );         // �e����ج[�A��@�u���C
		  }
		 }
		paper.setColor(Color.white);	                    // �e�����C��A�����զ�C
		paper.fillOval(179,220,35,35);                      // �e�����W�b���A���C��A��ΡC
		paper.fillRect(180,242,34,52);                      // �e�����U�b���A���C��A�x�ΡC
				
	}
}
