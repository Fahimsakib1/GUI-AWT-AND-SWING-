package ex5;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;

 public class AWTCounterUp extends JFrame implements ActionListener 
 
{ 
   
   private JLabel lblCount;    // Declare a Label component 
   private JTextField tfCount; // Declare a TextField component 
   private JButton btnCount;   // Declare a Button component
   private int count = 0;     // Counter's value
 
   public AWTCounterUp () 
   
   {
      setLayout(new FlowLayout());
         
      lblCount = new JLabel("Counter");  
      add(lblCount);                    
 
      tfCount = new JTextField(count + "", 10); 
      tfCount.setEditable(false);       
      add(tfCount);                     
 
      btnCount = new JButton("Count Up");
      add(btnCount);                    
 
      btnCount.addActionListener(this);
        
      setTitle("Swing Counter"); 
      //setSize(250, 100); 
 
      setVisible(true);
      
 
   }
 
   public void actionPerformed(ActionEvent evt) 
   {
      count=count+1; // Increase the counter value
      
      tfCount.setText(count + ""); // Convert int to String
   }
   
   public static void main(String[] args) 
	
	{
		
	    AWTCounterUp frame = new AWTCounterUp();
	  	frame.setBounds(300, 300, 500, 300);
	  	frame.setTitle(" This is a Counter window");
	  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	 }

   
 }