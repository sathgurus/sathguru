import java.util.*;
class prime
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n,k,i;
  k=0;
  System.out.println("Enter Any Number:");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  {
   if(n%i==0)
   k++;
  }
  if(k==2)
   {
    System.out.println("Prime Number");
   }
   else
   {
    System.out.println("Not a Prime Number");
   }
 }
}