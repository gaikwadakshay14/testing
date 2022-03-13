package firstpackage;

public class C {
public static void main(String[] args) {
	//Static call
	A.Demo();
	B.Demo1();
	
	//Non static call
	A cat=new A();
	cat.Test();
	
	B cat1=new B();
	cat1.Test1();
}
}
