package constructor;

public class C {


String name;
int adharno;
//parameterized constructor
C()
{
name="aks";
adharno=80078;
}
//non parameterized constructor
C(String str,int a)
{

name=str;
adharno=a;
}

// non static method

public void d()
{
System.out.println(name);
System.out.println(adharno);
}

public static void main(String[]args)
{
C c=new C();
c.d();


C c1=new C("Shaktiman",007);
c1.d();

}
}
