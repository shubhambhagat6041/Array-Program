package Array;
import java.util.*;
public class Find_Max_min
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Values in Array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max value in Array is:"+max);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Min value in Array is:"+min);
	}
}
