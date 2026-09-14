public class RestaurantSF {
  public String restaurantName;
  public long restaurantContact;
  public String restaurantAddress;
  public float rating;

  public RestaurantSF(String restaurantName, long restaurantContact, String restaurantAddress, float rating) {
    this.restaurantName = restaurantName;
    this.restaurantContact = restaurantContact;
    this.restaurantAddress = restaurantAddress;
    this.rating = rating;
  }

  public void displayRestaurantDetails() {
    System.out.println("Restaurant Name: " + restaurantName);
    System.out.println("Restaurant Rating: " + rating);
    System.out.println("Restaurant Contact: " + restaurantContact);
    System.out.println("Restaurant Address: " + restaurantAddress);
  }
}

class Tester {
  public static void main(String args[]) {
    // RestaurantSF restaurant1 = new RestaurantSF();
    // restaurant1.restaurantName = "McDonald's";
    // restaurant1.rating = 4.1F;
    // restaurant1.restaurantContact = 9988676767L;
    // restaurant1.restaurantAddress = "SH1109, Carolina Street, Springfield";
    // System.out.println("Displaying restaurant1 details: ");
    // restaurant1.displayRestaurantDetails();
    RestaurantSF restaurant1 = new RestaurantSF("KFC", 7789659055L, "GeethaBhavan", 4.5F);
    restaurant1.displayRestaurantDetails();
  }
}