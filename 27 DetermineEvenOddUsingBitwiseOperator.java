import java.util.Scanner;

class DetermineEvenOddUsingBitwiseOperator {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        if ((number & 1) == 1){
            System.out.println(number+" is an odd number.");
        }else{
            System.out.println(number+" is an even number.");
        }
    }
}
