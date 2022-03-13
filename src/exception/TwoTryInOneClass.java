package exception;

public class TwoTryInOneClass {
	public static void main(String[] args) {
		try {
		int a =10;
		int b =0;
		
		int c=a/b;
		System.out.println(c);
		}
	catch(ArithmeticException e) {
		System.out.println("exception occurs here mathematic");
			
		}catch(NullPointerException e) {
			System.out.println("exception occurs here");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception occurs here");
		}
		String str[]= {"nivruti","pranav","akshay"};
		
		
		try {
			System.out.println(str[3]);
			
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("exception occurs here Array index");
		}
		System.out.println("-----end of programm here-----");
	}

	}
