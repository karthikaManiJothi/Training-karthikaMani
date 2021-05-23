import java.util.*;
public class JumpStatement {

	public static void main(String[] args)throws Exception {
		Scanner sc =new Scanner(System.in);
		char stopWord ='q';
		while(true) {
			char ch =(char) System.in.read();
			sc.nextLine();
			if(ch==stopWord) {
				System.out.println("stopped");
				break;
			}
			else {
				continue;
			}
		}
		sc.close();
	}

}
