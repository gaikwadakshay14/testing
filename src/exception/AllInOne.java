package exception;

public class AllInOne {
	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		
		int c=a/b;
		
		System.out.println(c);
		
		String name=null;
		System.out.println(name.length());
		
		}catch(ArithmeticException e) {
			System.out.println("excetion occurs mathematic");
		}catch(NullPointerException e) {
			System.out.println("excetion occurs nullpointer");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("excetion occurs ArrayIndexOutOfBoundsException");
		}
		System.out.println("----end of programm here---");
		
	}
		

}
