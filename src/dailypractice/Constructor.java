package dailypractice;

public class Constructor
{

String name;
int rollno;

//non-parameterized constructor
Constructor()
{
name="Shaktiman";
rollno=2631;

}


//parameterized constructor
Constructor(int a, String ss)
{
name=ss;
rollno= a;

}

public static void main(String[]args)
{
//non parameterized 
	Constructor ss=new Constructor();
System.out.println(ss.name);
System.out.println(ss.rollno);

//parameterized 

Constructor ss1=new Constructor();
System.out.println("Akki");
System.out.println(1327);

}
}
