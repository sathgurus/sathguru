class Multicatch
{
 public static void main(String args[])
 {
  int a[]={1,2,3,4,5};
  System.out.println(a[8]);
 }
 catch(ArrayIndexofBoundsException e)
 {
  System.out.println("Fetching over the limit:"e);
 }
 catch(Exception e)
 {
  System.out.println(e);
 }
}
