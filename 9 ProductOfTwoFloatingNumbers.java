import java.util.Scanner;

class ProductOfTwoFloatingNumbers {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input first float number: ");
         float num1 = Input.nextFloat();
         System.out.print("Input second float number: ");
         float num2 = Input.nextFloat();

         System.out.println("The product of the two numbers is: "+num1*num2);
     }
}
