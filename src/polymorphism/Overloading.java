package polymorphism;

public class Overloading {
	public void demo(int a,float b)
	{
		float c=a+b;
		System.out.println("addition of two numbers"+c);
	}
public void demo(int a ,int b,int c) {
	int d=a+b+c;
	System.out.println("addition of three numbers"+d);
	
}
public void demo(float a,float b) {
	float c=a/b;
	System.out.println("division of two numbers"+c);
}


}
