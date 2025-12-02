import java.util.Scanner;

class SwapTwoNumbers {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input first number: ");
         int num1 = Input.nextInt();
         System.out.print("Input second number: ");
         int num2 = Input.nextInt();

         int num3 = 0;
         num3 = num2 ;
         num2 = num1;
         num1 = num3;

         System.out.println("The swap has been done!");
         System.out.println(num1);
         System.out.println(num2);
     }
}
