package dailypractice;

public class Test2 extends Test1 {

	public void demo1() {
		int a=14;                        //local variable
		
		
		System.out.println(a);
		System.out.println(super.a);
		
	}
	
	public static void main(String[] args) {
		
		Test2 tt = new Test2();
		tt.demo1();
		
	}
	
}
