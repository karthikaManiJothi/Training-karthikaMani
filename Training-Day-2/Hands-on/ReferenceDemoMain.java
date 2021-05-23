
class ReferenceDemo{
	public void display() {
		int i =10;
		System.out.println("hi everyone, im in demo class");
		System.out.println("local variable value:"+i);
	}
}
public class ReferenceDemoMain {

	public static void main(String[] args) {
		ReferenceDemo demo = new ReferenceDemo();
		demo.display();

	}

}
