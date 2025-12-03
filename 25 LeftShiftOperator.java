import java.util.Scanner;

class LeftShiftOperator {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int leftShift = number << 2;
        System.out.println("The left shift is: "+leftShift);
    }
}
