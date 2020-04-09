import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.xml.transform.OutputKeys;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main extends Stacks{

	JFrame GameFrame = new JFrame("Card Stack");
	JPanel playerPanel = new JPanel(new GridBagLayout());
	JPanel stackpanel = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel labelnoc = new JLabel();
	JLabel label6 = new JLabel();
	JLabel label7 = new JLabel();
	JLabel label8 = new JLabel();
	JLabel label10 = new JLabel();
	
	

	JTextField textfield = new JTextField(10);
	JButton button = new JButton("Enter");
	JButton button1 = new JButton("Roll Dice");
	JButton shuffle = new JButton("Shuffle");
	public static ArrayList<Stack> cardlist = new ArrayList<>();

	public Main() {
		
		GameFrame.getContentPane().add(playerPanel, BorderLayout.NORTH);
		GameFrame.setSize(850, 700);
		GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameFrame.getContentPane().setLayout(null);
		GameFrame.setVisible(true);
		playerPanel.setSize(850, 700);
		playerPanel.setBackground(Color.LIGHT_GRAY);

		

		label.setText("Insert value");
		Font font = label.getFont();
		label.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label, c);

	
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		textfield.setFont(font.deriveFont(Font.PLAIN, 16f));
		playerPanel.add(textfield, c);

		button.setBackground(Color.MAGENTA);
		button.setFont(font.deriveFont(20f));
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		playerPanel.add(button, c);
		

		button1.setBackground(Color.MAGENTA);
		button1.setFont(font.deriveFont(20f));
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		playerPanel.add(button1, c);
		

		shuffle.setBackground(Color.MAGENTA);
		shuffle.setFont(font.deriveFont(20f));
		c.gridx = 5;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		playerPanel.add(shuffle, c);
		

		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);

		label1.setText("Number of dice");
		label1.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label1, c);

		label2.setText("Number of corner");
		label2.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label2, c);

		labelnoc.setText("Number of card Choosen");
		labelnoc.setFont(font.deriveFont(Font.PLAIN, 16f));
		labelnoc.setBackground(Color.GREEN);
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(labelnoc, c);

		label3.setText("");
		label3.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label3, c);

		label4.setText("");
		label4.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label4, c);

		label5.setText("");
		label5.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 3;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label5, c);

		label6.setText("");
		label6.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 4;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label6, c);

		label7.setText("Your Total Point is : ");
		label7.setFont(font.deriveFont(Font.PLAIN, 18f));
		label7.setForeground(Color.BLUE);
		c.gridx = 2;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label7, c);

		label8.setText("");
		label8.setFont(font.deriveFont(Font.PLAIN, 16f));
		c.gridx = 3;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 0, 10);
		playerPanel.add(label8, c);


		//System.out.println("Please Input Value");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int[] n = new int[3];
				n[2] = 1;
				String sd = textfield.getText();
				if (!sd.matches("[0-9,d,-]+")){
					JOptionPane.showMessageDialog(GameFrame,"Please Enter Correct format'<num>d<parts>-<num>'");
					textfield.setText("");
				}
				
				String[] part1 = sd.split("[d-]");
				for(int i = 0; i<part1.length; i++){
					n[i] = Integer.parseInt(part1[i]);
				}
				textfield.setEnabled(false);
				// keeping the split value into a integer variable by converting it
				lowest = n[0];
				highest = n[1];
				nod = n[2];
				System.out.println("Number of dice :"+n[0]+"\n"+"Number of corner :"+n[1]+"\n"+"Number of card choosen :"+n[2]+"\n");
				hvalue = lowest * highest;
				
				label3.setText(Integer.toString(lowest));
				label4.setText(Integer.toString(highest));
				label5.setText(Integer.toString(nod));
				int[] rv = new int[hvalue + 1];
				int[] percent = new int[hvalue + 1];
				for (int i = 0; i < 10000; i++) {
					randomValue = lowest + random.nextInt(hvalue - lowest) + 1;
					rv[randomValue]++;

				}
				
				// percentage of random value
				for (int i = 0; i < percent.length; i++) {
					percent[i] = (rv[i] * 100) / 10000;

				}
				// Add to stack
				for (int i = lowest; i < percent.length; i++) {
					Stack a = new Stack();
					for (int j = 1; j <= percent[i]; j++) {
						a.push(i);
					}
					cardlist.add(a);
				}
				
				
				// button of card stacks
				mycardstack = new JButton[(lowest * highest) + 1];
				for (int m = 0; m <= (lowest * highest); m++) {
					mycardstack[m] = new JButton();
					mycardstack[m].setText((m) + "");

					// object for display button array
					// fm.ButtonFrame.setVisible(true);
					// fm.stackpanel.setVisible(true);
					
				}
				for(int i = lowest; i<=hvalue; i++){
					stackpanel2.add(mycardstack[i]);
				}
				
				for (int m = 0; m <= (lowest * highest); m++) {
					final int y = m - lowest;

					
					mycardstack[m].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							Stack a = cardlist.get(y);
							JOptionPane.showMessageDialog(null,
									"You have selected Stack " + (y +lowest) + ". Remain Cards in Stack: " + a.size());
						System.out.println("You have selected Stack " + (y +lowest) + ". Remain Cards in Stack: " + a.size());
						}
					});
						
				
				}
			}
		
			
		});
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ButtonFrame.setVisible(true);

				printPoint();
				
			}
		});
		
	shuffle.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Collections.shuffle(cardlist);
			JOptionPane.showMessageDialog(null, "Successfully Re-Shuffled");
			System.out.println("Successfully Re-Shuffled");
		}
	});
	}

	

	public static void main(String[] args) {
		Main m = new Main();
		

	}

	public void printPoint() {
		
		int p = 0;

		for (int i = 0; i < lowest; i++) {
			int t = random.nextInt(highest)+ lowest;
			System.out.println(i+1+"st Roled dice value: "+t);
			p+= getStackValue(t);
			// JOptionPane.showMessageDialog(null, "total point is: "+p);
			
		}
		
		label8.setText(Integer.toString(p));
		System.out.println("Total Point is: "+p);
		//JOptionPane.showMessageDialog(null, "total point is: " + p);
	}

	public int getStackValue(int l) {
		int x = 0;
		try {

			Stack a = new Stack();
			a = cardlist.get(l-lowest);

			for (int c = 0; c < nod; c++) {
				x+= (int) (a.pop());
			}
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Stack is empty.Please reshuffle");
			
		}
		return x;
	}

}
