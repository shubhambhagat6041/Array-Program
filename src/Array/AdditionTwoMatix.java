package Array;
import java.util.*;
public class AdditionTwoMatix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("Enter the Values in First Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		System.out.println("Enter the Values in Second array");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=xyz.nextInt();
			}
			System.out.println();
		}
		int c[][]=new int[3][3];
		System.out.println("After Addition");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println();
		}
	}
}
