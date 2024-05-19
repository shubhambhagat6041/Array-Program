package Array;
import java.util.*;
public class Array_Ascending_Order 
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
		System.out.println("After Ascending Oeder");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
