package order;
import java.util.*;
class sstf1{
public class elements{
int index;
int value;
}
public  int find1(int n,int he,int z[])
{
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter number of locations");
int a=n;
int b[]=new int[a+1];
elements d[]=new elements[a+1];
elements e[]=new elements[a+1];
int i,k,q,j,sum=0,sum1=0,s;
int p[]=new int[a+1];
System.out.println("Enter elements of disk queue");
for(i=1;i<=a;i++)
{
d[i]=new elements();
d[i].index=i;
d[i].value=z[i];
}
System.out.println("Enter head pointer location");
int h=he;
for(j=1;j<=a;j++)
{
for(i=j;i<=a;i++)
{
e[i]=new elements();
e[i].index=i;
e[i].value=Math.abs(h-d[i].value);
}
for(i=1;i<=a;i++)
{
//System.out.print(e[i].value+" ");
}
//System.out.println();
// sorting
s=a;
for(k=1;k<=s;k++)
{
for(q=j;q<=a-k;q++)
{
if(e[q].value>e[q+1].value)
{
elements o;
o=e[q+1];
e[q+1]=e[q];
e[q]=o;
}
}
}
s--;
for(i=1;i<=a;i++)
{
//System.out.print(e[i].value+"dhf"+" ");
}
//System.out.println();
elements temp;
h=d[e[j].index].value;
temp=d[e[j].index];
d[e[j].index]=d[j];
d[j]=temp;
p[j]=d[j].value;
sum=sum+e[j].value;
}
System.out.println("Cylinders:="+sum);
for(i=1;i<=a;i++)
{
z[i]=p[i];	
	//System.out.print("("+p[i]+","+p[i+1]+")"+" ");
}
return sum;
}
}
