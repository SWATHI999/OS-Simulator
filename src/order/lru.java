package order;
class RU
{

	int[] frame,page,present;
	int size,pages,pf=0,flag=0,flag1=0;
	RU(int size,int pages,int a[])
	{
		this.size=size;
		this.pages=pages;
		frame=new int[size+1];
		present=new int[size+1];
		page=new int[pages+1];
		for(int i=0;i<pages;i++)
			page[i]=a[i+1];
		for(int i=0;i<size;i++)
			frame[i]=-1;
	}
	int check(int x)
	{
		flag=-1;
		for(int i=0;i<size;i++)
			if(frame[i]==x)
			{
				flag=i;
				break;
			}
		return flag;
	}
	int replace(int x)
	{
		int i;
		for(i=0;i<size;i++)
			present[i]=0;
		flag1=0;
		for(i=x-1;i>=0;i--)
		{
			if(check(page[i])>=0)
			{
				flag1++;
				present[check(page[i])]=1;
			}
			if(flag1==(size-1)) 
				break;
		}
		for(i=0;i<size;i++)
			if(present[i]==0)
			{
				flag1=i;
				break;
			}
		return i;
	}

	int klru()
	{
		for(int i=0;i<pages;i++)
		{
				if(check(page[i])==-1)
				{
					int r=replace(i);
					frame[r]=page[i];
					pf++;
				}
		
		}
		return pf;
	}
}
class lru
{



	int output(int n,int f,int input[])
	{
	//	Scanner s=new Scanner(System.in);
		//System.out.print("Enter frame size:");
		
		
	
		RU obj=new RU(f,n,input);

	int k=obj.klru();
	return k;
	}
}



