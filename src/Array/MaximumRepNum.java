package Array;
import java.util.*;
public class MaximumRepNum 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int count=1,max=0,rn=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				else
				{
					if(count>max)
					{
						max=count;
						rn=a[i];
					}
					count=1;
				}
			}
		}
		System.out.println("Max Repatative Element is:"+rn);
		System.out.println("Max Repatativ element count is:"+max);
	}
}
