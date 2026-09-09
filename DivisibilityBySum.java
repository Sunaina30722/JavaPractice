import java.util.Scanner;
class DivisibilityBySum {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int numCopy = num;
    int sum = 0;
    int digit = 0;
    while(numCopy != 0) {
      digit = numCopy % 10;
      numCopy /= 10;
      sum+=digit;
    }
    if(sum != 0 && num % sum == 0) {
      System.out.println(num + " is divisible by sum of its digits");
    }
    else {
      System.out.println(num + " is not divisible by sum of its digits");
    }
	}
}
