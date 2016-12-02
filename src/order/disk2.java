package order;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;


 class ArrowPanel2 extends JPanel {
	
	
    /**
 * 
 */
private static final long serialVersionUID = 1L;
	/**
 * 
 */
//private static final long serialVersionUID = 1L;
	double phi;
    int barb;
public  int n1;
public  int he1,h,m1;

public  int a1[]=new int[1000];
//public static int a[];
//  int s[];
  /*public ArrowPanel()
  { phi = Math.toRadians(40);
  barb = 5;
  
  }*/
  
  public ArrowPanel2(int a[],int count)
    {
        phi = Math.toRadians(40);
        barb = 5;
      int i;
      for(i=1;i<=count;i++)
      {
    	  a1[i]=a[i];
      }
        
    }
/*  public void add2(int a[],int n,int he,int m,int h1)
  {// System.out.println("in"+ a[1]);
	  n1=n;
   // a1[]=new int[n1+1];

	int i;
	for(i=1;i<=n1;i++)
	{
	a1[i]=a[i];
	System.out.println("in add2"+a1[i]);
}
	he1=he;
  h=h1;
  m1=m;
  }
	///int s[]=new int [5];
	/*  s[0]=1;
	  s[1]=2;
	  s[3]=4;
	  s[4]=7;
	  s[5]=9;*/
  //}*/
  
   protected void paintComponent(Graphics g)
    { 
    	super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        //System.out.println("vasavi/dsjfsdddddd");
   	//System.out.println("inpaint"+a1[1]);
    /*    int i,k=10;
		for(i=1;i<=2;i++)
		{
		g2.draw(new Line2D.Double(100,70,(k+30),70));
		JLabel l=new JLabel();
	
		l.setBounds(k,70,15,15);
		
		l.setText(String.valueOf(k));
		l.setVisible(true);
		this.add(l);
		k=150;
		}*/
		//g2.draw(new Line2D.Double(30,5,50,5));
		//JLabel l1=new JLabel();
		//l1.setBounds(30,5,15,15);
		//l1.setText("30");
		//l1.setVisible(true);
		//this.add(l1);
        /*a1[1]=20;
        a1[2]=40;
        a1[3]=60;*/
   
   	//int i,k,q;
   	/*for(i=1;i<n1;i++)
   	{
   		for(k=1;k<=n1-i;k++)
   		{
   			if(a1[k]>a1[k+1])
   			{
   				q=a1[k];
   				a1[k]=a1[k+1];
   				a1[k+1]=q;
   			}
   		}
   	}*/
   	
   
   	this.removeAll();
 	/*JLabel la=new JLabel();
   	la.setBounds(100,1,120,40);
   	la.setText("HEAD-MOVEMENTS");
   	this.add(la);
 	
   
   	if(h==3)
   	{
   	JLabel la1=new JLabel();
   	la1.setBounds(200,280,150,40);
   	la1.setText("SCAN-ALGORITHM: "+String.valueOf(m1));
   	this.add(la1);
   	}
 	if(h==1)
   	{
   	JLabel la1=new JLabel();
   	la1.setBounds(200,280,150,40);
   	la1.setText("FCFS-ALGORITHM: "+String.valueOf(m1));
   	this.add(la1);
   	}
 	if(h==2)
   	{
   	JLabel la1=new JLabel();
   	la1.setBounds(200,280,150,40);
   	la1.setText("SSTF-ALGORITHM: "+String.valueOf(m1));
   	this.add(la1);
   	}
 	if(h==4)
   	{
   	JLabel la1=new JLabel();
   	la1.setBounds(200,280,150,40);
   	la1.setText("C-SCAN-ALGORITHM: "+String.valueOf(m1));
   	this.add(la1);
   	}
 	if(h==5)
   	{
   	JLabel la1=new JLabel();
   	la1.setBounds(200,280,150,40);
   	la1.setText("LOOK-ALGORITHM: "+String.valueOf(m1));
   	this.add(la1);
   	}
 	if(h==6)
   	{
   	JLabel la1=new JLabel();
   	la1.setBounds(200,280,150,40);
   	la1.setText("C-LOOK-ALGORITHM "+String.valueOf(m1));
   	this.add(la1);
   	}*/
   	int g1=20,i;
		for(i=1;i<n1;i++)
		{//System.out.println("in"+a1[i]);
		g2.draw(new Line2D.Double(a1[i],g1,a1[i+1],g1+20));	
		if(a1[i]==he1)
		{
			JLabel va=new JLabel();
			va.setBounds((a1[i]-20),g1+20,30,30);
			va.setText("Head");
		this.add(va);
		}
		//System.out.println(a1[i]);
		JLabel l=new JLabel();
		l.setBounds(a1[i],g1,25,25);
		l.setText(String.valueOf(a1[i]));	
		//	l.setBounds(a1[i],10,20,20);
			
		
			this.add(l);
	
		g1=g1+20;
		}
		JLabel l=new JLabel();
		l.setBounds(a1[i],g1,25,25);
		
		l.setText(String.valueOf(a1[i]));	
		this.add(l);
		
		g1=20;
		for(i=1;i<n1;i++)
		{//System.out.println("in"+a1[i]);
			drawArrowHead(g2, a1[i+1], g1+20,a1[i],g1, Color.red);
			//g2.draw(new Line2D.Double(a1[i],g1,a1[i+1],g1+10));	
		//System.out.println(a1[i]);
	
		g1=g1+20;
		}
		
		
	/*	g2.draw(new Line2D.Double(50,70,80,80));
        //drawArrowHead(g2, 30, 40,10,20, Color.red);
		g2.draw(new Line2D.Double(80,80,100,100)); 
		drawArrowHead(g2, 80, 80,50,70, Color.red);
		drawArrowHead(g2, 100, 100,80,80, Color.red);*/ 
		/*JLabel l=new JLabel();
		l.setBounds(10,20,15,15);
		l.setText("10");
		l.setVisible(true);
		this.add(l);*/
	   //drawArrowHead(g2, ne, sw, Color.blue);
    }
  
    private void drawArrowHead(Graphics2D g2,double x1,double y1,double x2 ,double y2 ,Color color)
    {
        g2.setPaint(color);
        double dy = y1 - y2;
        double dx = x1 - x2;
        double theta = Math.atan2(dy, dx);
        //System.out.println("theta = " + Math.toDegrees(theta));
        double x, y, rho = theta + phi;
        for(int j = 0; j < 2; j++)
        {
            x = x1 - barb * Math.cos(rho);
            y = y1 - barb * Math.sin(rho);
            g2.draw(new Line2D.Double(x1, y1, x, y));
            rho = theta - phi;
        }
    }
}




public class disk2  extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtNocylinders;
	private JTextField txtHeadpointer;
	private JTextField txtRange;
	
	JPanel cards;
	public CardLayout cardLayout;
	public	int n=10,he;
	public	int a[];
	
	private JTextField txtCylinders;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					disk2 window = new disk2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public disk2() {
		
		getContentPane().setLayout(null);
		setSize(800,500);
		setResizable(false);
		setBackground(Color.yellow);
		setResizable(false);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int a[]=new int[1000];
	int i;
	for(i=1;i<=999;i++)
	{a[i]=0;
		
	}
	
		//frame = new JFrame();
		//frame.setBounds(100, 100, 828, 498);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.getContentPane().setLayout(null);

	JPanel card1=new JPanel();
	JPanel card2=new JPanel();
	cards=new JPanel(new CardLayout());	
	cards.add(card1,"Card 1");
	cards.add(card2,"Card 2");
	cardLayout=(CardLayout)cards.getLayout();
	cardLayout.show(cards,"Card 1");	
	getContentPane().add(cards);
		JButton btnStart = new JButton("START");
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNocylinders.setText("No.Cylinders:");
				txtHeadpointer.setText("Head:");
				
				txtCylinders.setText("Cylinders:");
				String va="Cylinders: ";
				Random r = new Random();
				int Low = 20;
				int High = 560;
				//int Result = r.nextInt(High-Low) + Low;
				he=r.nextInt(High-Low)+Low;
				int i;
				for(i=1;i<=n;i++)
				{ //  a[i]=0;
				
					if(i==5)
					{
						a[i]=he;
						va=va+String.valueOf(a[i])+"     ";
					}
					else
					{
					a[i]=r.nextInt(High-Low)+Low;
					va=va+String.valueOf(a[i])+"     ";
					}
					//System.out.println(a[i]);
				}
				
				txtNocylinders.setText("No.Cylinders:10");
				txtHeadpointer.setText("HeadPointer:"+String.valueOf(he));
				txtCylinders.setText(va);
			
			 
				 
			 
			/*	frame.setVisible(false);
			
				check k=new check();
				k.add1(n,he,a);
			    k.setVisible(true);*/	
				
				//ArrowPanel k=new ArrowPanel(n,he,a);
				//frame.getContentPane().add(new ArrowPanel(n,he,a));
				//frame.getContentPane().add(new ArrowPanel());
			}
		});
		
		btnStart.setBounds(287, 17, 102, 32);
		card1.add(btnStart);
		
		JButton btnFcfs = new JButton("FCFS");
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 fcfs1 f=new fcfs1();	
					int m=f.find1(n,he,a);
					  int i;int count=0;
						for(i=1;i<=999;i++)
						{if(a[i]==0)
						{
							break;
						}
						count=count+1;	
						
						}
						System.out.println(m);
						for(i=1;i<=count;i++)
						{
							System.out.println("in fcfs"+a[i]);
						}
						//card2.add(new ArrowPanel2(a,count));
						
						//cardLayout.show(cards,"Card 2");
						
						//frame.setVisible(false);
						
						//check2 k=new check2();
						//card2.add(new check2());
						//k.add1(a,count,he,m,1);
					    //k.setVisible(true);	
			}
		});
		btnFcfs.setBounds(171, 248, 89, 38);
		card1.add(btnFcfs);
		
/*		JButton btnSstf = new JButton("SSTF");
		btnSstf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   sstf1 c=new sstf1();	
				int m=c.find1(n,he,a);
				  int i;int count=0;
					for(i=1;i<=999;i++)
					{if(a[i]==0)
					{
						break;
					}
					count=count+1;	
					
					}
					for(i=1;i<=count;i++)
					{
						System.out.println("in sstf"+a[i]);
					}
					frame.setVisible(false);
					check k=new check();
					k.add1(a,count,he,m,2);
				    k.setVisible(true);	
				}
		});
		btnSstf.setBounds(171, 326, 89, 38);
		frame.getContentPane().add(btnSstf);
		
		JButton btnScan = new JButton("SCAN");
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				scan1 l=new scan1();
			
				int m=l.find1(n,he,a);
				
				
			    int i;int count=0;
				for(i=1;i<=999;i++)
				{if(a[i]==0)
				{
					break;
				}
				count=count+1;	
				
				}
				
			  
				frame.setVisible(false);
				check k=new check();
				k.add1(a,count,he,m,3);
			    k.setVisible(true);	
			}
		});
		btnScan.setBounds(327, 248, 89, 38);
		frame.getContentPane().add(btnScan);
		
		JButton btnCscan = new JButton("C-SCAN");
		btnCscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				c l=new c();
				int m=l.find1(n,he,a);
				  int i;int count=0;
					for(i=1;i<=999;i++)
					{if(a[i]==0)
					{
						break;
					}
					count=count+1;	
					
					}
					
				  
					frame.setVisible(false);
					check k=new check();
					k.add1(a,count,he,m,4);
				    k.setVisible(true);	
			}
		});
		btnCscan.setBounds(327, 326, 89, 38);
		frame.getContentPane().add(btnCscan);
		
		JButton btnLook = new JButton("LOOK");
		btnLook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				look1 l=new look1();
				int m=l.find1(n,he,a);
				  int i;int count=0;
					for(i=1;i<=999;i++)
					{if(a[i]==0)
					{
						break;
					}
					count=count+1;	
					
					}
					for(i=1;i<=count;i++)
					{
						System.out.println("in look"+a[i]);
					}
					frame.setVisible(false);
					check k=new check();
					k.add1(a,count,he,m,5);
				    k.setVisible(true);	
			}
		});
		btnLook.setBounds(475, 248, 89, 38);
		frame.getContentPane().add(btnLook);
		
		JButton btnClook = new JButton("C-LOOK");
		btnClook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clook c=new clook();
				int m=c.find1(n,he,a);
				  int i;int count=0;
					for(i=1;i<=999;i++)
					{if(a[i]==0)
					{
						break;
					}
					count=count+1;	
					
					}
					for(i=1;i<=count;i++)
					{
						System.out.println("in look"+a[i]);
					}
					frame.setVisible(false);
					check k=new check();
					k.add1(a,count,he,m,6);
				    k.setVisible(true);	
				
			}
		});
		btnClook.setBounds(475, 326, 89, 38);
		frame.getContentPane().add(btnClook);*/
		
		txtNocylinders = new JTextField();
		txtNocylinders.setText("No.Cylinders:");
		txtNocylinders.setBounds(138, 83, 109, 32);
		card1.add(txtNocylinders);
		txtNocylinders.setColumns(10);
		
		txtHeadpointer = new JTextField();
		txtHeadpointer.setText("Head_Pointer:");
		txtHeadpointer.setBounds(287, 83, 102, 32);
		card1.add(txtHeadpointer);
		txtHeadpointer.setColumns(10);
		
		txtRange = new JTextField();
		txtRange.setText("Range:10-580");
		txtRange.setBounds(427, 83, 109, 32);
		card1.add(txtRange);
		txtRange.setColumns(10);
		
	/*	JButton btnMainPage = new JButton("MAIN PAGE");
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				main k=new main();
				k.setVisible(true);
			}
		});
		btnMainPage.setBounds(595, 17, 109, 32);
		frame.getContentPane().add(btnMainPage);*/
		
		txtCylinders = new JTextField();
		txtCylinders.setText("CYLINDERS:");
		txtCylinders.setBounds(68, 141, 655, 23);
		card1.add(txtCylinders);
		txtCylinders.setColumns(10);
		
		JLabel lblAlgorithms = new JLabel("ALGORITHMS");
		lblAlgorithms.setBounds(327, 201, 89, 23);
		card1.add(lblAlgorithms);
	}

/*	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}*/

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
public static void main(String args[])
{
	new disk2();
}
}
