package order;
public class look1 {
     public int find1(int n,int he,int a[])
    {
       // Random r=new Random();
        //Scanner scan=new Scanner(System.in);
        //System.out.println("Enter number of requests");
        //int n=scan.nextInt();
        int A[]=new int[n+5],sum=0,index=0,j,k,m,B[]=new int[n+5];
        A[0]=10;
        A[n+1]=580;
        //B[n+1]=750;
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
        
        System.out.println("Enter array");
        for(int i=1;i<=n;i++)
        {
            A[i]=a[i];
        }
        System.out.println("Enter header");
        int header=he;
       // A[n+5/2]=header;
	for(int i=0;i<=n;i++)
	{
		if(A[i]==header)
		{
			index=i;
			break;
		}
	}
        B[1]=header;
        System.out.println("Header is" + header);
        j=index;
        k=j+1;
        int b=2;
        while(j<n+1 && k<n+1)
        {
            sum=sum+Math.abs(A[k]-A[j]);
            System.out.println("Header is moving towards" + A[k]);
            B[b]=A[k];
            b++;
            j++;
            k++;
        }
	/*for(j=index,k=j+1;j<=n,k<=n;j++,k++) 
	{
		sum=sum+Math.abs(A[k]-A[j]);
	}*/
        int	l=n;
               // System.out.println(A[n]);
        int q;
	int     i=index-1;
	sum=sum+A[l]-A[i];
        System.out.println("Now head is towards" + A[i]);
        m=index-1;
        q=index-2;
	while(m!=0 && q!=0)
	{
		sum=sum+Math.abs(A[m]-A[q]);
                System.out.println("Head is moving towards" + A[q]);
                B[b]=A[m];
                b++;
                m--;
                q--;
	}
        B[b]=A[1];
        System.out.println("Total Number of tracks " + sum);
        for(int y=1;y<=b;y++)
        {
           a[y]=B[y];
           
        }
return sum;
    }
}