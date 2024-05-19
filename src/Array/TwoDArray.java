package Array;
import java.util.*;
public class TwoDArray 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the Values in Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		System.out.println("Show Matrics");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println("");
		}
	}
}
