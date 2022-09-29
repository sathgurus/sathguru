class Student
{
 int id,age;
 String name;
 double fees;
 Student(int id1,String n1)
 {
  	id=id1;
	name=n1;
	System.out.println("id :"+id);
	System.out.println("name :"+name);
 }
 Student(int a1)
 {
  	age=a1;
	System.out.println("Age :"+age);
 }
 Student(double f1)
 {
	fees=f1;
 	System.out.println("Fees :"+fees);
 }
}
class over
{
 public static void main(String args[])
 {
  Student s1=new Student(1001,"Sathguru");
  Student s2=new Student(24);
  Student s3=new Student(75000.50);
 }
}
 	