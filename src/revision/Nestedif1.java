package revision;

public class Nestedif1 {
public static void main(String[]args) {
	
	int patient=80000;
	
	if(patient>=100000) {
		
		System.out.println("most critical condition");
		
		
	}
	else if(patient>=70000 && patient<100000) {
		
		System.out.println("crital condition");
	}
	else if(patient>=40000 && patient<70000) {
		System.out.println("much critical condition");
		
	}
	else {
		System.out.println("condition is better");
	}
}
}
