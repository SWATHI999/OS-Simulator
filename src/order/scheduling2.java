package order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;
public class scheduling2 extends IntervalBarChartDemo1 {

	private JFrame frame;
	private JTextField txtNoprocesses;
	private JTextField txtAverageWaitingTime;
	DefaultTableModel model1 = new DefaultTableModel();
	private JTable table;
	private JTextArea textArea;
	private JTextField txtNoprocesses_1;
	int arrti[],burti[],priority[],tim,n;double outsjf,outsrtf,outpreprio,outnprio,outround;
	double outfc;
	double outs[];
	//table=new JTable(model1);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scheduling2 window = new scheduling2();
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
	public scheduling2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int arrti[]=new int[1000];
		int burti[]=new int[1000];
		int priority[]=new int[1000];
		double outs[]=new double[6];
		//int outs[];
		table=new JTable(model1);
		frame = new JFrame("Scheduling Algorithms:");
		frame.setBounds(100, 100, 855, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String va="";
			va="No.Processes:";
			txtNoprocesses_1.setText(va);
			 txtAverageWaitingTime.setText("Avearge_Waiting_Time:");
			 textArea.setText("");
				for(int i=0;i<1000;i++)
			{
				arrti[i]=0;
				burti[i]=0;
				priority[i]=0;
			}
				int rowCount = model1.getRowCount();
				
				for ( int i = rowCount; i > 0 ; i--)
				{
					model1.removeRow(i-1);
				} 
				Random r=new Random();
				n=r.nextInt(10)+1;
				tim=r.nextInt(10)+1;
				model1.setColumnCount(0);
				model1.addColumn("column1"); 
				model1.addColumn("column2"); 
				model1.addColumn("column3");
				model1.addColumn("column4");
				model1.addColumn("column5");
				model1.addRow(new Object[]{"processID","arrivaltime", "bursttime","priority","timequantum"});
				int i;
				for(i=0;i<n;i++)
				{
					arrti[i]=r.nextInt(10);
					burti[i]=r.nextInt(10)+1;
					priority[i]=r.nextInt(10)+1;
					model1.addRow(new Object[]{String.valueOf(i+1),String.valueOf(arrti[i]),String.valueOf(burti[i]),String.valueOf(priority[i]),String.valueOf(tim)});
					
				}
				va=va+String.valueOf(n);
			//	txtNoprocesses_1.setText(va);
				
				
			}
		});
		btnStart.setBounds(255, 11, 102, 28);
		frame.getContentPane().add(btnStart);
		
		txtNoprocesses = new JTextField();
		txtNoprocesses.setText("No.Processes:");
		frame.getContentPane().add(txtNoprocesses);
		txtNoprocesses.setColumns(10);
		
		txtAverageWaitingTime = new JTextField();
		txtAverageWaitingTime.setText("Average Waiting time:");
		txtAverageWaitingTime.setBounds(255, 50, 244, 28);
		frame.getContentPane().add(txtAverageWaitingTime);
		txtAverageWaitingTime.setColumns(10);
		//DefaultTableModel model1 = new DefaultTableModel();
		//table = new JTable(model1);
		table.setBounds(159, 90, 455, 176);
		frame.getContentPane().add(table);
	
		
		
		JButton btnFcfs = new JButton("fcfs");
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double key,k,min=100,sum=0,min1=0,fb=0,fi=0,fm=0,min11;
						int min_index=0,m1=0,j;
				//	System.out.println("The Random Number Generated is "+ x);
				double A[]=new double[n+1];double B[]=new double[n+1];
				double c[]=new double[n+1];double cl[]=new double[n+1];
				double t[]=new double[n+1];
				double w[]=new double[n+1];
				for(int y=0;y<n;y++)
				{
					A[y]=arrti[y+1];
					B[y]=burti[y+1];
				}
				for(int i=0;i<n;i++)
				{cl[i]=0;}
				double[][] lows = new double[1][n];
	             double[][] highs = new double[1][n];
	             
				for(int i=0;i<n;i++)
				{
					if(A[i]<=min)
					{
						min=A[i];
						m1=i;
						lows[0][0]=A[0];
					}
				}
				System.out.println("The minimum number is "+ min);
				c[m1]=A[m1]+B[m1];
				cl[m1]=1;
				highs[0][0]=c[m1];
		        lows[0][1]=c[m1];
		        System.out.println("hgdhfg" + lows[0][1]);
				min=100;
				for(k=0;k<n;k++)
				{
					for(j=0;j<n;j++)
					{
						
						if(A[j]<=min&&cl[j]!=1)
						{
							min=A[j];
							min_index=j;
							min1=B[min_index];
						}
					}
					if(c[m1]>A[min_index])
					{
						c[min_index]=c[m1]+B[min_index];
						highs[0][min_index]=c[min_index];
						if(min_index!=n-1)
				              lows[0][min_index+1]=c[min_index];
					}
					else if(c[m1]<A[min_index])
					{
						c[min_index]=A[min_index]+B[min_index];
						 highs[0][min_index]=c[min_index];
			                if(min_index!=n-1)
			                lows[0][min_index+1]=c[min_index];
					}
					else
					{
						c[min_index]=A[min_index]+B[min_index];
						 highs[0][min_index]=c[min_index];
			                if(min_index!=n-1)
			                lows[0][min_index+1]=c[min_index];
					}
					cl[min_index]=1;
					min=100;
					m1=min_index;
				}
				try{for(int v=0;v<n;v++)
					{
						System.out.println(c[v]);
					}
				}catch(ArrayIndexOutOfBoundsException d){}
				try{for(int v=0;v<n;v++)
				{
					t[v]=c[v]-A[v];
				}}catch(ArrayIndexOutOfBoundsException d){}
			try{for(int y=0;y<n;y++)
				{
					w[y]=t[y]-B[y];
				}
			}catch(ArrayIndexOutOfBoundsException d){}
			try{for(int q=0;q<n;q++)
				{
					sum=sum+w[q];
					System.out.println(w[q]);
				}
			}catch(ArrayIndexOutOfBoundsException d){}
			System.out.println("The Average waiting time is "+ (sum/n));
				double out=(sum/n); 
				txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_fcfs:"+String.valueOf(out));
				
				outfc=out;
				scheduling2 k5=new scheduling2();
				k5.Demo1(lows,highs,n);
				
				
			}
		});
		btnFcfs.setBounds(40, 309, 130, 39);
		frame.getContentPane().add(btnFcfs);
		
		JButton btnSjf = new JButton("sjf");
		btnSjf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int key,k,min=100,min_index=0,mini=0,m1=0,j,sum=0,minb,min1=100,min1b=0;
				
				int A[]=new int[n+1];
				System.out.println(n +" processors");
				int B[]=new int[n+1];
				int c[]=new int[n+1];int t[]=new int[n+1];
				int w[]=new int[n+1];int cl[]=new int[n+1];
				for(int i=1;i<=n;i++)
				{cl[i]=0;}
				System.out.println("Arrival times");
				for(int i=1;i<=n;i++)
				{
					A[i]=arrti[i-1];
					System.out.println(A[i]);//Arrival times
				}
				System.out.println("Burst times");
				for(int i=1;i<=n;i++)
				{
					B[i]=burti[i-1];
					System.out.println(B[i]);//Burst times
				}
				for(int i=1;i<=n;i++)
				{
						if(A[i]<=min)
						{
							min=A[i];
							m1=i;
						}
				}
				for(int i=1;i<=n;i++)
				{
						if(B[i]<=min1)
						{
							min1=B[i];
							min1b=i;
						}
				}
				//System.out.println("The minimum number is "+ min);
				c[m1]=A[m1]+B[m1];
				cl[m1]=1;
				min=100;
				min1=100;
				for(k=1;k<n;k++)
				{
					for(j=1;j<=n;j++)
					{
						if(A[j]<=c[m1])
						{
						if(cl[j]!=1 && B[j]<=min1)
						{
							min1=B[j];
							min_index=j;
							//min1=B[min_index];
						}
						}
					}
					if(c[m1]>A[min_index])
					{
					   c[min_index]=c[m1]+B[min_index];
					}
					else if(c[m1]<A[min_index])
					{
						c[min_index]=A[min_index]+B[min_index];
					}
					else
						
					{
						c[min_index]=A[min_index]+B[min_index];
					}
					cl[min_index]=1;
					min=100;
					min1=100;
					m1=min_index;
				}
				System.out.println("Completion times");
				try{for(int v=1;v<=n;v++)
					{
						System.out.println(c[v]);//completion times
					}
				}catch(ArrayIndexOutOfBoundsException d){}
				try{for(int v=1;v<=n;v++)
				{
					t[v]=c[v]-A[v];
				}}catch(ArrayIndexOutOfBoundsException d){}
				try{for(int y=1;y<=n;y++)
				{
					w[y]=t[y]-B[y];
				}
				}catch(ArrayIndexOutOfBoundsException d){}
				System.out.println("Waiting times");
				try{for(int q=1;q<=n;q++)
				{
					sum=sum+w[q];
					System.out.println(w[q]);//waiting times
				}
				}catch(ArrayIndexOutOfBoundsException d){}
				System.out.println("The Average waiting time is "+ (sum/n));
					float out=(sum/n);
				 txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_sjf:"+String.valueOf(out));
				 outsjf=out;
				
				
			}
		});
		btnSjf.setBounds(40, 380, 130, 39);
		frame.getContentPane().add(btnSjf);
		
		JButton btnSrtf = new JButton("srtf");
		btnSrtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//va="";
				//txt.setText("average waiting time:");
				if(n==1)
				{ txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_SRTF:"+String.valueOf(0));
					
				}
				else
				{
				
					int completi[],i,enter[],remai[];
					
					//n=r.nextInt(6)+1;
					completi=new int[1000];
					enter=new int[1000];
					remai=new int[1000];
					/*for(i=0;i<n;i++)
			{
				arrti[i]=r.nextInt(10);
				//arrti[i]=s.nextInt();
				System.out.println("arrival1"+""+arrti[i]);
				burti[i]=r.nextInt(10)+1;
				//burti[i]=s.nextInt();
				System.out.println("burst1"+""+burti[i]);
			}*/
					int j,d=0;
					for(i=0;i<n;i++)
					{
						for(j=0;j<n-i-1;j++)
						{
							if(arrti[j]>arrti[j+1])
							{
								int temp=arrti[j];
								arrti[j]=arrti[j+1];
								arrti[j+1]=temp;
								int temp1=burti[j];
								burti[j]=burti[j+1];
								burti[j+1]=temp1;
							}
						}
					}
					System.out.println(n);
					for(i=0;i<n;i++)
					{
						System.out.println("arri"+arrti[i]);
						System.out.println("burst"+burti[i]);
					}
					for(i=0;i<n;i++)
					{
						enter[i]=0;
						remai[i]=999;
						completi[i]=0;
					}
					int k=0;
					int m=0;
					int s1=0;
					int l=0;
					int pos=0,min=0,count,g=0,f=0,h=0;
					int cycles=arrti[0],pos1=0;
					while(true)
					{
						System.out.println("vas");
						int cou=0;
						for(i=k+1;i<n;i++)
						{	
							
							if(enter[i]==0)
							{
								
								pos1=i;	
								break;
							}
						}
						count=0;
						while(true)
						{l=0;f=0;d=0;
							if(cycles==arrti[pos1])
							{ //f=0;d=0;
								if(enter[k]==0)
								{
									if(burti[k]<count)
									{
										remai[k]=0;
										f=1;
									}
									else
									{
										remai[k]=burti[k]-count;
									}
									System.out.println("infirst"+remai[k]);
								}
								else
								{	if(remai[k]<count)
									{
										s1=remai[k];
										remai[k]=0;
										d=1;
										f=1;
									}
									else
									{
										remai[k]=remai[k]-count;
									}
									System.out.println("insecond"+remai[k]);
								}
								remai[pos1]=burti[pos1];
								if(remai[k]==0)
								{if(f==1)
									{	if(d==1)
										{
											m=cycles-count;
											completi[k]=m+s1;
											cycles=cycles-count+s1;
											l=1;
										}
										else
										{
											completi[k]=arrti[k]+burti[k];
										}
									}
									else
									{
										completi[k]=cycles;
									}
								}
								break;
							}
							else
							{
								cycles=cycles+1;
								count=count+1;
							} 
						}
						enter[k]=1;
						if(l==1)
						{
							enter[pos1]=0;
						}
						else
						{
							
							enter[pos1]=1;
						}
						
						for(i=0;i<n;i++)
						{
							if(remai[i]!=0&&enter[i]!=0)
							{
								min=remai[i];
								pos=i;
								break;
							}
						}
						for(i=0;i<n;i++)
						{
							if(remai[i]!=0&&enter[i]!=0)
							{
								if(min>remai[i])
								{
									min=remai[i];
									pos=i;
								}
								
							}
						}
						k=pos;
						System.out.println("****"+k);
						//enter[pos1]=1;
						count=0;
						for(i=0;i<n;i++)
						{
							if(enter[i]==1)
							{
								count=count+1;
							}
						}
						System.out.println(count);
						if(count==n)
						{
							break;
						}
					}
					for(i=0;i<n;i++)
					{
						System.out.println("remaining"+remai[i]);
					}
					while(true)
					{	//System.out.println("vasavi");
						min=999;
						for(i=0;i<n;i++)
						{
							if(remai[i]!=0)
							{
								if(min>remai[i])
								
								{
									min=remai[i];
									pos=i;
								}
							}
							
						}
						System.out.println("important"+cycles);
						cycles=cycles+min;
						completi[pos]=completi[pos]+cycles;
						remai[pos]=0;
						count=0;
						for(i=0;i<n;i++)
						{	if(remai[i]==0)
							{
								count=count+1;
							}
						}
						if(count==n)
						{
							break;
						}
					}
					for(i=0;i<n;i++)
					{
						System.out.println("final"+completi[i]);
					}
					int tat[],wait[];
					tat=new int[1000];
					wait=new int[1000];
					for(i=0;i<n;i++)
					{
						tat[i]=completi[i]-arrti[i];
					}
					int sum=0;
					for(i=0;i<n;i++)
					{
						wait[i]=tat[i]-burti[i];
						sum=sum+wait[i];
					}
					float avewait;
					avewait=(sum/n);
					System.out.println("average waiting time:"+avewait);
				
					 txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_SRTF:"+String.valueOf(avewait));
					outsrtf=avewait;
				
				}
			}
		});
		btnSrtf.setBounds(204, 309, 130, 39);
		frame.getContentPane().add(btnSrtf);
		
		JButton btnPriorityPre = new JButton("priority pre");
		btnPriorityPre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float value;
			
				Prepriority p=new Prepriority();
				value=p.find1(arrti,burti,priority,n);
				 txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_Prepriority:"+String.valueOf(value));
				outpreprio=value;
				
				
			}
		});
		btnPriorityPre.setBounds(204, 380, 130, 39);
		frame.getContentPane().add(btnPriorityPre);
		
		JButton btnPriorityNonpre = new JButton("Priority nonpre");
		btnPriorityNonpre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int key,k,min=100,min_index=0,mini=0,m1=0,j,sum=0,min1=0,fb=0,fi=0,fm=0,min11;
				int A[]=new int[n+1];int p[]=new int[n+1];
				//System.out.println(x +" processors");
				int B[]=new int[n+1];
				int c[]=new int[n+1];int t[]=new int[n+1];
				int w[]=new int[n+1];int cl[]=new int[n+1];
				for(int i=1;i<=n;i++)
				{cl[i]=0;}
				for(int i=1;i<=n;i++)
				{
					p[i]=priority[i-1];
					System.out.println("priority of " + i + " is " + p[i]);
				}
				for(int i=1;i<=n;i++)
				{
					A[i]=arrti[i-1];
					System.out.println(" Arrival times : " + A[i]);//Arrival times
				}
				for(int i=1;i<=n;i++)
				{
					B[i]=burti[i-1];
					System.out.println("Burst times : " + B[i]);//Burst times
				}
				for(int i=1;i<=n;i++)
				{
					if(A[i]<=min )
					{
						if(p[i]<=min)
						{
							min=p[i];
							m1=i;
						}
					}
				}
				System.out.println("The minimum number is "+ min);
				c[m1]=A[m1]+B[m1];
				cl[m1]=1;
				min=100;
				for(k=1;k<n;k++)
				{
					for(j=1;j<=n;j++)
					{
						if(A[j]<=min&&cl[j]!=1&&p[j]<=min)
						{
							min=p[j];
							min_index=j;
							min1=B[min_index];
						}
					}
					if(c[m1]>A[min_index])
					{
						c[min_index]=c[m1]+B[min_index];
					}
					else if(c[m1]<A[min_index])
					{
						c[min_index]=A[min_index]+B[min_index];
					}
					else
					
					{
						c[min_index]=A[min_index]+B[min_index];
					}
					cl[min_index]=1;
					min=100;
					m1=min_index;
				}
				try{for(int v=1;v<=n;v++)
					{
						System.out.println("completion times : " + c[v]);//completion times
					}
				}catch(ArrayIndexOutOfBoundsException d){}
				try{for(int v=1;v<=n;v++)
					{
						t[v]=c[v]-A[v];
					}}catch(ArrayIndexOutOfBoundsException d){}
				try{for(int y=1;y<=n;y++)
					{
						w[y]=t[y]-B[y];
					}
				}catch(ArrayIndexOutOfBoundsException d){}
				try{for(int q=1;q<=n;q++)
					{
						sum=sum+w[q];
						System.out.println(" wating times : " + w[q]);//waiting times
					}
				}catch(ArrayIndexOutOfBoundsException d){}
				System.out.println("The Average waiting time is "+ (sum/n));
				float out=(sum/n);
				 txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_priority_non_pre:"+String.valueOf(out));
				 outnprio=out;
				
				
			}
		});
		btnPriorityNonpre.setBounds(385, 309, 114, 39);
		frame.getContentPane().add(btnPriorityNonpre);
		
		JButton btnRoundrobin = new JButton("roundrobin");
		btnRoundrobin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float value;
					//va="";
					//txt.setText("average waiting time:");
					//va=va+txt.getText();
				 roundrobin l=new roundrobin();	
				 value=l.find(arrti,burti,priority,tim,n);
				 txtAverageWaitingTime.setText("Avearge_Waiting_Time_in_roundrobin:"+String.valueOf(value));
				//txt.setText(va+String.valueOf(value));
				 outround=value;
			}
		});
		btnRoundrobin.setBounds(384, 380, 115, 39);
		frame.getContentPane().add(btnRoundrobin);
		
		 textArea = new JTextArea();
		textArea.setBounds(559, 309, 227, 110);
		frame.getContentPane().add(textArea);
		
		JButton btnComparison = new JButton("Comparison");
		btnComparison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
			int i;
			outs[0]=outfc;
			outs[1]=outsjf;
			outs[2]=outsrtf;
			outs[3]=outpreprio;
			outs[4]=outnprio;
			outs[5]=outround;
			double min=outfc;
			
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
			va="1)AWT in FCFS:"+String.valueOf(outs[0])+"\n"+"2)AWT in SJF:"+String.valueOf(outs[1])+"\n"+"3)AWT in SRTF:"+String.valueOf(outs[2])+"\n"+"4)AWT in PREPRIOR:"+String.valueOf(outs[3])+
					"\n"+"5)AWT in NONPREPRIOR:"+String.valueOf(outs[4])+"\n"+"6)AWT in ROUNDROBIN:"+String.valueOf(outs[5]);
			 textArea.setText(va);
			 
			 if(pos==0)
			 {
				//JOptionpane().showMessageDialog(frame,"FCFS is the Best Algorithm"); 
				 textArea.setText(va+"\n"+"Best one for this input is FCFS");
				 JOptionPane.showMessageDialog(null,"Best one for this input is FCFS");
			 } 
			 if(pos==1)
			 {
				 textArea.setText(va+"\n"+"Best one for this input is SJF");
				 JOptionPane.showMessageDialog(null,"Best one for this input is SJF"); 
			 }
			 if(pos==2)
			 {
				 textArea.setText(va+"\n"+"Best one for this input is SRTF");
				 JOptionPane.showMessageDialog(null,"Best one for this input is SRTF");
			 }
			 if(pos==3)
			 {
				 textArea.setText(va+"\n"+"Best one for this input is PREPRIORITY");
				 JOptionPane.showMessageDialog(null,"Best one for this input is PREPRIORITY");
			 }
			 if(pos==4)
			 {
				 textArea.setText(va+"\n"+"Best one for this input is NONPREPRIORITY");
				 JOptionPane.showMessageDialog(null,"Best one for this input is NONPREPRIORITY");
			 }
			 if(pos==5)
			 {
				 textArea.setText(va+"\n"+"Best one for this input is ROUNDROBIN");
				 JOptionPane.showMessageDialog(null,"Best one for this input is ROUNDROBIN");
			 }
			
						
			
			
			
			}
		
		});
		btnComparison.setBounds(559, 270, 107, 28);
		frame.getContentPane().add(btnComparison);
		
		JLabel lblAlgorithms = new JLabel("ALGORITHMS");
		lblAlgorithms.setBounds(234, 269, 123, 29);
		frame.getContentPane().add(lblAlgorithms);
		
		txtNoprocesses_1 = new JTextField();
		txtNoprocesses_1.setText("No.Processes:");
		txtNoprocesses_1.setBounds(385, 11, 114, 28);
		frame.getContentPane().add(txtNoprocesses_1);
		txtNoprocesses_1.setColumns(10);
		
		JButton btnMainPage = new JButton("MAIN PAGE");
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			main2 m=new main2();
			m.setVisible(true);
			}
		});
		btnMainPage.setBounds(674, 14, 123, 39);
		frame.getContentPane().add(btnMainPage);
		
		JButton btnGraph = new JButton("GRAPH");
		btnGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	ngraph g=new ngraph("Averagewaitingtime","SCHEDULING_ALGORITHMS",outfc,outsjf,outsrtf,outpreprio,outnprio,outround);
			
			
			
			}
		});
		btnGraph.setBounds(689, 270, 97, 28);
		frame.getContentPane().add(btnGraph);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
