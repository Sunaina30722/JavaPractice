import java.util.Scanner;
class SeedOfNumber {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num1Copy = num1;
    int product = num1;
    int digit = 0;
    while(num1Copy != 0) {
      digit = num1Copy % 10;
      num1Copy /= 10;
      product *= digit;
    }
    if(product == num2) {
      System.out.println(num1 + " is a seed of " + num2);
    }
    else {
      System.out.println(num1 + " is not a seed of " + num2);
    }
	}
}
