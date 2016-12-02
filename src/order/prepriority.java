package order;
class Prepriority {
	
	 int bt,at,copy,pri,pid,tat,wt;
	
	 float find1(int arrti[],int burti[],int priority[],int n)
	{
	


	
		int sum=0;

	
		Prepriority p[]=new Prepriority[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Prepriority();
			p[i].pid=i;
			p[i].at=arrti[i+1];
			p[i].bt=burti[i+1];
			sum=sum+p[i].bt;
			p[i].pri=priority[i+1];
			p[i].copy=p[i].bt;
		}





		for(int i=0; i<n-1;i++){ 

			for(int j=0; j<n-i-1;j++) { 

				if(p[j].at > p[j+1].at) {
					Prepriority k;
					k = p[j];
					p[j] = p[j+1];
					p[j+1] = k;


				}
			}
		}


		for(int t=1;t<=sum;t++)
		{
			int min=9999,index=0;    
			for(int j=0;j<n;j++)
			{
				if(p[j].at<t && p[j].pri<min && p[j].bt>0)
				{
					min=p[j].pri;
					index=j;

				}

			}
			p[index].bt-=1;
			if(p[index].bt==0)
			{

				p[index].tat=t-p[index].at;
				p[index].wt=p[index].tat-p[index].copy;
			}

		}
		int tot_turn=0,tot_wait=0;   
		for(int i=0;i<n;i++)
		{

			tot_turn+=p[i].tat;
			tot_wait+=p[i].wt;

		}
		float avg_turn=(float)tot_turn/n;
		float avg_wait=(float)tot_wait/n;
		for(int m=0;m<n;m++)
		{
			System.out.println("\nprocess "+p[m].pid);
			System.out.print("turn around time : "+p[m].tat);
			System.out.print("     waiting time : "+p[m].wt);
		}
		System.out.println("\ntotal turn around time : "+tot_turn);
		System.out.println("total waiting time : "+tot_wait);    
		System.out.println("avg turn around time : "+avg_turn);
		System.out.println("avg waiting time : "+avg_wait);
		return avg_wait;
	}

}