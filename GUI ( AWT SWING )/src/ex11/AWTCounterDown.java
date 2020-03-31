package ex11;

import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

  public class AWTCounterDown extends JFrame 
    
    {
    	
	private JLabel lblCount; // Declare a Label component
	private JTextField tfCount; // Declare a TextField component
	private JButton btnCount; // Declare a Button component
	private int count = 50; // Counter's value

	
	 public AWTCounterDown() 
	 {
		setLayout(new FlowLayout());
		

		lblCount = new JLabel("Counter"); // construct the Label component
		add(lblCount); // "super" Frame container adds Label component

		tfCount = new JTextField(count + "", 10); // construct the TextField
													// component with initial
													// text
		tfCount.setEditable(false); // set to read-only
		add(tfCount); // "super" Frame container adds TextField component

		btnCount = new JButton("Down Count"); // construct the Button component
		add(btnCount); // "super" Frame container adds Button component

		btnCount.addActionListener(new ActionListener()
		{
				
				@Override
				public void actionPerformed(ActionEvent evt)
				{
			  --count; // Increase the counter value
			
			tfCount.setText(count + ""); // Convert int to String
		        }
				
				
	     }
		
		);
		

		setTitle("AWT Counter"); // "super" Frame sets its title
		setSize(600, 500); // "super" Frame sets its initial window size
        setVisible(true); // "super" Frame shows

	}

	
	public static void main(String[] args) 
	{
	

		AWTCounterDown frame = new AWTCounterDown();
	  	frame.setBounds(300, 300, 500, 300);
	  	frame.setTitle(" This is a Counter window");
	  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
	
}