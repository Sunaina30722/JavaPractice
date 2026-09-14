class Calculator {

    // 1. Declare the instance variable as mentioned in the problem statement
    public int num;

    // 2. Implement the sumOfDigits method
    public int sumOfDigits() {
        int sum = 0;
        int temp = num; // Using a temporary variable so the original 'num' isn't changed

        // Loop to extract each digit
        while (temp > 0) {
            sum += temp % 10;  // Extract the last digit and add it to the sum
            temp = temp / 10;  // Remove the last digit from the number
        }

        return sum;
    }
}

class Tester {

    public static void main(String args[]) {

        Calculator calculator = new Calculator();

        // 3. Assign a sample value to the member variable num (e.g., 654)
        calculator.num = 654;

        // 4. Invoke the method and display the output
        int result = calculator.sumOfDigits();
        System.out.println(result);
    }
}
