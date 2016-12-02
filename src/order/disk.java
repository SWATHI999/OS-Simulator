package order;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class disk {

	private JFrame frame;
	private JTextField txtNocylinders;
	private JTextField txtHeadpointer;
	private JTextField txtRange;
		int n=10,he,outputfi,outputss,outputsc,outputcsc,outputlo,outputclo;
		int a[],outs[];
		private JTextField txtCylinders;
		private JTextField txtHeadmovements;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					disk window = new disk();
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
	public disk() {
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
	 outs=new int[6];
		frame = new JFrame("DiskAlgorithms");
		frame.setBounds(100, 100, 828, 498);
		frame.getContentPane().setBackground(new Color(102, 204, 153));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().add(new ArrowPanel());
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.setBackground(new Color(153, 153, 153));
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
		frame.getContentPane().add(btnStart);
		
		JButton btnFcfs = new JButton("FCFS");
		btnFcfs.setBackground(new Color(204, 255, 153));
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 fcfs1 f=new fcfs1();	
					int m=f.find1(n,he,a);
					outputfi=m;
					txtHeadmovements.setText("Head Movements in fcfs:"+String.valueOf(m));
			
			}
		});
		btnFcfs.setBounds(46, 270, 89, 38);
		frame.getContentPane().add(btnFcfs);
		
		JButton btnSstf = new JButton("SSTF");
		btnSstf.setBackground(new Color(204, 255, 153));
		btnSstf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 sstf1 c=new sstf1();	
					int m=c.find1(n,he,a);
					outputss=m;
					txtHeadmovements.setText("Head Movements in sstf:"+String.valueOf(m));
				
			}
		});
		btnSstf.setBounds(46, 341, 89, 38);
		frame.getContentPane().add(btnSstf);
		
		JButton btnScan = new JButton("SCAN");
		btnScan.setBackground(new Color(204, 255, 153));
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            scan1 l=new scan1();
				
				int m=l.find1(n,he,a);
				outputsc=m;
				txtHeadmovements.setText("Head Movements in scan:"+String.valueOf(m));
			}
		});
		btnScan.setBounds(200, 270, 89, 38);
		frame.getContentPane().add(btnScan);
		
		JButton btnCscan = new JButton("C-SCAN");
		btnCscan.setBackground(new Color(204, 255, 153));
		btnCscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c l=new c();
				int m=l.find1(n,he,a);
				outputcsc=m;
				txtHeadmovements.setText("Head Movements in c-scan:"+String.valueOf(m));
			
			}
		});
		btnCscan.setBounds(200, 341, 89, 38);
		frame.getContentPane().add(btnCscan);
		
		JButton btnLook = new JButton("LOOK");
		btnLook.setBackground(new Color(204, 255, 153));
		btnLook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				look1 l=new look1();
				int m=l.find1(n,he,a);
				outputlo=m;
				
				txtHeadmovements.setText("Head Movements in look:"+String.valueOf(m));
			}
		});
		btnLook.setBounds(347, 270, 89, 38);
		frame.getContentPane().add(btnLook);
		
		JButton btnClook = new JButton("C-LOOK");
		btnClook.setBackground(new Color(204, 255, 153));
		btnClook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clook c=new clook();
				int m=c.find1(n,he,a);
				outputclo=m;
				
				txtHeadmovements.setText("Head Movements in clook:"+String.valueOf(m));
			}
		});
		btnClook.setBounds(347, 341, 89, 38);
		frame.getContentPane().add(btnClook);
		
		txtNocylinders = new JTextField();
		txtNocylinders.setBackground((new Color(204, 255, 204)));
		txtNocylinders.setText("No.Cylinders:");
		txtNocylinders.setBounds(138, 83, 109, 32);
		frame.getContentPane().add(txtNocylinders);
		txtNocylinders.setColumns(10);
		
		txtHeadpointer = new JTextField();
		txtHeadpointer.setBackground((new Color(204, 255, 204)));
		txtHeadpointer.setText("Head_Pointer:");
		txtHeadpointer.setBounds(287, 83, 102, 32);
		frame.getContentPane().add(txtHeadpointer);
		txtHeadpointer.setColumns(10);
		
		txtRange = new JTextField();
		txtRange.setBackground((new Color(204, 255, 204)));
		txtRange.setText("Range:10-580");
		txtRange.setBounds(427, 83, 109, 32);
		frame.getContentPane().add(txtRange);
		txtRange.setColumns(10);
		
		JButton btnMainPage = new JButton("MAIN PAGE");
		btnMainPage.setBackground(new Color(153, 153, 153));
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				main2 k=new main2();
				k.setVisible(true);
			}
		});
		btnMainPage.setBounds(595, 17, 109, 32);
		frame.getContentPane().add(btnMainPage);
		
		txtCylinders = new JTextField();
		txtCylinders.setText("CYLINDERS:");
		txtCylinders.setBackground((new Color(204, 255, 204)));
		txtCylinders.setBounds(68, 141, 655, 23);
		frame.getContentPane().add(txtCylinders);
		txtCylinders.setColumns(10);
		
		JLabel lblAlgorithms = new JLabel("ALGORITHMS");
		lblAlgorithms.setBounds(200, 231, 89, 23);
		frame.getContentPane().add(lblAlgorithms);
		
		txtHeadmovements = new JTextField();
		txtHeadmovements.setText("HeadMovements:");
		txtHeadmovements.setBackground((new Color(204, 255, 204)));
		txtHeadmovements.setBounds(264, 175, 238, 32);
		frame.getContentPane().add(txtHeadmovements);
		txtHeadmovements.setColumns(10);
		
		JButton btnGraph = new JButton("GRAPH");
		btnGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
						for(i=1;i<=count;i++)
						{
							System.out.println("in fcfs"+a[i]);
						}
						
						frame.setVisible(false);
						check k=new check();
						k.add1(a,count,he,m,1);
					    k.setVisible(true);	
					   
				
				
				
				
			}
		});
		btnGraph.setBounds(46, 307, 89, 23);
		frame.getContentPane().add(btnGraph);
		
		JButton btnGraph_1 = new JButton("GRAPH");
		btnGraph_1.addActionListener(new ActionListener() {
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
		btnGraph_1.setBounds(46, 378, 89, 23);
		frame.getContentPane().add(btnGraph_1);
		
		JButton btnGraph_2 = new JButton("GRAPH");
		btnGraph_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		btnGraph_2.setBounds(200, 307, 89, 23);
		frame.getContentPane().add(btnGraph_2);
		
		JButton btnGraph_3 = new JButton("GRAPH");
		btnGraph_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		btnGraph_3.setBounds(200, 378, 89, 23);
		frame.getContentPane().add(btnGraph_3);
		
		JButton btnGraph_4 = new JButton("GRAPH");
		btnGraph_4.addActionListener(new ActionListener() {
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
		btnGraph_4.setBounds(347, 307, 89, 23);
		frame.getContentPane().add(btnGraph_4);
		
		JButton btnGraph_5 = new JButton("GRAPH");
		btnGraph_5.addActionListener(new ActionListener() {
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
		btnGraph_5.setBounds(347, 378, 89, 23);
		frame.getContentPane().add(btnGraph_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground((new Color(204, 255, 204)));
		textArea.setBounds(497, 270, 256, 124);
		frame.getContentPane().add(textArea);
		
		JButton btnComparison = new JButton("Comparison");
		 btnComparison .setBackground(new Color(204, 204, 153));
		btnComparison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int i;
				outs[0]=outputfi;
				outs[1]=outputss;
				outs[2]=outputsc;
				outs[3]=outputcsc;
				outs[4]=outputlo;
				outs[5]=outputclo;
				float min=outputfi;
				
				for(i=0;i<=5;i++)
				{
				if(min>=outs[i])
				{
				min=outs[i];
				}
				}int pos=0;
				for(i=0;i<=5;i++)
				{
					if(min==outs[i])
					{  pos=i;
						break;
					}
				}
				String va;
				va="1)Head Movements in FiFo:"+String.valueOf(outs[0])+"\n"+"2)Head Movements in SSTF:"+String.valueOf(outs[1])+"\n"+"3)Head Movements in scan:"+String.valueOf(outs[2])+"\n"+"4)Head Movements in c-scan:"+String.valueOf(outs[3])+
						"\n"+"5)Head Movements in look:"+String.valueOf(outs[4])+"\n"+"6)Head Movements in c-look:"+String.valueOf(outs[5]);
				 textArea.setText(va);
				 
				 if(pos==0)
				 {
					//JOptionpane().showMessageDialog(frame,"FCFS is the Best Algorithm"); 
					 textArea.setText(va+"\n"+"Best one for this input is FIFO");
					 JOptionPane.showMessageDialog(null,"Best one for this input is FIFO");
				 } 
				 if(pos==1)
				 {
					 textArea.setText(va+"\n"+"Best one for this input is SSTF");
					 JOptionPane.showMessageDialog(null,"Best one for this input is SSTF"); 
				 }
				 if(pos==2)
				 {
					 textArea.setText(va+"\n"+"Best one for this input is SCAN");
					 JOptionPane.showMessageDialog(null,"Best one for this input is SCAN");
				 }
				 if(pos==3)
				 {
					 textArea.setText(va+"\n"+"Best one for this input is C-SCAN");
					 JOptionPane.showMessageDialog(null,"Best one for this input is C-SCAN");
				 }
				 if(pos==4)
				 {
					 textArea.setText(va+"\n"+"Best one for this input is LOOK");
					 JOptionPane.showMessageDialog(null,"Best one for this input is LOOK");
				 }
				 if(pos==5)
				 {
					 textArea.setText(va+"\n"+"Best one for this input is C-LOOK");
					 JOptionPane.showMessageDialog(null,"Best one for this input C-LOOK");
				 }
				
							
				
				
				
			}
		});
		btnComparison.setBounds(523, 231, 95, 23);
		frame.getContentPane().add(btnComparison);
		
		JButton btnGraph_6 = new JButton("Graph");
		btnGraph_6 .setBackground(new Color(204, 204, 153));
		btnGraph_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ngraph3 g=new ngraph3("HEAD MOVEMENTS ","DISK SCHEDULING ALGORITHMS",outputfi,outputss,outputsc,outputcsc,outputlo,outputclo);
				
				
			}
		});
		btnGraph_6.setBounds(628, 231, 89, 23);
		frame.getContentPane().add(btnGraph_6);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
