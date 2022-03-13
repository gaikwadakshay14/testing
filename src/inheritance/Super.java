package inheritance;

public class Super extends Superkeyword{

public void demo2() {
	int x=200;
	System.out.println(x);
	System.out.println(super.x);
}
public static void main(String[] args) {
Super ss=new Super();
ss.demo2();
}
}
