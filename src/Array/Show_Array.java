package Array;
import java.util.*;
public class Show_Array 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the Values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Show Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
