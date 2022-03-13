package package3;

public class Returntype {
public  int Test(int a,int b) {
	
	//non static regular method 
	
	int add = a+b;
	return add;
	
}

	public  int Test1(int a,int b) {
		
//non static regular method
int result = a-b;
return (result);
}
	public  int Test2(int a,int b) {
		int result = a*b;
		return result;
		
	}
	public  int Test3(int a,int b) {
		int result=a/b;
		return result;
		
	}
	public static void main(String[] args) {
		Returntype rr= new Returntype();
		System.out.println(rr.Test(89, 62));
		System.out.println(rr.Test1(24, 37));
		System.out.println(rr.Test3(75, 18));
		System.out.println(rr.Test2(59, 61)); 
	}
	
}

