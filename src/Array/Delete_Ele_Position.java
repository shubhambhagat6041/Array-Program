package Array;
import java.util.*;
public class Delete_Ele_Position 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the Position");
		int pos=xyz.nextInt();
		for(int i=pos;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("After Delete Element");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
