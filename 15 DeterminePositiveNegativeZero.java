import java.util.Scanner;

class DeterminePositiveNegativeZero {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        if (number > 0){
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        }else {
            System.out.println("The number is zero.");
        }
    }
}
