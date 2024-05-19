package Array;
import java.util.*;
public class Majority_Element
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the values in array");
		int a[]=new int[8];
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
		int count=1,me=0;
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				if(count>a.length/2)
				{
					me=a[i];
					flag=true;
					break;
				}
				count=1;
			}
		}
		if(flag)
		{
			System.out.println("Majority Element Found:"+me);
		}
		else
		{
			System.out.println("Not Found Majority Element");
		}
	}
}
