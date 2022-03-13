package firstpackage;

public class Sample {
public static void demo() {
	// Declaration
	String name;
	int rollno;
	char grade;
	float percentage;
	
	//Initialization
	name="abc";
	rollno=101;
	grade='A';
    percentage=60.62f;
    //Usage
    System.out.println(name);
    System.out.println(rollno);
    System.out.println(grade);
    System.out.println(percentage);
}
    	public void test() {
    		// Declaration
    		String name;
    		int rollno;
    		char grade;
    		float percentage;
    		
    		//Initialization
    		name="abc";
    		rollno=101;
    		grade='A';
    	    percentage=60.62f;
    	    //Usage
    	    System.out.println(name);
    	    System.out.println(rollno);
    	    System.out.println(grade);
    	    System.out.println(percentage);
    	}
    	public static void main(String[] args) {
			Sample.demo();
			Sample sam=new Sample();
			sam.test();
			
		}
}
