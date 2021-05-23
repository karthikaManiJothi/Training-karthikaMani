 class Student{
	String name;
	int studentId;
	public Student() {
		name ="common";
		studentId=111;
	}
	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	public void display() {
		System.out.println(name+" "+studentId);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
		Student s2 =new Student("karthika",123);
		s2.display();

	}

}
