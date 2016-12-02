package order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class vas {

	private JFrame frame;
	private JTextField txtVasavi;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vas window = new vas();
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
	public vas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 827, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtVasavi = new JTextField();
		txtVasavi.setBounds(288, 11, 171, 136);
		txtVasavi.setText("vasavi");
		frame.getContentPane().add(txtVasavi);
		txtVasavi.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(39, 183, 741, 136);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
	/*	textField_1 = new JTextField();
		textField_1.setBounds(133, 168, 574, 179);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);*/
		
	/*	textField = new JTextField();
		textField.setBounds(132, 188, 560, 144);
		frame.getContentPane().add(textField);
		textField.setColumns(10);*/
		int i,k=10;
		for(i=1;i<=2;i++)
		{
		JLabel l=new JLabel();
		l.setBounds(150+(i*k),250,15,15);
		l.setText("v");
		frame.getContentPane().add(l);
	//.add(l);
		l.setVisible(true);
		}
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	
	}
}
