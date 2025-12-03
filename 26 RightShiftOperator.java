import java.util.Scanner;

class RightShiftOperator {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int rightShift = number >> 2;
        System.out.println("The right shift of the number is: "+rightShift);
    }
}
