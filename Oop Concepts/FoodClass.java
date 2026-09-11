class Food {
  public String foodName;
  public String cuisine;
  public String foodType;
  public int quantityAvailable;
  public double unitPrice;
}
class FoodClass {
  public static void main(String args[]) {
    Food pasta = new Food();
    pasta.foodName = "Cheesy macroni Pasta";
    pasta.cuisine = "Italian cuisine";
    pasta.foodType = "Vegetarian";
    pasta.quantityAvailable = 3;
    pasta.unitPrice = 120;
    System.out.println(pasta.foodName);
    System.out.println(pasta.cuisine);
    System.out.println(pasta.foodType);
    System.out.println(pasta.quantityAvailable);
    System.out.println(pasta.unitPrice);
  }
}