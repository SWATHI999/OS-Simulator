
package order;
class fcfs1
{



	int find1(int n,int he,int a1[])
	{
	int b[]=new int[1000];
		int i,pf=0,size=he;
		for( i=1;i<=n;i++)
		{
			pf=pf+Math.abs(size-a1[i]);
			b[i]=size;
			size=a1[i];
			

		}
		for(int j=1;j<=n;j++)
		{
			a1[j]=b[j];
		}
		System.out.println("HEAD MOVEMENT: "+pf);
	return pf;
	}

}


