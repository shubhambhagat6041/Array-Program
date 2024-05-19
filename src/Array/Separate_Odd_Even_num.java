package Array;
import java.util.*;
public class Separate_Odd_Even_num 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[9];
		int even=0,odd=0;
		System.out.println("Enter the Values in Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;//store even array length
			}
			else
			{
				odd++;
			}
		}
		int b[]=new int[even];
		int c[]=new int[odd];
		int j=0,k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[j++]=a[i];
			}
			else
			{
				c[k++]=a[i];
			}
		}
		System.out.println("Even Array:");
		for(j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		System.out.println("Odd Array");
		for(k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}
	}
}
