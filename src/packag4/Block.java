package packag4;

public class Block {

	static
	{
		
		System.out.println("run static block");
		}
	{
	
	System.out.println("run non static block");
	}
	
	
		
	public static void main(String[] args) {
		
		System.out.println("this is main method");
		Block b=new Block();
	}
}
