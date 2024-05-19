package Array;
import java.util.*;
public class RotateArray_nPosition 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter Values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();//10 20 30 40 50 60 
		}
		System.out.println("Enter the Position you want to rotate");
		int pos=xyz.nextInt();//2
		while(pos!=0)//2!=0//1!=0
		{
			int temp=a[0];//10//20
			for(int i=0;i<a.length-1;i++)//0<5//1<5//2<5//3<5//4<5
			{
				a[i]=a[i+1];//20//30//40//50//60
			}
			a[a.length-1]=temp;//10
			pos--;//1
		}
		System.out.println("After Rotate Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//30 40 50 60 10 20 
		}
	}
}
