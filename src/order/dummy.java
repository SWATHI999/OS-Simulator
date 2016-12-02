package order;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class dummy  {

	
	/**
	 * 
	 */
	
	private JFrame frame;
	
	//JPanel panel = new JPanel();
	/**JPanel panel = new JPanel();
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dummy window = new dummy();
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
	public dummy() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 865, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		
		frame.getContentPane().add(new vas());
		//frame.getContentPane().setLayout(null);
		//frame.getContentPane().setLayout(null);
		
		/*JButton btnVasavi = new JButton("vasavi");
		btnVasavi.setBounds(0, 399, 849, 23);
		frame.getContentPane().add(btnVasavi);*/
	
	}
	public class vas extends JPanel
	{
		
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g)
	    { 
	    	super.paintComponent(g);
	        Graphics2D g2 = (Graphics2D)g;
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                            RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.draw(new Line2D.Double(120,130,160,150));	
	      //panel.add(g2);
	        JLabel k=new JLabel();
	  k.setBounds(100,100,50,50);
	  k.setText("vasavi");
	  k.setVisible(true);
	    this.add(k);
	 //   this.removeAll();
	    }
	}
}
