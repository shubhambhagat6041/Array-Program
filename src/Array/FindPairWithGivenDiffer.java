package Array;
import java.util.*;
public class FindPairWithGivenDiffer
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
		System.out.println("Enter the Difference");
		int diff=xyz.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]==diff)
				{
					System.out.println("The Pair are:"+a[i]+"\t"+a[j]);
				}
			}
		}
	}
}
