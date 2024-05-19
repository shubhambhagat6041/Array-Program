package Array;
import java.util.*;
public class CountDistinctPairUsingDifference {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter the Values in Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the Difference");
		int diff=xyz.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]==diff)
				{
					System.out.println("Pair is:["+a[j]+"\t"+a[i]+"]");
					count++;
				}
			}
		}
		System.out.println("Number of Distinct Pair Difference:"+count);
	}

}
