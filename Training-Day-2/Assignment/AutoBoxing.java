
public class AutoBoxing {
 public static void main(String[] args) {
	 int value=100; //primitive
	 Integer valueConvertion = new Integer(value); //boxing
	 Integer convertedValue =value; //auto-boxing
	 System.out.println("Boxing:"+ valueConvertion);
	 System.out.println("AutoBoxing:"+ convertedValue);
 }
}
