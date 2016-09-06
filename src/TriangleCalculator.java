import java.util.Scanner;

public class TriangleCalculator {

	public static void main(String[] args) {
		System.out.println("Enter the dimentions of sides of the triangle");
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if(a==b && b==c)
			System.out.println("The given triangle is equateral");
		else if(Math.pow(a,2)== Math.pow(b, 2)+Math.pow(c, 2) || Math.pow(b,2)== Math.pow(a, 2)+Math.pow(c, 2)
		|| Math.pow(c,2)== Math.pow(b, 2)+Math.pow(a, 2))
			System.out.println("The given triangle is Right triangle");
		
		else
			System.out.println("the given triangle is neither Equateral nor Right triangle");
		
		sc.close();

	}

}
