class Money
{
 double d1;
 String name;
 Money(double n,String s1)
 {
  d1=n;
  name=s1;
 }
 Money(Money m)
 {
  d1=m.d1;
  name=m.name;
  System.out.println(d1);
  System.out.println(name);
  }
}
class copy
{
 public static void main(String args[])
 {
  Money m1=new Money(1001,"Sathguru");
  Money m2=new Money(m1);
 }
}
