import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling extends JFrame implements ActionListener {
	public static JFrame win;
	
	public static void main(String[] args) {
		new EventHandling();
	}
	
	Color bgColor = new Color(75, 75, 0);
	Color txColor = new Color(255, 0, 0);
	Font lblFont = new Font("Times New Roman", Font.PLAIN, 24);
	Font txtFont = new Font("Courier New", Font.BOLD, 24);
	Font btnFont = new Font("Dialog", Font.PLAIN, 24);
	//Icon upArrow = new ImageIcon("images/uparrow.jpg");
	//Icon downArrow = new ImageIcon("images/downarrow.jpg");
	JTextField textField;
	JButton rightButton;
	JButton leftButton;
   JLabel x;
	int count = 0;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rightButton) {
			count++;
			textField.setText(Integer.toString(count));		
		}else if (e.getSource() == leftButton){
			count--;
			textField.setText(Integer.toString(count));
		}	

	}

	public EventHandling() {
		// window management
		super("Counter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.decode("#222222"));
		// Create Textfield
		textField = new JTextField(10);
      x = new JLabel("x =");
      x.setForeground(Color.white);
		// set textField text
		textField.setText("0");
		// set alignment
		textField.setHorizontalAlignment(JTextField.RIGHT);
		// set font
		textField.setFont(txtFont);
		// set background
		textField.setBackground(bgColor);
		// set foreground
		textField.setForeground(txColor);
		// set tooltip
		textField.setToolTipText("Current counter value");
		// Add Left Button
		leftButton = new JButton("down");
		//set text for left button
		//leftButton.setText();
		//set font for left button
		leftButton.setFont(btnFont);
		//set foreground color for left button
		leftButton.setForeground(txColor);
		//set tool tip for left button
		leftButton.setToolTipText("Click to decrement counter");
		//Add actionlistner for left button
		leftButton.addActionListener(this);
		this.add(leftButton);
		// Add Action Listner
		textField.addActionListener(this);
      this.add(x);
		// Add textfield
		this.add(textField);
		// Add right button
		rightButton = new JButton("up");
		//set tooltip for right button
		rightButton.setToolTipText("Click to increment value");
		//set font for button.
		rightButton.setFont(btnFont);
		//set text for right button
		//rightButton.setText();
		// rightButton.setBackground( bgColor );
		rightButton.setForeground(txColor);
		//add action listener for right button
		rightButton.addActionListener(this);
		//add right button
		this.add(rightButton);
		//add layout
		this.setLayout(new FlowLayout());
		//set size of window
		this.setSize(400, 150);
		//set window visible
		this.setVisible(true);
		//request focus on textfield
		textField.requestFocus(true);
		//select the textfield
		textField.selectAll();
	}

}
