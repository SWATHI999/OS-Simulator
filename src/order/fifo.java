package order;
import java.util.*;
public class fifo {
int output(int p,int f,int a[])
{
	//Scanner s=new Scanner(System.in);
	//System.out.println("Enter Number of pages:");
	//int p=s.nextInt();
	//System.out.println("Enter Frame size:");
	//int f=s.nextInt();
	int i;
	int k=0;
	//int a[]=new int[p+1];
	Queue<Integer> q=new LinkedList<Integer>();

	int count=0,hit=0;
	//System.out.println("Enter pages:-");
	//for (i=1;i<=p;i++)
	//{
		//a[i]=s.nextInt();

		//System.out.println(a[i]+"hwbwbj");
	//}
	i=1;

	for(int j=1;j<=f;j++)
	{
		k=search(q,a[i]);
		//System.out.println(k+"hhfh");
		if(k!=1 && i<=p)
		{
			q.add(a[i]);
			count=count+1;
		}
		if(k==1)
			hit=hit+1;
		i++;
	}
	while(i<=p)
	{
		k=search(q,a[i]);
		//System.out.println(q+"f");
		//System.out.println(k+"hgdu");
		if(k!=1 && i<=p)
		{
			q.remove();
			q.add(a[i]);
			count=count+1;
		}
		if(k==1)
			hit=hit+1;
		i++;
	}



//System.out.println(q);
System.out.println("pagefaults="+count);
System.out.println("hits="+hit);
return count;
}



public static  int search(Queue<Integer> q,int l)
{
int flag=0;
//Queue q2=new LinkedList();
Queue<Integer> q2=new LinkedList<Integer>();

while(q.size()>=1)
{
	int u;
	u=(int)q.element();
		q2.add(q.element());
		if(u==l)
			flag=1;
		q.remove();
	}


while(q2.size()>=1)
{
	q.add(q2.peek());
	q2.remove();
}
if(flag==1)
	return 1;

return 0;
	
}
}
