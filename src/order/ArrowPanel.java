package order;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class ArrowPanel extends JPanel {
	
	
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
//	public static int a[];
	//  int s[];
	  /*public ArrowPanel()
	  { phi = Math.toRadians(40);
      barb = 5;
	  
	  }*/
	  
	  public ArrowPanel()
	    {
	        phi = Math.toRadians(40);
	        barb = 5;
	      
	    }
	  public void add2(int a[],int n,int he,int m,int h1)
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
	  //}
	  
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
	   
	   	int i,k,q;
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
	 	JLabel la=new JLabel();
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
	   	}
	   	int g1=20;
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


