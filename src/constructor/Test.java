package constructor;

public class Test {

	String name;
	int a;
	
	Test(){
		
		name="shaktiman";
		a=1234;
		
	}
	
	Test(String sr, int d){
		
		name=sr;
		a=d;
		
	}
	public static void main(String[]args) {
		
		Test t=new Test();
		System.out.println(t.name);
		System.out.println(t.a);
		
		Test t2=new Test("tester",9880);
		System.out.println(t2.name);
		System.out.println(t2.a);
		
		
		
		
		
		
	}
	
}
