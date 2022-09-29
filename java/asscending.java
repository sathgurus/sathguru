import java.util.*;
class asscending
{
 public static void main(String args[])
 {
 	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array:");
	int t;
 	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("unsorted array:");
	
	for(int i=0;i<5;i++)
	{
		System.out.print(arr[i]+" ");
	}
	for(int i=0;i<5;i++)
	{
		for(int j=i;j<5;j++)
 		{
		  	if(arr[i]>arr[j])
			{
		  		t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;

			}
		}
	}
	System.out.println("sorted array:");
	for(int i=0;i<5;i++)
	{
		System.out.print(arr[i]+" ");
	}
  }
}
  