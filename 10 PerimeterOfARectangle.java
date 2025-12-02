import java.util.Scanner;

class PerimeterOfARectangle {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input first hand of the rectangle in cm: ");
         float hand1 = Input.nextFloat();
         System.out.print("Input second hand of the rectangle in cm: ");
         float hand2 = Input.nextFloat();
         System.out.print("Input third hand of the rectangle in cm: ");
         float hand3 = Input.nextFloat();
         System.out.print("Input fourth hand of the rectangle in cm: ");
         float hand4 = Input.nextFloat();

         System.out.println("The perimeter of the rectangle is: "+(hand1 + hand2 + hand3 + hand4)+" cm");
     }
}
