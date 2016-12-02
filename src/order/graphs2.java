package order;
//Display a bar graph representing the number of A's, B's, C's, D's
// and F's on the Java Programming Final Exam
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class graphs2 extends ApplicationFrame
{   float j1,j2,j3,j4;
   public graphs2( String applicationTitle , String chartTitle,float k1,float k2,float k3,float k4 )
   { super( applicationTitle ); 
	   j1=k1;
		j2=k2;
		j3=k3;
		j4=k4;
		
     // super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         " Algorithms",            
         "PageFaults",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
      	this.pack();        
      	RefineryUtilities.centerFrameOnScreen( this );        
      	this.setVisible( true ); 
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 400, 400 ) );        
      setContentPane( chartPanel ); 
   
  
   
   
   }
 /* public void values(float k1,float k2,float k3,float k4,float k5,float k6)
   {
	j1=k1;
	j2=k2;
	j3=k3;
	j4=k4;
	j5=k5;
	j6=k6;
   }*/
   private CategoryDataset createDataset( )
   {
      final String FIFO = "FIFO";        
      final String LRU = "LRU";        
      final String OPTIMAL = " OPTIMAL";        
      final String SECONDCHANCE = "SECONDCHANCE";        
          
             
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( j1 , FIFO , FIFO );        
      dataset.addValue( j2 ,  LRU ,LRU );        
      dataset.addValue( j3 ,  OPTIMAL, OPTIMAL ); 
      dataset.addValue( j4 ,  SECONDCHANCE, SECONDCHANCE );
     
      /*dataset.addValue( 5.0 , audi , speed );       
      dataset.addValue( 6.0 , audi , userrating );       
      dataset.addValue( 10.0 , audi , millage );        
      dataset.addValue( 4.0 , audi , safety );

      dataset.addValue( 4.0 , ford , speed );        
      dataset.addValue( 2.0 , ford , userrating );        
      dataset.addValue( 3.0 , ford , millage );        
      dataset.addValue( 6.0 , ford , safety );*/               

      return dataset; 
   }
 
}