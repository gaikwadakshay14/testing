package exception;

public class NullPointerEception {

	public static void main(String[] args) {
	try {	
		String name=null;
		System.out.println(name.length());
	}catch(NullPointerException e) {
		System.out.println("exception occurs here");
	}
	System.out.println("-----end of programm here");
}
}
