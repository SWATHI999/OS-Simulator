package order;
import java.util.*;
public class scan1 {
	int B[],js;
   int find1(int n,int he,int a[])
   {
     //   Random r=new Random();
        //Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of requests");
      //  int n=scan.nextInt();
        int A[]=new int[n+5],sum=0,index=0,j,k,m,B[]=new int[n+5];
        A[0]=10;
        A[n+1]=580;
        B[n+1]=580;
        System.out.println("Enter an array");
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
        
        for(int i=1;i<=n;i++)
        {
            A[i]=a[i];
        }
        System.out.println("Enter header");
        int header=he;
       // A[5]=header;
	for(int i=0;i<=n;i++)
	{
		if(A[i]==header)
		{
			index=i;
			break;
		}
	}
        j=index;
        k=j+1;
        System.out.println("Head is "+ header);
        A[index]=header;
        B[1]=header;
        int js=2;
        while(j<=n+1 && k<=n+1)
        {
            System.out.println(A[k]);
            B[js]=A[k];
            js++;
            sum=sum+Math.abs(A[k]-A[j]);
            j++;
            k++;
        }
        int	r=n+1;
        int q,qw=0;
        int w=index-1;
        if((A[r]-A[w])<0)
        {
        	qw=-(A[r]-A[w]);
        }
        sum=sum+qw;
        //B[js]=A[l];
        //js++;
        //System.out.println("Now head is pointing towards "+ A[i]);
        m=index-1;
        q=index-2;
	while(m!=0 && q!=0)
	{
		sum=sum+Math.abs(A[m]-A[q]);
                B[js]=A[m];
                //System.out.println("Head is pointing towards "+ A[q]);
                m--;
                q--;
                js++;
        }
        System.out.println("Total Number of tracks " + sum);
        B[js]=A[1];
        for(int y=1;y<=js;y++)
        {
            a[y]=B[y];
        }
        System.out.println("in scan1"+sum);
        return sum;
     }
  /* int getnumb()
   {
   return js;
   }*/
   
   }