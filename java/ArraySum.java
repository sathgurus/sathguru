import java.util.*;
class ArraySum
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int i;
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Array:");
  for(i=0;i<5;i++)
  {
   a[i]=sc.nextInt();
   sum=sum+a[i];
  }
  System.out.println("The Sum of Array:"+sum);
 }
}