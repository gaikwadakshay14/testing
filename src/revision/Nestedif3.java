package revision;

public class Nestedif3 {

	public static void main(String[] args) {
		
		String Uid="abcd";
		String password="xyz@Test";
		
		if(Uid=="abcd") {
			
			System.out.println("login");
			if(password=="xyz@Test") {
				System.out.println("wrong password");
			}
		}
		else {
			System.out.println("wrong");
		}
		System.out.println("fhkk");
		
	}
	
}
