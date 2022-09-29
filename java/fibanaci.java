 import java.util.*;
class fibanaci
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n1,n2,n3,i,n;
  System.out.println("Enter Any Number:");
  n=sc.nextInt();
  
  n1=0;
  n2=1;
  n3=n1+n2;
  System.out.println(n3);
  for(i=0;i<=n;i++)
  {
   n1=n2;
   n2=n3;   
   n3=n1+n2;
   System.out.println(n3);
  }
 }
}