package abstractandconcret;

public class Test2 extends Test1 {
public void sample() {
	
	System.out.println("this is sample");
}
public static void main(String[] args) {
	Test2 tt=new Test2();
	
	tt.demo();
	tt.sample();
}
}
