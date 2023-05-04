import java.util.*;
//import java.lang.Math;
class Square
{
	double a;
	double result;
	Square()
	{
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
	}
	public void value()
	{
		result = a*a;
		System.out.println("The answer is :\n" +result);
	}
}
public class Q9 {
	public static void main(String[] args) {
	Square obj = new Square();
	obj.value();
	}

}
