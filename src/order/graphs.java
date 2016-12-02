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

public class graphs extends ApplicationFrame
{   float j1,j2,j3,j4,j5,j6;
   public graphs( String applicationTitle , String chartTitle,float k1,float k2,float k3,float k4,float k5,float k6 )
   { super( applicationTitle ); 
	   j1=k1;
		j2=k2;
		j3=k3;
		j4=k4;
		j5=k5;
		j6=k6;
     // super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         " Algorithms",            
         "AverageWaitingTime",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
      	this.pack();        
      	RefineryUtilities.centerFrameOnScreen( this );        
      	this.setVisible( true ); 
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 200, 200 ) );        
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
      final String fcfs = "fcfs";        
      final String sjf = "sjf";        
      final String pre_sjf = "pre_sjf";        
      final String pre_priority = "pre_priority";        
      final String non_priority = "non_priority";        
      final String roundrobin = "roundrobin";        
             
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( j1 , fcfs , fcfs );        
      dataset.addValue( j2 ,  sjf ,sjf );        
      dataset.addValue( j3 ,  pre_sjf, pre_sjf ); 
      dataset.addValue( j4 ,  pre_priority, pre_priority );
      dataset.addValue(  j5,non_priority, non_priority);
      dataset.addValue(  j6, roundrobin , roundrobin);

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