package Array;
import java.util.*;
public class SmallestMissingElement 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the Values in Array");
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
		int min=a[0]+1;
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				if(j<min)
				{
					min=j;
					flag=true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		
			System.out.println("Smallest Missing Element is:"+min);
	}
}
