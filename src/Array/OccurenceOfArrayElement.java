package Array;
import java.util.*;
public class OccurenceOfArrayElement 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter Values in array");
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
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(i<(a.length)-1)
			{
				if(a[i]==a[i+1])
				{
					count++;
				}
				else
				{
					System.out.println(a[i]+"===>"+count);
					count=1;
				}
			}
			if(i==(a.length)-1)
			{
				System.out.println(a[i]+"===>"+count);
			}
		}
		
	}
}
