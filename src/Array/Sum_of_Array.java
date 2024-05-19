package Array;
import java.util.*;
public class Sum_of_Array
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Values in Array");
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array is:"+sum);
	}
}
