import java.util.Scanner;
class ZipZapZoom {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if((num % 3 == 0) && ( num % 5 == 0)) {
      System.out.println("Zoom");
    }
    else if(num % 3 == 0) {
      System.out.println("Zip");
    }
    else if(num % 5 == 0) {
      System.out.println("Zap");
    }
    else {
      System.out.println("Invalid");
    }
	}
}

