import java.util.*;
class ArrayString
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s[]=new String[400];
  int i,n;
  System.out.println("Enter the Size For the string:");
  n=sc.nextInt();
  for(i=0;i<=n;i++)
  {
   s[i]=sc.nextLine();
  }
  System.out.println("original String:");
  for(i=0;i<=n;i++)
  {
   System.out.println(s[i]);
  }
 }
}