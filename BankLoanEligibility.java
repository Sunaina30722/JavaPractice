import java.util.Scanner;

class BankLoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accNum = sc.next();
        int accBal = sc.nextInt();
        int salary = sc.nextInt();
        String loanType = sc.next();
        int expLoanAmt = sc.nextInt();
        int expNumEmis = sc.nextInt();

        int eligibleLoanAmt = 0;
        int numOfEmis = 0;

        // Determine eligible loan amount and EMIs
        if (salary > 75000 && loanType.equals("Business")) {
            eligibleLoanAmt = 7500000;
            numOfEmis = 84;
        }
        else if (salary > 50000 && loanType.equals("House")) {
            eligibleLoanAmt = 6000000;
            numOfEmis = 60;
        }
        else if (salary > 25000 && loanType.equals("Car")) {
            eligibleLoanAmt = 500000;
            numOfEmis = 36;
        }

        // Validate account number
        if (accNum.length() != 4 || accNum.charAt(0) != '1') {
            System.out.println("Invalid account number");
        }
        // Validate account balance
        else if (accBal < 1000) {
            System.out.println("Insufficient Account balance");
        }
        else {
            // Check loan eligibility
            if (expLoanAmt <= eligibleLoanAmt &&
                expNumEmis <= numOfEmis) {

                System.out.println(accNum + " is ELIGIBLE for loan of "
                        + expLoanAmt + " with " + expNumEmis + " EMIs.");
            }
            else {
                System.out.println("The bank does not provide the loan");
            }
        }
    }
}