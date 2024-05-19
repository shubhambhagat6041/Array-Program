package Array;
import java.util.*;
public class Merge_twoArray_Arrange_descending 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter Values in First Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter Values in Second Array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		int c[]=new int[(a.length)+(b.length)];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+(a.length)]=b[i];
		}
		System.out.println("After Merge");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println("After Descending");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
