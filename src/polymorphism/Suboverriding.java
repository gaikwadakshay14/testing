package polymorphism;

public class Suboverriding extends Overriding{
public void sample() {
	System.out.println("This is suboverriding");
}
public static void main(String[] args) {
 Suboverriding s=new Suboverriding();
 s.sample();
}
}
