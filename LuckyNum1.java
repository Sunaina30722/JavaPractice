import java.util.Scanner;
class LuckyNum1 {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = String.valueOf(num);
    int digit;
    int sum = 0;
    for(int i = 1; i < str.length(); i += 2 ) {
      digit = str.charAt(i) - '0';
      sum += digit * digit;
    }
    if(sum % 9 == 0) {
      System.out.println(num + " is a lucky number");
    }
    else {
      System.out.println(num + " is not a lucky number");
    }
	}
}
