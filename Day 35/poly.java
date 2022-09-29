abstract class bike
{
 abstract void insurance();
}
class splendor extends bike
{
 void run()
 {
  System.out.println("Splendor mileage 630kmpl");
 }
 void insurance()
 {
  System.out.println("New splendor insurance 2500");
 }
}
class poly
{
 public static void main(String args[])
 {
  splendor s=new splendor();
  s.run();
  s.insurance();
 }
}