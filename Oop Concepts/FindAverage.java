class Calculator {
  public double findAverage(int number1, int number2, int number3) {
      double average = (number1 + number2 + number3) / 3.0;
      return Math.round(average*100.0)/100.0;
  }
	// Implement your code here
}

class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
    System.out.println(calculator.findAverage(5, 10, 2));
	}
}