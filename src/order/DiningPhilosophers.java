package order;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DiningPhilosophers {
	private JFrame frame;	
	static final int NUM_PHILOSOPHERS = 5;
	Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];
	static Semaphore permissions = new Semaphore(2);
	static boolean [] philIsEating = {false, false, false, false, false};
	JLabel[] PhilsLables = new JLabel[5];
	JLabel[] comments = new JLabel[5];
	private JLabel lblNewLabel_0;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiningPhilosophers window = new DiningPhilosophers();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public DiningPhilosophers() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame("DiningPhilosophers");
		frame.setBounds(0, 0,688, 546);
		frame.getContentPane().setBackground(new Color(102, 204, 153));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button start = new Button("Start");
		start.setBackground(new Color(204, 255, 204));
		start.setBounds(336,465 , 77, 32);
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				start();
				}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(start);
		lblNewLabel_0 = new JLabel("Philosopher0");
		lblNewLabel_0.setBounds(291, 31, 169, 14);
		frame.getContentPane().add(lblNewLabel_0);
		
		lblNewLabel_1 = new JLabel("Philosopher1");
		lblNewLabel_1.setBounds(493, 118, 169, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Philosopher2");
		lblNewLabel_2.setBounds(475,305, 169, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Philosopher3");
		lblNewLabel_3.setBounds(136, 317, 169, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Philosopher4");
		lblNewLabel_4.setBounds(115, 143, 169, 14);
		frame.getContentPane().add(lblNewLabel_4);
		comments[0] = lblNewLabel_0;
		comments[1] = lblNewLabel_1;
		comments[2] = lblNewLabel_2;
		comments[3] = lblNewLabel_3;
		comments[4] = lblNewLabel_4;
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_1.setBounds(301, 49, 79, 71);
		frame.getContentPane().add(lblNewLabel_1);	
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_2.setBounds(136, 179, 71, 71);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_3.setBounds(213, 346, 71, 75);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_4.setBounds(475, 346, 79, 75);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\person1.png"));
		lblNewLabel_6.setBounds(519, 165, 71, 71);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Plate-icon.png"));
		lblNewLabel.setBounds(272, 150, 79, 44);
		
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Plate-icon.png"));
		lblNewLabel_5.setBounds(361, 165, 79, 44);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Plate-icon.png"));
		lblNewLabel_7.setBounds(245, 242, 79, 44);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Plate-icon.png"));
		lblNewLabel_8.setBounds(381, 242, 79, 44);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Plate-icon.png"));
		lblNewLabel_9.setBounds(319, 272, 79, 44);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\bowl1.png"));
		lblNewLabel_10.setBounds(319, 205, 71, 56);
		frame.getContentPane().add(lblNewLabel_10);
		JLabel l=new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon1.png"));
		l.setBounds(245, 192, 79, 44);
		frame.getContentPane().add(l);
		JLabel l1=new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon6.png"));
		l1.setBounds(272, 275, 79, 44);
		frame.getContentPane().add(l1);
		JLabel l2=new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon7.png"));
		l2.setBounds(361, 272, 79, 44);
		frame.getContentPane().add(l2);
		JLabel l3=new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon2.png"));
		l3.setBounds(381, 206, 79, 44);
		frame.getContentPane().add(l3);
		JLabel l4=new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\spoon5.png"));
		l4.setBounds(319, 143, 79, 44);
		frame.getContentPane().add(l4);
		
		JLabel lblNewLabel_11 = new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\diningtable.jpg"));
		lblNewLabel_11.setBounds(241, 130, 217, 205);
		frame.getContentPane().add(lblNewLabel_11);
		
		JButton btnMainPage = new JButton("MAIN PAGE");
		btnMainPage.setBackground(new Color(204, 255, 204));
		btnMainPage.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
				frame.setVisible(false);
			main2 k=new main2();
			k.setVisible(true);
					
			
			
			}
			
			
		});
		btnMainPage.setBounds(536, 465, 108, 32);
		frame.getContentPane().add(btnMainPage);
		
		/*JLabel l=new JLabel(new ImageIcon("C:\\Users\\vasav\\OneDrive\\Pictures\\Plate-icon.png"));
		l.setBounds(381, 242, 79, 44);
		frame.getContentPane().add(l);*/
		
		
		
	}
	
	public void start() {		
		
		Fork[] forks = new Fork[NUM_PHILOSOPHERS];
		for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
			forks[i] = new Fork(i);
		}
		for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
			philosophers[i] = new Philosopher(i, forks[(i + 1) % NUM_PHILOSOPHERS], forks[i], comments[i]);
			new Thread(philosophers[i]).start();
		}
	}
	public synchronized static boolean leftNeighbourPhilosopher(int id) {
		return DiningPhilosophers.philIsEating[(id + 1)
				% DiningPhilosophers.NUM_PHILOSOPHERS]; 
	}
	public synchronized static boolean rightNeighbourPhilosopher(int id) {

		if (id == 0)
			return DiningPhilosophers.philIsEating[4]; 
		else
			return DiningPhilosophers.philIsEating[(id - 1)
					% DiningPhilosophers.NUM_PHILOSOPHERS]; 
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
		// TODO Auto-generated method stub
		
	}
}