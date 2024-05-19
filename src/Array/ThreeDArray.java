package Array;
import java.util.*;
public class ThreeDArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][][]=new int[3][3][3];
		System.out.println("Enter the Values in Matrics");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					a[i][j][k]=xyz.nextInt();
				}
			}
		}
		System.out.println("Show Matrics");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					System.out.printf("%d\t",a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
