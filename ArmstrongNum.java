import java.util.Scanner;
class ArmstrongNum {
	public static void main(String[] args) {
		// Implement your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int digit;
    int sum = 0;
    int numCopy = num;
    int size = 0;
    while(numCopy != 0) {
      numCopy /= 10;
      size++;
    } 
    numCopy = num;
    while(numCopy != 0) {
      digit = numCopy % 10;
      numCopy /= 10;
      sum += (int)Math.pow(digit, size);      
    }
    if(sum == num) {
      System.out.println(num + " is an Armstrong number");
    }
    else{
      System.out.println(num + " is not an Armstrong number");
    }
	}
}