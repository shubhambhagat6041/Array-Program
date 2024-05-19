package Array;
import java.util.*;
public class ReverseArray 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Values in Array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int mid=a.length/2;
		int end=a.length-1;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		System.out.println("After Reverse Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
