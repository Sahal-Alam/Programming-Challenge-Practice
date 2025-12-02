import java.util.Scanner;

class DetermineOddEven {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is Even.");
        }else {
            System.out.println("The number is Odd.");
        }
    }
}
