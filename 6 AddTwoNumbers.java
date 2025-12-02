import java.util.Scanner;

class AddTwoNumbers {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input first number: ");
         int num1 = Input.nextInt();
         System.out.print("Input second number: ");
         int num2 = Input.nextInt();

         int sum = num1 + num2;

         System.out.println("The add of the two numbers is: "+sum);
     }
}
