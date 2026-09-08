import java.util.Scanner;
class foodDeliveryBill {
	public static void main(String[] args) {
		// Implement your code here 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter V or N where V means vegetarian and N means Nonvegetarian: ");
        char foodType = sc.next().charAt(0);
        System.out.print("Enter the number of plates: ");
        int qtyOrdered = sc.nextInt();
        System.out.print("Enter the distance in Km: ");
        int distance = sc.nextInt();
        int cost = 0;
        int deliveryCost = 0;
        int finalPrice = 0;
        if((foodType != 'V' && foodType != 'N') || qtyOrdered < 1 || distance < 1) {
            finalPrice = -1;
        }
        else {
            if(foodType == 'V') {
                cost = qtyOrdered * 12;
            }
            else{
                cost = qtyOrdered * 15;
            }
            if(distance <= 3) {
                deliveryCost = 0;
            }
            else if(distance <= 6) {
                deliveryCost = 1;
            }
            else if(distance > 6) {
                deliveryCost = 3;
            }
            finalPrice = cost + deliveryCost;
        }
        System.out.println("Final Bill is: " + finalPrice);
	}
}