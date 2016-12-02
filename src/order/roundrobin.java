package order;
class roundrobin
{	   int art,bursttime,waittime,pr,dupbursttime,timequantum,turnaroundtime;
	  float find(int arrti[], int burti[], int priority[], int tim, int n)
	{
		
		int sum=0,i,j,su=0,av,k;
	//	Scanner S=new Scanner(System.in);
		roundrobin p[]=new roundrobin[n+1];
		
		System.out.println("Burst times: "+'\t'+"Arrivaltime");
		for ( k=1;k<=n;k++)
		{
			p[k]=new roundrobin();
			p[k].bursttime=burti[k-1];
			p[k].art=arrti[k-1];
			p[k].pr=k;
			p[k].timequantum=tim;
			sum=sum+p[k].bursttime;
			p[k].dupbursttime=p[k].bursttime;
			System.out.println(p[k].bursttime+"		"+p[k].art);
			
		}
		int inct=0;
		//sort(p);
		for(k=1;k<n;k++)
		{
		for( int q=1;q<=n-k;q++)
		{
			if(p[q].art>p[q+1].art)
			{
			roundrobin o;
			o=p[q+1];
			p[q+1]=p[q];
			p[q]=o;
			}
		}
		}
		while(inct<sum)
		{
			for(k=1;k<=n;k++)
			{
			if(p[k].bursttime>p[k].timequantum)
			{
				p[k].bursttime=p[k].bursttime-p[k].timequantum;
				inct=inct+p[k].timequantum;
			}
			else
			{
				p[k].bursttime=0;
				inct=inct+p[k].timequantum;
				p[k].turnaroundtime=inct-p[k].art;
				p[k].waittime=p[k].turnaroundtime-p[k].dupbursttime;
			}
			}
		
		}
		for( k=1;k<=n;k++)
		{
			su=su+p[k].waittime;
		
		}
		float y;
		y=su/n;
		System.out.println("Average waiting time is:"+y);
		return y;
		}
}