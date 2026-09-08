import java.util.Scanner;
class NextDateCalculation {
	public static void main(String[] args) {
		// Implement your code here 
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = 0;
        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;
        if(month < 8) {
            if(month==2) {
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;//leap yr
                }
                else {
                    days = 28;//non-leap yr
                } 
            }
            else if(month % 2 != 0) {
                days = 31;
            }
            else {
                days =30;
            }
        }
        else {
            if(month % 2 != 0) {
                    days = 30;
                }
                else {
                    days =31;
                }
        }
        if(day < days) {
            newDay = day + 1;
        }
        else {
            newDay = 1;
        }
        if((day == days) && (month == 12)){
            newMonth = 1;
            newYear = year + 1;
        }
        else if(day == days) {
            newMonth = month + 1;
            newYear = year;
        }
        else {
            newMonth = month;
            newYear = year;
        }
        System.out.println(newDay + "-" + newMonth + "-" + newYear);
	}
}
