class a
{
 int id=20;
}
class b extends a
{
 int a=super.id;
 int b=20
 {
  System.out.println("sum :"(a+b));
 }
}
class basic
{
 public static void main(String args[])
 {
  b s1=new b();
  s1.sum();
  System.out.println("Sub class object:"+s1.id);
 }
}