import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawObjecPlayHouse extends JFrame
	implements ActionListener {
	
	private JButton button;          // 宣告一個按鈕。
	private JPanel panel;            // 宣告一個面板。
	
	public static void main(String[] args) {
		DrawObjecPlayHouse frame = new DrawObjecPlayHouse(); // 框架。
		frame.setSize(500, 450);      // 框架尺寸大小。
		frame.createGUI();            
		frame.setVisible(true);       // 可見。
	}
	
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();                               // 畫板。
		panel.setPreferredSize(new Dimension(400, 350));    // 畫板尺寸大小。
		panel.setBackground(Color.white);                   // 畫板背景顏色。
		window.add(panel);
		button = new JButton("Press me");                   // 按鈕的 title。
		window.add(button);
		button.addActionListener(this);                     // 監聽行動，沒有監聽等於不理。
	}
	
	public void actionPerformed(ActionEvent event) {
		Graphics paper = panel.getGraphics();
		paper.setColor(Color.black);	                    // 畫筆的顏色，此為黑色。
		for(int i=0;i<=60;i++)
			paper.drawLine(90-i,70+i,300+i,70+i );          // 畫房屋頂，梯形。
		paper.fillRect(70,130, 250, 170);                   // 畫房屋身，填滿顏色，矩形。		
		
		for(int i=0;i<=150;i+=150)                          // 畫水平的窗戶數。
		{
		 for(int j=0;j<=70;j+=70)                           // 畫垂直的窗戶數。
		 {
		  paper.setColor(Color.white);	                    // 畫筆的顏色，此為白色。
		  paper.fillRect(100+i,160+j,40,30);                // 畫窗戶，填滿顏色，矩形。		
		  paper.setColor(Color.black);	                    // 畫筆的顏色，此為黑色
		  paper.drawLine(100+i,175+j,140+i,175+j );         // 畫窗戶框架，單一線條。
		  paper.drawLine(120+i,160+j,120+i,190+j );         // 畫窗戶框架，單一線條。
		  }
		 }
		paper.setColor(Color.white);	                    // 畫筆的顏色，此為白色。
		paper.fillOval(179,220,35,35);                      // 畫門身上半部，填滿顏色，圓形。
		paper.fillRect(180,242,34,52);                      // 畫門身下半部，填滿顏色，矩形。
				
	}
}
