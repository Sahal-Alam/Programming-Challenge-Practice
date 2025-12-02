import java.util.Scanner;

class DetermineLeapYear {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a year: ");
        int year = Input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year+ " is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
