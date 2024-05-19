package Array;
import java.util.*;
public class Insert_ele_SpecifiedPos 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Values in Array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the Position");
		int index=xyz.nextInt();//2
		System.out.println("Enter the New Element");
		int ele=xyz.nextInt();//100
		for(int i=a.length-2;i>=index;i--)//10 20 30 40 50
		{
			a[i+1]=a[i];
		}
		a[index]=ele;
		
		System.out.println("After inserting New Element");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
