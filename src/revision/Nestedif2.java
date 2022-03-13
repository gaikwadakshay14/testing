package revision;

public class Nestedif2 {
public static void main(String[]args) {
	
	String Uid="asdg";
	String password="xyz@123";
	
	if(Uid=="asdge") {
		
		System.out.println("user id is correct");
		
		if(password=="xyz@1234") {
			System.out.println("password is correct");
		}
		
	
	}
	else {
		System.out.println("password is  wrong");
	}
	
}
}
