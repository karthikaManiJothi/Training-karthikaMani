
public class WhileLoop {

	public static void main(String[] args) {
		int base=-3,powerValue=1,count=0;
		while(count<3) {
			powerValue *=base;
			count+=1;
		}
		System.out.println(powerValue);
	}

}
