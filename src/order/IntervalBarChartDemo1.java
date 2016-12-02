package order;

//package org.jfree.chart.demo;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.ui.TextAnchor;
import java.util.*;
/**
 * An interval bar chart.
 *
 * @author Jeremy Bowman
 */
public class IntervalBarChartDemo1 {

    /** The categories. */
    String[] CATEGORIES =new String[5];

    /** The label font. */
    private static Font labelFont = null;

    /** The title font. */
    private static Font titleFont = null;

    /** The chart. */
    private JFreeChart chart = null;

    static {
        labelFont = new Font("Helvetica", Font.PLAIN, 10);
        titleFont = new Font("Helvetica", Font.BOLD, 14);
    }

    /**
     * Creates a new demo.
     */
    double[][] lows = new double[1][];
    double[][] highs = new double[1][];

    public void Demo1(double A1[][],double c1[][],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		lows[0][i]=A1[0][i];
    		highs[0][i]=c1[0][i];
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(lows[0][i]);
    		System.out.println();
    		System.out.print(highs[0][i]);
    	}
    	
    	
    }
    public IntervalBarChartDemo1() {
        /*double key,k,mini=0,sum=0,min1=0,fb=0,fi=0,fm=0,min11;
        int x=5,min_index=0,m1=0,j;
        double min=100.0;
        double A[]=new double[x];double B[]=new double[x];
        double c[]=new double[x];
        double cl[]=new double[x];
        for(int i=0;i<x;i++)
        {cl[i]=0;}*/
           /* A[0]=1;
            A[1]=2;
            A[2]=3;
            A[3]=4;
            A[4]=8;
            B[0]=3;
            B[1]=1;
            B[2]=2;
            B[3]=4;
            B[4]=3;*/
            
        
            	            	 //System.out.println("in interval");
             
       /* for(int i=0;i<x;i++)
        {
                if(A[i]<=min)
                {
                    min=A[i];
                    m1=i;
                   String h=Integer.toString(i);
                   if(h!=null)
                    CATEGORIES[i]=h;
                    lows[0][0]=A[0];
                   
                }
        }
        c[m1]=A[m1]+B[m1];
        cl[m1]=1;
        highs[0][0]=c[m1];
        lows[0][1]=c[m1];
        min=100;
        int o=1;
        for(k=0;k<x-1;k++)
        {
            for(j=0;j<x;j++)
            {
               
                if(A[j]<=min&&cl[j]!=1)
                {
                    min=A[j];
                    min_index=j;
                    //min1=B[min_index];
                    
                    
                   String w=Integer.toString(j);
                   if(w!=null)
                   CATEGORIES[o]=w;
                   o++;
                }
            }
            if(c[m1]>A[min_index])
            {
              c[min_index]=c[m1]+B[min_index];
              highs[0][min_index]=c[min_index];
              if(min_index!=x-1)
              lows[0][min_index+1]=c[min_index];
            }
            else if(c[m1]<A[min_index])
            {
                c[min_index]=A[min_index]+B[min_index];
                highs[0][min_index]=c[min_index];
                if(min_index!=x-1)
                lows[0][min_index+1]=c[min_index];
            }
            else       
            {
                c[min_index]=A[min_index]+B[min_index];
                highs[0][min_index]=c[min_index];
                if(min_index!=x-1)
                lows[0][min_index+1]=c[min_index];
            }
            cl[min_index]=1;
            min=100;
            m1=min_index;
        } System.out.println("Completion times");
        System.out.println(c);
        for(int i=0;i<5;i++)
        {
        	//if(CATEGORIES[i]!=null)
        	System.out.print(CATEGORIES[i]);
        }
        System.out.println();

        try{for(int v=0;v<x;v++)
            {
                System.out.println(c[v]);
            }
        }catch(ArrayIndexOutOfBoundsException e){}
        for(int i=0;i<x;i++)
        System.out.print(lows[0][i]);
        System.out.println(
       for(int i=0;i<x;i++)
        System.out.print(highs[0][i]);
       System.out.println(x);*/
        DefaultIntervalCategoryDataset data = null;
        
        data = new DefaultIntervalCategoryDataset(lows, highs);
       // data.setCategoryKeys(CATEGORIES);
        System.out.println("gcdshfg");

        String title = "FCFS";
        String yTitle = "Completion times (ms)";
        String xTitle = "Processes";
        CategoryAxis xAxis = new CategoryAxis(xTitle);
        xAxis.setLabelFont(titleFont);
        xAxis.setTickLabelFont(labelFont);
        xAxis.setTickMarksVisible(false);
        NumberAxis yAxis = new NumberAxis(yTitle);
        yAxis.setLabelFont(titleFont);
        yAxis.setTickLabelFont(labelFont);
        yAxis.setRange(1,15);
       // final DecimalFormat formatter = new DecimalFormat("1");
        yAxis.setTickUnit(new NumberTickUnit(1));

        IntervalBarRenderer renderer = new IntervalBarRenderer();
        renderer.setSeriesPaint(0, new Color(51, 102, 153));
//        renderer.setLabelGenerator(new IntervalCategoryLabelGenerator());
        renderer.setItemLabelsVisible(true);
        renderer.setItemLabelPaint(Color.white);
        ItemLabelPosition p = new ItemLabelPosition(
            ItemLabelAnchor.CENTER, TextAnchor.CENTER
        );
        renderer.setPositiveItemLabelPosition(p);
       
         CategoryPlot plot = new CategoryPlot(data, xAxis, yAxis, renderer);
        plot.setBackgroundPaint(Color.lightGray);
        plot.setOutlinePaint(Color.white);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
       
        this.chart = new JFreeChart(title, titleFont, plot, false);
        this.chart.setBackgroundPaint(Color.white);
    }

    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    *
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
   
    /**
     * Returns the chart.
     *
     * @return the chart.
     */
    public JFreeChart getChart() {
        return this.chart;
    }
    	
    /**
     * Starting point for the demo.
     *
     * @param args  ignored.
     */
    public static void main(final String[] args) {
        IntervalBarChartDemo1 sample = new IntervalBarChartDemo1();
        JFreeChart chart = sample.getChart();
         ChartFrame frame = new ChartFrame("CPU SCHEDULING ALGORITHMS", chart);
        frame.pack();
        frame.setVisible(true);
    }
}