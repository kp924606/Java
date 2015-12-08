import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawObjecPlay extends JFrame
	implements ActionListener {
	
	private JButton button;
	private JPanel panel;
	
	public static void main(String[] args) {
		DrawObjecPlay frame = new DrawObjecPlay();
		frame.setSize(500, 450);
		frame.createGUI();
		frame.setVisible(true);
	}
	
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 350));
		panel.setBackground(Color.black);
		window.add(panel);
		button = new JButton("Press me");
		window.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		Graphics paper = panel.getGraphics();
		paper.setColor(Color.red);		
		 for(int i=1;i<200;i+=10)
		 paper.drawLine(70,70+i,290,70+i );			 
		paper.drawRect(70, 60, 220, 210);
	}
}
