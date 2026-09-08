import java.util.Scanner;
class SolvingQuadraticEqn {
	public static void main(String[] args) {
		// Implement your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = (b * b) - (4 * a * c);
        if(d < 0) {
            System.out.println("The equation has no real root");
        }
        else if(d > 0){
            System.out.println("The roots are : " + ((-b + Math.sqrt(d))/2 * a) + ", " + ((-b - Math.sqrt(d)) / 2 *a));
        }
        else {
            System.out.println("The root is : " + (-b / 2 * a));
        }
	}
}

