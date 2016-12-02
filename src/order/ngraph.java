package order;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
/**
 * This demonstration shows a 3D bar chart with item labels displayed.
 *
 */
public class ngraph extends ApplicationFrame {
  float j1,j2,j3,j4,j5,j6;
    public ngraph(final String title,String chartTitle,float k1,float k2,float k3,float k4,float k5,float k6) {
        super(title);
        j1=k1;
        j2=k2;
        j3=k3;
        j4=k4;
        j5=k5;
        j6=k6;
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }
    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
      
   private CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(j1, "Algorithms", "fcfs");   
        dataset.addValue(j2, "Algorithms", "sjf_nonpreemptive");   
        dataset.addValue(j3, "Algorithms", "priority_preemptive");   
        dataset.addValue(j4, "Algorithms", "priority_nonpreemptive");   
        dataset.addValue(j5, "Algorithms", "sjf_preemptive");   
        dataset.addValue(j6, "Algorithms", "roundrobin");   
        return dataset;
    }
    
   
    private JFreeChart createChart(final CategoryDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createBarChart3D(
            "SCHEDULING ALGORITHMS",      // chart title
            "Algorithms",               // domain axis label
            "Averagewaitingtime",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );this.pack();        
      	RefineryUtilities.centerFrameOnScreen( this );        
      	this.setVisible( true ); 
        final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0)
        );
        
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        final BarRenderer r = (BarRenderer) renderer;
        r.setMaximumBarWidth(0.05);
        
        return chart;
    }
    
    
}
