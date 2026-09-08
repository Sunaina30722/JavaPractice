import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int numCopy = num;
    int digit = 0;
    int reverse = 0;
    while(numCopy != 0) {
      digit = numCopy % 10;
      numCopy /= 10;
      reverse = reverse*10 + digit;
    }
    if(reverse == num) {
      System.out.println(num + " is a palindrome");
    }
    else {
      System.out.println(num + " is not a palindrome");
    }
	}
}

