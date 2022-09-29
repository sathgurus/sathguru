class Area
{
 int a,r;
 double l,b;
 double pi=3.14;
 int Area()
 {
  a=4;
  System.out.println((a*a));
 }
 double Area(double l1,double b1)
 {
  l=l1;
  b=b1;
 }
 double Area(int r1)
 {
  r=r1;
  return pi*r*r;
 }
}
class meth
{
 public static void main(String args[])
 {
  Area obj=new Area();
  obj.Area();
  double rect=obj.Area(22.3,23.4);
  double cir=obj.Area(5);
  System.out.println(rect);
  System.out.println(cir);
 }
}
