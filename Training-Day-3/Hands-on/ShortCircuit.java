
public class ShortCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(false && true && true) {
			System.out.println("condition satisfied");
		}
		else {
			System.out.println("condition not satisfied");
		}
		if(true || false || true) {
			System.out.println("condition satisfied");
		}
		else {
			System.out.println("condition not satisfied");
		}
	}

}
