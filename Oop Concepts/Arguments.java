class Customer {
  public String customerName;
  public String customerId;
  public String address;

  public void payBill(double totalPrice, double discountPercentage) {
    System.out.println("Calculating final amount to be paid......");
    double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
    System.out.println("Hi " + customerName+ ", your final bill amount after discount is: "+ (int) (priceAfterDiscount * 100) / 100.0);
  }
}
class Arguments {
  public static void main(String args[]) {
    Customer customer = new Customer();
    customer.customerId = "C101";
    customer.customerName = "Stephen Abram";
    customer.address = "D089, St. Louis Street, Springfield, 62729";
    customer.payBill(500, 10);
  }
}