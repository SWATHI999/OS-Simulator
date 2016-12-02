package order;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
//import java.util.Scanner;
import java.util.*;
import java.util.Queue;
//import java.io.*
import java.awt.*;
//int input[];
public class pagefault {
	int input[];
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int n,k,outputsc,outputopt,outputfi,outputlru;
	private JTextField txtOutput;
	private JTextArea textArea;
	//input[]=new int[1000];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagefault window = new pagefault();
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
	public pagefault() {
		/*int input[]=new int[1000];
	int i;
		for(i=0;i<=999;i++)
		{
			input[i]=0;
		}*/
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int input[]=new int[1000];
		int i;
			for(i=0;i<=999;i++)
			{
				input[i]=0;
			}
		
		frame = new JFrame("PageFaults");
		frame.setBounds(100, 100, 727, 479);
		frame.getContentPane().setBackground(new Color(102, 204, 153));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField("REFERENCE STRING:");
		textField.setBounds(65, 87, 615, 29);
		textField.setBackground((new Color(204, 255, 204)));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("FIFO"); 
		btnNewButton_2.setBackground(new Color(204, 255, 153));
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			//secondchance s=new secondchance();
				fifo opt=new fifo();
				int v4;
				v4=opt.output(n,k,input);
				outputfi=v4;
				txtOutput.setText(String.valueOf("pagefaults_in_Fifo_is:"+v4));
			
			}
		});
		btnNewButton_2.setBounds(65, 242, 137, 60);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LRU");
		btnNewButton_3.setBackground(new Color(204, 255, 153));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				
				
				lru opt=new lru();
				int v4;
				v4=opt.output(n,k,input);
				outputlru=v4;
				txtOutput.setText(String.valueOf("pagefaults_in_LRU_is:"+v4));
				
			}
		});
		btnNewButton_3.setBounds(268, 242, 137, 60);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("OPTIMAL");
		btnNewButton_4.setBackground(new Color(204, 255, 153));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				optimal opt=new optimal();
				int v4;
				v4=opt.output(n,k,input);
				outputopt=v4;
				txtOutput.setText(String.valueOf("pagefaults_in_Optimal_is:"+v4));
				}
		});
		btnNewButton_4.setBounds(65, 347, 137, 60);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("SECOND_CHANCE");
		btnNewButton_5.setBackground(new Color(204, 255, 153));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondchance1 se=new secondchance1();
			
				
				int v4;
			
				v4=se.output(n,k,input);
				outputsc=v4;
				
			txtOutput.setText(String.valueOf("pagefaults_in_Secondchance_is:"+v4));
				
				
			}
		});
		btnNewButton_5.setBounds(268, 347, 137, 60);
		frame.getContentPane().add(btnNewButton_5);
		
		textArea = new JTextArea();
		textArea.setBounds(472, 241, 208, 166);
		textArea.setBackground((new Color(204, 255, 204)));
		frame.getContentPane().add(textArea);
		
		textField_1 = new JTextField("String_length:");
		textField_1.setBounds(67, 139, 135, 29);
		textField_1.setBackground((new Color(204, 255, 204)));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("Frame_size:");
		textField_2.setBounds(268, 139, 135, 29);
		textField_2.setBackground((new Color(204, 255, 204)));
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("START");
		 btnNewButton.setBackground(new Color(153, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			/*frame.setVisible(false);
				vas va=new vas();
			va.setVisible(true);*/
			//this.setVisible(false);
			String va="REFERENCE STRING IS:";
			
			String va1="String length:";
			String va2="Frame size:";
			textArea.setText("");
			txtOutput.setText("PAGEFAULTS:");
				Random R=new Random();
				n=R.nextInt(10)+1;
				k=R.nextInt(4)+1;
				
				//int input[]=new int[1000];
				int i;
			
				for(i=1;i<=n;i++)
				{
					input[i]=R.nextInt(10)+1;
						 //s=R.nextInt(10)+1;
					
					va=va+" "+String.valueOf(input[i]);
					
				}
				textField.setText(va);
				va1=va1+String.valueOf(n);
				va2=va2+String.valueOf(k);
				
				textField_1.setText(va1);
				textField_2.setText(va2);
				
			
			}

			/*private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				b=false;
				frame.setVisible(false);
				
			}*/
		});
		btnNewButton.setBounds(258, 23, 147, 37);
		frame.getContentPane().add(btnNewButton);
		
		txtOutput = new JTextField();
		txtOutput.setText("PAGEFAULTS:");
		txtOutput.setBounds(472, 139, 196, 29);
		txtOutput.setBackground((new Color(204, 255, 204)));
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton btnComparison = new JButton("COMPARISON");
		 btnComparison .setBackground(new Color(204, 204, 153));
		btnComparison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int i;
				int outs[]=new int[1000];
				outs[0]=outputfi;
				outs[1]=outputlru;
				outs[2]=outputopt;
				outs[3]=outputsc;
			
				int min=outputfi;
				
				for(i=0;i<=3;i++)
				{
				if(min>=outs[i])
				{
				min=outs[i];
				}
				}
				int pos=0;
				for(i=0;i<=3;i++)
				{
					if(min==outs[i])
					{   pos=i;
						break;
					}
				}
				String va1;
				va1= "1)Pagefaults for optimal:"+String.valueOf(outputopt)+"\n"+"2)pagefaults for secondchance:"+String.valueOf(outputsc)+"\n"+"3)Pagefaults for fifo"+String.valueOf(outputfi)+"\n"+
        "4)Pagefaults for lru"+String.valueOf(outputlru);
				 if(pos==0)
				 {
					 textArea.setText(va1+"\n"+"Best one for this input is Fifo");
				 } 
				 if(pos==1)
				 {
					 textArea.setText(va1+"\n"+"Best one for this input is LRU");
					 
				 }
				 if(pos==2)
				 {
					 textArea.setText(va1+"\n"+"Best one for this input is Optimal ");
				 }
				 if(pos==3)
				 {
					 textArea.setText(va1+"\n"+"Best one for this input is SecondChance");
				 }
			
			}
		});
		btnComparison.setBounds(472, 195, 106, 29);
		frame.getContentPane().add(btnComparison);
		
		JLabel lblAlgorithms = new JLabel("ALGORITHMS");
		lblAlgorithms.setBounds(200, 194, 100, 31);
		frame.getContentPane().add(lblAlgorithms);
		
		JButton btnMainPage = new JButton("MAIN PAGE");
		btnMainPage.setBackground(new Color(153, 153, 153));
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setVisible(false);
				main2 m=new main2();
				m.setVisible(true);
				
			}
		});
		btnMainPage.setBounds(567, 23, 113, 37);
		frame.getContentPane().add(btnMainPage);
		
		JButton btnGraphs = new JButton("GRAPHS");
		btnGraphs.setBackground(new Color(204, 204, 153));
		btnGraphs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ngraph2 g=new ngraph2("PAGEFAULTS","PAGE REPLACEMENT ALGORITHM",outputfi,outputlru,outputopt,outputsc);
				
				
				
			}
		});
		btnGraphs.setBounds(591, 195, 89, 29);
		frame.getContentPane().add(btnGraphs);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
