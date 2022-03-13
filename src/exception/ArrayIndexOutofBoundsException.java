package exception;

public class ArrayIndexOutofBoundsException {
	
	public static void main(String[] args) {
		
		String str[]= {"java","abc","selenium"};
		try {
		System.out.println(str[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception occurs");
			}
		System.out.println("----------end of programm----");
	}
}
	

