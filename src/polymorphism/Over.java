package polymorphism;

public class Over {
public float demo(int a,float b) {
	
	
	float c=a+b;
	System.out.println(c);
	return c;
}
public static void main(String[] args) {
	Over o=new Over();
	o.demo(15,23f);
	
}
}
