package order;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*; 
// Packages used in this program imported
class Arrow extends JPanel {
private static final long serialVersionUID = 1L;  
   protected void paintComponent(Graphics g)
    { 
    	super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
    JLabel l=new JLabel();
    l.setBounds(30,40,35,35);
    l.setText("vasavi");
    this.add(l);
   	this.removeAll();
 
		g2.draw(new Line2D.Double(100,120,200,120));	
		System.out.println("sai");
}
}
public class new1 extends JFrame implements ActionListener 
{
	private static final long serialVersionUID = 1L;
	JPanel cards;
    JButton button1, button2, button3;
    private JTextField textField;
    private JTextField textField1;
   private  CardLayout cardLayout;
   private JPanel card2;
  int  m=2;
  Container c;
    public new1() //This is the CONSTRUCTOR method
    {
        //The entry point into your program
       c= getContentPane();c.setLayout(new FlowLayout()); //Use this for now.
        setSize(810, 510); //Set the size of the JFrame
        setTitle("Generic Card Game"); //Put Title on top of JFrame
        setBackground(Color.yellow);
        setResizable(false);
        button1 = new JButton("THIS IS BUTTON 1");
        button2 = new JButton("THIS IS BUTTON 2");
        button3 = new JButton("THIS IS BUTTON 3");
        button1.addActionListener(this);
        button2.addActionListener(this);
        //Create the cards
        JPanel card1 = new JPanel();
        card1.add(button1);
        card2 = new JPanel();
        //card2.add(button2);
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1,"Card 1");
        cards.add(card2,"Card 2");
        cardLayout = (CardLayout) cards.getLayout();
      //  cardLayout.show(cards, "Card 1");
        getContentPane().add(cards); 
        textField = new JTextField();
        textField.setColumns(10);
        setVisible(true); //Make JFrame visible
        card1.add(textField);
        textField.setText(" 2");
        textField1 = new JTextField();
        textField1.setColumns(10);
       // card2.add(textField1);
        textField1.setText(String.valueOf(m+2));
        System.out.println("vasavi");
    }
    public void actionPerformed(ActionEvent e)
    {    
        if (e.getSource() == button1){ 
          System.out.println("vas");
        	card2.add(new Arrow());
           cardLayout.show(cards, "Card 2");
           //textField.setText(String.valueOf(m));
           //textField.setText("hahaha");
          
        }
        if (e.getSource() == button2){    
         cardLayout.show(cards, "Card 1");
       //textField.setText("hahaha");
        
      }
      
        
    }
    public static void main(String args[])
    {    
        new new1(); // This calls the constructor and runs it    
    }
    ///////////////////////////////////////////////
}
 
    
