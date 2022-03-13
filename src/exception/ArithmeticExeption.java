package exception;

public class ArithmeticExeption {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		
	}
		catch(ArithmeticException e){
			System.out.println("exception occurs here");
		}
		System.out.println("---end of programm here----");
		
	}
		
}
