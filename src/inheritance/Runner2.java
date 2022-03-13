package inheritance;

public class Runner2 {
public static void main(String[] args) {
	SonC ss=new SonC();
	ss.luxury();
	ss.gold();
	SonB ss1=new SonB();
	ss1.land();
	ss.gold();
	SonA ss2=new SonA();
	ss2.house();
	ss.gold();
}
}
