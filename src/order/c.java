//import java.util.Random;
//import java.util.Scanner;

package order;
public class c {
    
    int find1(int n,int he,int a[])
    {
        //Random r=new Random();
        //Scanner scan=new Scanner(System.in);
        //System.out.println("Enter number of requests");
        
        int A[]=new int[n+5],sum=0,index=0,j,k,m,B[]=new int[n+5];
        A[0]=10;
        A[n+1]=580;
    	int k1,qs;
	   	for(int i=1;i<n;i++)
	   	{
	   		for(k1=1;k1<=n-i;k1++)
	   		{
	   			if(a[k1]>a[k1+1])
	   			{
	   				qs=a[k1];
	   				a[k1]=a[k1+1];
	   				a[k1+1]=qs;
	   			}
	   		}
	   	}
       
       // System.out.println("Enter array");
        for(int i=1;i<=n;i++)
        {
            A[i]=a[i];
        }
        //System.out.println("Enter header");
        int header=he;
	for(int i=0;i<=n;i++)
	{
		if(A[i]==header)
		{
			index=i;
			break;
		}
	}
        B[1]=header;
        j=index;
        k=j+1;
        System.out.println("Header is "+ header);
        int js=2;
        while(j<=n+1 && k<=n+1)
        {
            sum=sum+Math.abs(A[k]-A[j]);
            System.out.println("Header is moving towards " + A[k]);
            B[js]=A[k];
            js++;
            j++;
            k++;
        }
	/*for(j=index,k=j+1;j<=n,k<=n;j++,k++) 
	{
		sum=sum+Math.abs(A[k]-A[j]);
	}*/
        int	l=n+1;
        int q;
	int     i=0;
	sum=sum+Math.abs(A[l]-A[i]);
        System.out.println("Header is moving towards " + A[i]);
        m=0;
        q=m+1;
	while(m!=index && q!=index)
	{
		sum=sum+Math.abs(A[m]-A[q]);
                System.out.println("Header is moving towards " + A[q]);
                B[js]=A[m];
                js++;
                m++;
                q++;
	}
        System.out.println("Total Number of tracks " + sum);
        int h=index-1;
        B[js]=A[h];
        for(int y=1;y<=js;y++)
        {
            a[y]=B[y];
        }
       return sum;
}
}