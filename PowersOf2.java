import java.util.Scanner;
class PowersOf2 {
	public static void main(String[] args) {
		// Implement your code here 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(product + " ");
            product*=2;
        }
	}
}
