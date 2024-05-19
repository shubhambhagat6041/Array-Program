package Array;
import java.util.*;
public class Pair_withGivenSum 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the Sum");
		int sum=xyz.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(i+"\t"+j);
				}
			}
		}
	}
}
