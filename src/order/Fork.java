package order;

	import java.util.concurrent.locks.ReentrantLock;
	//import javax.swing.JLabel;
	public class Fork extends ReentrantLock{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -2140685402427875673L;
		int id;
		public Fork(int id) {
			super();
			this.id = id;
		}
		public synchronized void pickUp(){
			this.lock();	
		}
		public synchronized void putDown(){
					this.unlock();
				}	
	}


