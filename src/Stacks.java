import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Stacks extends variables {
	
	JFrame ButtonFrame = new JFrame("Stack") ;
	GridLayout gLayout = new GridLayout(5,hvalue);
	JPanel stackpanel2=new JPanel();
	JButton[] mycardstack;
	
public Stacks(){
	ButtonFrame.setLayout(new FlowLayout());
	
	stackpanel2.setLayout(gLayout);
	 ButtonFrame.add(stackpanel2);
	 ButtonFrame.setSize(700, 700);
	 stackpanel2.setSize(100,100);
	 
	 
	 
	 
	 }
	
}


