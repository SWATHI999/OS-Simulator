package order;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class check {

	private JFrame frame;

	
	int n1, he1, a1[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					check window = new check();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//private JTextField text1;
	/**
	 * Create the application.
	 */
	public check() {
	
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 628, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				disk l=new disk();
				l.setVisible(true);
						
			}
		});
		btnBack.setBounds(515, 287, 89, 30);
		frame.getContentPane().add(btnBack);
	/*	text1 =new JTextField();
		text1.setBounds(400,287,89,30);
		text1.setText("no:");
		frame.getContentPane().add(text1);*/
		//text1.setText("no:");
		
		//	frame.getContentPane().setLayout(null);
	//	 frame.getContentPane().add(new ArrowPanel());	
		// frame.getContentPane().setLayout(null);
	}
	void add1(int a[],int n,int he,int m,int h)
	{ System.out.println("in check"+a[1]);
		int i;
		
		n1=n;
		
		int a1[]=new int[n+1]; 
		for(i=1;i<=n1;i++)
		{
			a1[i]=a[i];
		}	
		//frame.setVisible(false);

		ArrowPanel s=new ArrowPanel();
	//	Graphics g=frame.getGraphics();
		
		s.add2( a1,n1,he,m,h);
		
		frame.getContentPane().add(s);	
		
		//s.add2( n1,he1,a1);
		//s.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
