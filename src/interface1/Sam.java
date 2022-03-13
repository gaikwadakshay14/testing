package interface1;

public class Sam implements Sample {

	public void m1() {
		System.out.println("This is m1");
	}
	public void m2() {
		System.out.println("This is m2");
	}
	public void m3() {
		System.out.println("This is m3");
	}
	public static void main(String[] args) {
		
	
	
	Sam ss=new Sam();
	ss.m1();
	ss.m2();
	ss.m3();
	}
}
