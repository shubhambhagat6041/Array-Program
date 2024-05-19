package Array;
import java.util.*;
public class NextGreaterElement {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Values in Array");
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					System.out.println("Next Bigger Element of "+a[i]+" in the array is:"+a[j]);
					break;
				}
			}
		}

	}

}
