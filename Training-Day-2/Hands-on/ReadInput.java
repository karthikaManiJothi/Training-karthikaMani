
public class ReadInput {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a char:");
		try {
			ch = (char)System.in.read();
			System.out.println("character:"+ch);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
