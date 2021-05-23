import java.util.*;
public class GuessGame {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		char answer = 't';
		char guessedValue;
		System.out.println("Let's start the game");
	    while(true){
	    	System.out.print("Enter your guessing Character:");
	    	guessedValue =(char) System.in.read();
	    	sc.nextLine();
	    	if(guessedValue==answer){
	    		System.out.println("yes!!! you guessed correctly");
	    		System.exit(0);
	    	}
	    	else {
	    		System.out.println("Sorry!!! Try again");	
	    	}
	    }
	}

}
