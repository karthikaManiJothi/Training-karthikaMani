
public class UnBoxing {

	public static void main(String[] args) {
		Integer value = 100;
		int valueConvertion = value.intValue();
		int convertedValue = value;
		System.out.println("Unboxing:"+convertedValue);
		System.out.println("Unboxing:"+ valueConvertion);
		String str ="123";
		int strValue = Integer.parseInt(str);
		System.out.println(strValue);
	}

}
