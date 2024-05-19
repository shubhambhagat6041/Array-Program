package Array;
import java.util.*;
public class SeconLargest_Element 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the values in Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();//10 20 30 40 50 
		}
		int max=a[0];
		int smax=0;
		for(int i=0;i<a.length;i++)//10//20//30//40//50
		{
			if(a[i]>max)//10>10//20>10{tr)//30>20(tr)//40>30(tr)//50>40(tr)
			{
				smax=max;//10//20//30//40==smax=40
				max=a[i];//20//30//40//50
			}
		}
		if(smax!=max)//40!50
		{
			System.out.println("Second Largest Value is:"+smax);//40
		}
	}
}
