import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonTask implements ActionListener {
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	private JTextField text;

	public ButtonTask() {
		frame = new JFrame("Two Buttons");
		text = new JTextField("");
		b1 = new JButton("Change");
		b2 = new JButton("Reset");
		b1.addActionListener(this);// assign the action to this button
		b1.setBounds(50, 300, 100, 100);// set x,y,width,height of button
		b2.addActionListener(this);// assign the action to this button
		b2.setBounds(250, 300, 100, 100);// set x,y,width,height of button
		text.addActionListener(this);// assign the action to this button
		text.setBounds(50, 50, 300, 50);// set x,y,width,height of button

		frame.setSize(400, 500);// 400 width and 500 height
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setLayout(null);// using no layout managers
		frame.add(b1);// add b1 to the frame
		frame.add(b2);// add b2 to the frame
		frame.add(text);//add text field to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// end program when
																// window closes
		frame.setVisible(true);// make the frame visible
		
		
		
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == b1) {
			frame.getContentPane().setBackground(Color.GREEN);
			b1.setText(text.getText());
		}
		if (evt.getSource() == b2) {
			text.setText("");
			
			
		}
	}

	public static void main(String[] args) {
		ButtonTask bt = new ButtonTask();
	}
}