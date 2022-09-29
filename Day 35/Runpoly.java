class bike
{
 void run()
 {
 System.out.println("Running...");
 }
}
class splendor extends bike
{
 void run()
 {
  System.out.println("Splendor mileage 630 kmpl");
 }
}
class Runpoly
{
 public static void main(String args[])
 {
  bike a=new splendor();
  a.run();
 }
}
