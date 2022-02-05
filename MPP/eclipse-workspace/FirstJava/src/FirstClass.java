import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Hello");
//Scanner scan=new Scanner(System.in);
//System.out.println(scan.nextLine());

String greeting = "Hello"; //initialize greeting to a string
if (greeting == "Hello") 
	System.out.print("Hello");
	// probably true
	
if (greeting.substring(0, 3) == "Hel") 
	System.out.print("Hello2");
// probably false
//String greeting = "Hello";
int n = greeting.length(); // is 5.
int cpCount = greeting.codePointCount(0, greeting.length());
System.out.print(n);
System.out.print(cpCount);
StringBuilder build=new StringBuilder();
build.append("george");
build.append(" Hello");
System.out.print(build.toString());
	}
	

}
