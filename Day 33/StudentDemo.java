class student
{
 int id;
 String name;
}
class StudentDemo
{
 public static void main(String args[])
 {
 	student obj=new student();
	obj.id=1001;
	obj.name="Sathgurunathan";
	System.out.println("Student id :"+obj.id);
	System.out.println("Student name :"+obj.name);
 }
}