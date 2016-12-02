package order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class main2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main2 window = new main2();
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
	public main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Simulator");
		frame.getContentPane().setBackground(new Color(102, 204, 153));
		frame.setBounds(100, 100, 812, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Documents\\sim2.jpg"));
		l.setBounds(214, 0, 350, 100);
		frame.getContentPane().add(l);
		
		/*JTextPane txtpnSimulator = new JTextPane();
		txtpnSimulator.setText("SIMULATOR");
		txtpnSimulator.setBounds(332, 44, 101, 27);
		frame.getContentPane().add(txtpnSimulator);*/
		
		JLabel lblVasavi = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Documents\\sched1.jpg"));
		//JLabel l=new JLabel();
		lblVasavi.setBounds(149, 143, 240, 100);
		//frame.getContentPane().add(l);
		lblVasavi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				frame.setVisible(false);
				scheduling s=new scheduling();
				s.setVisible(true);
			
			
			}
		});
		///lblVasavi.setBounds(52, 181, 46, 14);
		frame.getContentPane().add(lblVasavi);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Documents\\page2.jpg "));
		lblNewLabel.setBounds(399, 143, 240, 100);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				frame.setVisible(false);
				pagefault s=new pagefault();
				s.setVisible(true);
			
			
			}
		});
		
		
		
		
		
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel1 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Documents\\disk.jpg "));
		lblNewLabel1.setBackground(new Color(153, 153, 255));
		lblNewLabel1.setBounds(149, 254, 240, 100);
		lblNewLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				frame.setVisible(false);
				disk s=new disk();
				s.setVisible(true);
			
			
			}
		});
		
		
		
		
		
		frame.getContentPane().add(lblNewLabel1);
		JLabel lblNewLabel2 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Documents\\dining.gif "));
		lblNewLabel2.setBounds(399, 254, 240, 100);
		lblNewLabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				frame.setVisible(false);
				DiningPhilosophers s=new DiningPhilosophers();
				s.setVisible(true);
			
			
			}
		});
		
		
		
		
		
		frame.getContentPane().add(lblNewLabel2);
		
		
		/*JLabel label = new JLabel("PageReplacement");
		label.setBounds(397, 214, 400, 100);
		frame.getContentPane().add(label);*/
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
	frame.setVisible(b);	
	}
}
