package newPractice;

public class Sample {
	public float demo(int a,float b) {
		float add=a+b;
		return add;
		}
	
	public float demo1(int a,int b) {
		
		float sub=a-b;
		return sub;
	}
	
	
	
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.demo(46, 25.3f));
		System.out.println(s.demo(79, 46.5f));
		System.out.println(s.demo1(45, 13));
		
	}

}
