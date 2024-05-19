package Array;
import java.util.*;
public class Missing_ElementInArray 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter values in array");
		int a[]=new int[5];//2 5 8 10 12
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])  //Ascending logic
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Missing Values Are:");
		for(int i=0;i<a.length-1;i++)//2 5 8 10 12
		{
			for(int j=a[i]+1;j<a[i+1];j++)//
			{
				System.out.println(j);//3//4//6//7//9/11
			}
		}
	}
}
