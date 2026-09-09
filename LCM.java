import java.util.Scanner;
class LCM {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int LCM = num1 * num2;
    for(int i = Math.max(num1, num2); i < num1 * num2; i++) {
      if((i % num1 == 0) && (i % num2 == 0)) {
        LCM = i;
        break;
      }
    }
    System.out.println(LCM);
	}
}

