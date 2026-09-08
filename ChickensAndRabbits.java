import java.util.Scanner;
class ChickensAndRabbits {
	public static void main(String[] args) {
		// Implement your code here 
    Scanner sc = new Scanner(System.in);
    int heads = sc.nextInt();
    int legs = sc.nextInt();
    int rabbits = 0;
    int chickens = 0;
    if((legs > 4*heads) || ((legs-(2*heads)) % 2 != 0) || (legs < 2*heads)) {
      System.out.println("the number of chickens and rabbits cannot be found");
    }
    else {
      if(legs == 2*heads) {
        chickens = heads;
      }
      else {
          rabbits = (legs-(2*heads))/2;
          chickens = heads - rabbits;
      }
      System.out.println("Chickens = " + chickens +" Rabbits = " + rabbits);
    }
	}
}