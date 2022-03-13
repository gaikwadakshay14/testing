package package3;

public class Nested {
	
	public  void test()
	{
		
		String login="gaikwad";
		String password="Satara@123";
		
		if(login=="gaikwad") {
			
			System.out.println("login is correct");
			
			if(password=="satara@123") {
				
				System.out.println("password is correct");
			}
			else {
				
				System.out.println("password is wrong");
			}
			
		}
	}
		
	
public static void main(String[] args) {
	Nested nes=new Nested();
	nes.test();
}
}