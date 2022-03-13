package package3;

public class Control {
	
	public static void main(String[] args) {
		int marks =45;
		if (marks>=65) {
			System.out.println("Distinction");
			
		}
		
		else if(marks>=60 && marks<65) {
			System.out.println("first class");
		}
		
		else if(marks>=50 && marks <60) {
			System.out.println("second class");
			
		}
		else {
			
			System.out.println("pass");
		}
	}
}
