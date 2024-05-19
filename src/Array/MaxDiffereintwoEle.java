package Array;
import java.util.*;
public class MaxDiffereintwoEle
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
		int tmax,max=0,ele1=0,ele2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					tmax=a[j]-a[i];
					if(tmax>max)
					{
						max=tmax;
						ele1=a[i];
						ele2=a[j];
					}
				}
			}
		}
		System.out.println("The element wich provide max difference:"+ele1+"\t"+ele2);
		System.out.println("Max difference is:"+max);
	}
}
