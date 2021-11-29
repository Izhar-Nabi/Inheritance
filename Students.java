class Student
{
	String Name;
	String Roll;
	}
	
class Students extends Student{
	public static void main(String args[]){
	Student Data = new Student();
	Data.Name="xyz";
	Data.Roll="xyz";
	System.out.println(Data.Name);
	System.out.println(Data.Roll);
	}
}