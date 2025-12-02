import java.util.Scanner;

class ShowResultsOfAllArithmeticOperators {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input first number: ");
         int num1 = Input.nextInt();
         System.out.print("Input second number: ");
         int num2 = Input.nextInt();

         int sum = num1 + num2;
         int sub = num1 - num2;
         int mul = num1 * num2;
         int div = num1 / num2;
         int mod = num1 % num2;

         System.out.println("The summation of the two numbers is: "+sum);
         System.out.println("The subtraction of the two numbers is: "+sub);
         System.out.println("The multiplication of the two numbers is: "+mul);
         System.out.println("The division of the two numbers is: "+div);
         System.out.println("The modulus of the two numbers is: "+mod);

     }
}
