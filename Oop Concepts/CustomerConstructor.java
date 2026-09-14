public class CustomerConstructor {
  public String customerName;
  public long contactNumber;
  public String address;

  public CustomerConstructor(String customerName, long contactNumber, String address) {
    this.customerName = customerName;
    this.contactNumber = contactNumber;
    this.address = address;
  }
  public void displayCustomerDetails() {
    System.out.println(this.customerName);
    System.out.println(this.contactNumber);
    System.out.println(this.address);
  }
}
class Tester {
  public static void main(String args[]) {
    CustomerConstructor customer1 = new CustomerConstructor("sonu", 7893185842L, "Maruthinagar, karimnagar, Telangana");
    customer1.displayCustomerDetails();
  }
}