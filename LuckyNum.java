import java.util.Scanner;
class LuckyNum {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int numCopy = num;
    int eDigit;
    int sum = 0;
    int digit;
    int rev = 0;
    while(numCopy != 0) {
      digit = numCopy % 10;
      numCopy /= 10;
      rev = rev*10 +digit;
    }
    while(rev != 0) {
      eDigit = (rev % 100)/10;
      rev /= 100;
      sum += (eDigit * eDigit);
    }    
    if(sum % 9 == 0) {
      System.out.println(num + " is a lucky number");
    }
    else {
      System.out.println(num + " is not a lucky number");
    }
	}
}
