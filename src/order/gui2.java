package order;
import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
//import javax.swing.JPanel;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Image;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui2 {

	private JFrame frame;
	//JLabel lblPhilosopher_3 = new JLabel(" ");
	JLabel r1 = new JLabel(" ");
	JLabel r2 = new JLabel(" ");
	JLabel r3 = new JLabel(" ");
	JLabel r4= new JLabel(" ");
	JLabel r5 = new JLabel(" ");
	int flag[];
	
	int thinking=0,eating=1,hungry=2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui2 window = new gui2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui2(){
		flag=new int [5];
		initialize();
	}

	public void take_chopsticks(int i)
	{		System.out.println("vasavik");
		int k;
		for(k=0;k<=4;k++)
		{
			System.out.print(flag[k]+" ");
		
		}
		flag[i]=2;
		System.out.println();
		if(i==0)
		{	
			r1.setText("Hungry");
			r1.setForeground(Color.RED);
		/*	Timer timer = new Timer(1000, taskPerformer); // delay one sec
			timer.setRepeats(false);
			timer.start();*/
		}
		else if(i==1)
		{
			r2.setText("Hungry");
			r2.setForeground(Color.RED);
		}
		else if(i==2)
		{	
			r3.setText("Hungry");
			r3.setForeground(Color.RED);
		}
		else if(i==3)
		{	
			r4.setText("Hungry");
			r4.setForeground(Color.RED);
		}
		else if(i==4)
		{
			r5.setText("Hungry");
			r5.setForeground(Color.RED);
		}
		int r;
		r=i+1;
		System.out.println("Philosopher "+r+" is hungry");
		test(i);
		if(flag[i]==2)
		{
			if(i==0)
			{
				r1.setText("waiting");
				r1.setForeground(Color.ORANGE);
		/*	Timer timer = new Timer(1000, taskPerformer); 
			timer.setRepeats(false);
			timer.start();*/
			}
			else if(i==1)
			{
				r2.setText("waiting");
				r2.setForeground(Color.ORANGE);
			}
			else if(i==2)
			{
				r3.setText("waiting");
				r3.setForeground(Color.ORANGE);
			}
			else if(i==3)
			{
				r4.setText("waiting");
				r4.setForeground(Color.ORANGE);
			}
			else if(i==4)
			{
				r5.setText("waiting");
				r5.setForeground(Color.ORANGE);
			}
			
			
			r=i+1;
		System.out.println("Philosopher "+r+" is waiting");
		}
	}
	public void drop_chopsticks(int i)
	{   int k;
		for(k=0;k<=4;k++)
		{
			System.out.print(flag[k]+"");
		}
		System.out.println();
		if(flag[i]==1)
		{
			flag[i]=0;
			if(i==0)
			{
				r1.setText("THINKING");
				r1.setForeground(Color.BLUE);
			}
			else if(i==1)
			{
				r2.setText("THINKING");
				r2.setForeground(Color.BLUE);
			}
			else if(i==2)
			{
				r3.setText("THINKING");
				r3.setForeground(Color.BLUE);
			}
			else if(i==3)
			{
				r4.setText("THINKING");
				r4.setForeground(Color.BLUE);
			}
			else if(i==4)
			{
				r5.setText("THINKING");
				r5.setForeground(Color.BLUE);
			}int r;
			r=i+1;
			System.out.println("Philosopher"+r+" is thinking");
			test((i+1)%5);
			test((i+4)%5);
		}
	}
	public void test(int i)
	{int k;
		for(k=0;k<=4;k++)
		{
			System.out.print(flag[k]+"");
		}
		System.out.println();
		if(flag[i]==2 && flag[(i+1)%5]!=1 && flag[(i+4)%5]!=1)
		{
			flag[i]=1;
			if(i==0)
			{
		r1.setText("Eating");
				r1.setForeground(Color.GREEN);
			}
			else if(i==1)
			{
			r2.setText("Eating");
				r2.setForeground(Color.GREEN);
			}
			else if(i==2)
			{
				r3.setText("Eating");
				r3.setForeground(Color.GREEN);
			}
			else if(i==3)
			{
			r4.setText("Eating");
				r4.setForeground(Color.GREEN);
			}
			else if(i==4)
			{
				r5.setText("Eating");
				r5.setForeground(Color.GREEN);
			}
			int r;
			r=i+1;
			System.out.println("philosopher "+r+" is eating");
		}
	}
	 /* Initialize the contents of the frame.
	 *
	 */
	 public void initialize() {
		frame = new JFrame("Dining Philosophers");
		frame.setBounds(100, 100, 730, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_1.setBounds(319, 11, 79, 71);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_2.setBounds(126, 151, 71, 71);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_3.setBounds(208, 340, 71, 75);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_4.setBounds(489, 330, 79, 75);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_6.setBounds(533, 151, 71, 71);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon1.png"));
		lblNewLabel.setBounds(284, 151, 79, 44);
		
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon2.png"));
		lblNewLabel_5.setBounds(381, 151, 79, 44);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon6.png"));
		lblNewLabel_7.setBounds(263, 231, 79, 44);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon7.png"));
		lblNewLabel_8.setBounds(401, 231, 79, 44);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon6.png"));
		lblNewLabel_9.setBounds(336, 273, 79, 44);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\bowl1.png"));
		lblNewLabel_10.setBounds(336, 194, 71, 56);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\diningtable.jpg"));
		lblNewLabel_11.setBounds(263, 124, 217, 205);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblPhilosopher = new JLabel("Philosopher1");
		lblPhilosopher.setBounds(223, 11, 101, 30);
		frame.getContentPane().add(lblPhilosopher);
		
		JLabel lblPhilosopher_1 = new JLabel("philosopher3");
		lblPhilosopher_1.setBounds(110, 340, 101, 24);
		frame.getContentPane().add(lblPhilosopher_1);
		
		JLabel lblPhilosopher_2 = new JLabel("Philosopher2");
		lblPhilosopher_2.setBounds(38, 151, 78, 25);
		frame.getContentPane().add(lblPhilosopher_2);
		
		JLabel lblPhilosopher_3 = new JLabel("");
		lblPhilosopher_3.setText("philosopher4");
		lblPhilosopher_3.setBounds(559, 335, 79, 24);
		frame.getContentPane().add(lblPhilosopher_3);
		
		JLabel lblPhilosopher_4 = new JLabel("Philosopher5");
		lblPhilosopher_4.setBounds(603, 135, 79, 30);
		frame.getContentPane().add(lblPhilosopher_4);
		
		
		r2.setText("THINKING2");
		r2.setForeground(Color.BLUE);
		//Color customColor = new Color(10,10,255);
		//lblThinking2.setBackground(customColor);
		r2.setBounds(126, 112, 71, 24);
		frame.getContentPane().add(r2);
		
		//JLabel lblThinking_1 = new JLabel("THINKING2");
		r1.setText("THINKING1");
		r1.setForeground(Color.BLUE);
		r1.setBounds(391, 11, 69, 24);
		frame.getContentPane().add(r1);
		
		//JLabel lblThinking_2 = new JLabel("THINKING3");
		r5.setText("THINKING5");
		r5.setForeground(Color.BLUE);
		r5.setBounds(533, 112, 69, 24);
		frame.getContentPane().add(r5);
		
		//JLabel lblThinking_3 = new JLabel("THINKING4");
		r4.setText("THINKING4");
		r4.setForeground(Color.BLUE);
		r4.setBounds(533, 305, 71, 24);
		frame.getContentPane().add(r4);
		
		//JLabel lblThinking_4 = new JLabel("THINKING5");
		r3.setText("THINKING3");
		r3.setForeground(Color.BLUE);
		r3.setBounds(169, 316, 63, 24);
		frame.getContentPane().add(r3);
		
		JButton btnStartrunning = new JButton("START_RUNNING");
		btnStartrunning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			/*	r1.setText("THINKING");
				r1.setForeground(Color.BLUE);
				
				r2.setText("THINKING");
				r2.setForeground(Color.BLUE);
				
				r3.setText("THINKING");
				r3.setForeground(Color.BLUE);
				
				r4.setText("THINKING");
				r4.setForeground(Color.BLUE);
				
				r5.setText("THINKING");
				r5.setForeground(Color.BLUE);
				int i;
				for(i=1;i<=10;i++)
				{
					Random r=new Random();
					int k1,k2,k3,k4,k5;
					k1=r.nextInt(4);
					k2=r.nextInt(4);
					System.out.println(k1);
					if(k1==k2)
					{	
						while(true)
						{
						k2=r.nextInt(4);
						if(k1!=k2)
						{
							break;
						}
						}
					}
					
					k3=r.nextInt(4);
					if(k1==k3||k2==k3)
					{	//k2=r.nextInt(4);
						while(true)
						{
						k3=r.nextInt(4);
						
						if(k1!=k3&&k2!=k3)
						{
							break;
						}
						}
					}
					k4=r.nextInt(4);
					if(k1==k4||k2==k4||k3==k4)
					{	
						while(true)
						{
						k4=r.nextInt(4);
						
						if(k1!=k4&&k2!=k4&&k3!=k4)
						{
							break;
						}
						}
					}
					k5=r.nextInt(4);
					int j;
					for(j=0;j<=4;j++)
					{
						if(j!=k1&&j!=k2&&j!=k3&&j!=k4)
						{
							break;
						}
					}
					k5=j;
				
					
				
						take_chopsticks(k1);
						take_chopsticks(k2);
						take_chopsticks(k3);
						take_chopsticks(k4);
						take_chopsticks(k5);
						

						drop_chopsticks(k1);
						drop_chopsticks(k2);
						drop_chopsticks(k3);
						drop_chopsticks(k4);
						drop_chopsticks(k5);
					
						try
						{
							Thread.sleep(1000);
						}
						catch(InterruptedException k)
						{
							
						}
				}*/
				
				
			}
		});
		btnStartrunning.setBounds(559, 15, 145, 30);
		frame.getContentPane().add(btnStartrunning);
		//initia();
		
	}
	/*public void initia()
	{	System.out.println("vasavi");
		//lblPhilosopher_3.setText("vas");
	}*/

	public void setVisible(boolean b) {
		frame.setVisible(b);
		// TODO Auto-generated method stub
		
	}
}
