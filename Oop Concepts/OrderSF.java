public class OrderSF {
  public int orderId;
  public String orderedFoods;
  public double totalPrice;
  public String status;
  public double calculateTotalPrice(int unitPrice) {
    totalPrice = unitPrice + ((double)(unitPrice*5)/100);
    return totalPrice;
  }

  public OrderSF() {
    status = "Ordered";
  }

  public OrderSF(int orderId, String orderedFoods) {
    this.orderId = orderId;
    this.orderedFoods = orderedFoods;
    status = "Ordered";
  }
}
class Tester {
  public static void main(String args[]) {
    OrderSF order1 = new OrderSF();
    order1.orderId = 101;
    order1.orderedFoods = "Spinach Alfredo Pasta";
    order1.status = "Ordered";
    System.out.println("Order1 Details ");
    System.out.println("Order Id: " + order1.orderId);
    System.out.println("Ordered Food: " + order1.orderedFoods);
    System.out.println("Order Status: " + order1.status);
    System.out.println("Total Price: " + order1.calculateTotalPrice(33));
    OrderSF order2 = new OrderSF();
    System.out.println("Order2 Details ");
    System.out.println("Order Status: " + order2.status);
    OrderSF order3 = new OrderSF(102, "Chicken Pasta");
    System.out.println("Order3 Details ");
    System.out.println("Order Id: " + order3.orderId);
    System.out.println("Ordered Food: " + order3.orderedFoods);
    System.out.println("Order Status: " + order3.status);
  }
}