package order;
public class secondchance1{
	 int older(int check[],int checksize,int frame[],int framesize,int reference[])
	{int i,j;int order1[],visited[];
		order1 =new int[framesize+1];
		visited=new int[framesize+1];
		int c=1;
		
		for(c=1;c<=framesize;c++)
		{
			order1[c]=0;
			visited[c]=0;
		}
		int s=0;
		for(i=checksize;i>=1;i--)
		{
			for(j=1;j<=framesize;j++)
			{
				if(check[i]==frame[j])
				{
					if(visited[j]==0)
					{	s=s+1;
						order1[j]=s;
						visited[j]=1;
						break;
					}
					
				}
			}
			
		}
		for(i=1;i<=framesize;i++)
		{
			visited[i]=0;
		}int max,pos=0;
		while(true)
		{max=0;
			for(i=1;i<=framesize;i++)
			{	if(visited[i]==0)
				{
					if(max<order1[i])
					{
						max=order1[i];
						pos=i;
					}
				}
			}
			if(reference[pos]!=1)
			{
				return pos;
				
			}
			else
			{
				visited[pos]=1;
				reference[pos]=0;
			}
			
			
			
		}
	}
	
	 int output(int n,int k,int a[])
	{ //System.out.println(input[1]);
		int frame[];int i;
		frame=new int[k+1];
		for(i=1;i<=k;i++)
		{
			frame[i]=-1;
		}
		int check[];
		check=new int[1000];
		int reference[];
		reference=new int[k+1];
		for(i=1;i<=k;i++)
		{
			reference[i]=-1;
		}
		int m=1;int j,f,pos=0;int vas=0;
		for(i=1;i<=n;i++)
		{
			f=0;
			for(j=1;j<=k;j++)
			{
				if(frame[j]==a[i])
				{
					
					//frame[j]=a[i];
					//check[m]=a[i];
					reference[j]=1;
					f=1;
						
					break;
				}
			}
			if(f==0)
			{
				for(j=1;j<=k;j++)
				{
					if(frame[j]==-1)
					{
						frame[j]=a[i];
						check[m]=a[i];
						m++;
						reference[j]=0;
						break;
					}
				}
				
			}
			int c=1,count=0;
			for(c=1;c<=k;c++)
			{
				if(frame[k]!=-1)
				{
					count++;
				}
			}
			if(count==k)
			{	vas=1;
				pos=i;
				break;
			}
		}
		if(vas==0)
		{
			pos=n;
		}
		int l;
		if(pos==n)
		{//System.out.println("vas");
			System.out.println(m-1);
		}
		if(pos!=n)
		{
			for(l=pos+1;l<=n;l++)
			{f=0;
				for(i=1;i<=k;i++)
				{
					if(frame[i]==a[l])
					{
						reference[i]=1;
						f=1;
						break;
					}
				}
				if(f==0)
				{
					
					int r=older(check,m-1,frame,k,reference);
					//System.out.println(r);
					check[m]=a[l];
					frame[r]=a[l];
					m++;
					reference[r]=0;
					
				}
	
		System.out.println(m-1);
	
		}
	
	}
		int sa;
		sa=m-1;
		return sa;
		
	}
}
		
	
