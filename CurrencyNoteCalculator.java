import java.util.Scanner;
class CurrencyNoteCalculator {
	public static void main(String[] args) {
		// Implement your code here 
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();//1$ notes
        int x = sc.nextInt();//5$ notes
        int z = sc.nextInt();//Purchase amt
        int xNeeded = z / 5;
        int yNeeded = z - xNeeded*5;
        if(xNeeded > x) {
            xNeeded = x;
            yNeeded = z - x*5;
        }
        if(yNeeded > y) {
            System.out.println("-1");
        }
        else {
            System.out.println("5$ notes needed = " + xNeeded + "  1$ notes needed = " +yNeeded);
        }
        
	}
}
