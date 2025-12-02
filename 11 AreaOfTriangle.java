import java.util.Scanner;

class AreaOfTriangle {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input the Base of the Triangle in cm: ");
         float base = Input.nextFloat();
         System.out.print("Input the Height of the Triangle in cm: ");
         float height = Input.nextFloat();

         System.out.println("The Area of the Triangle is: "+(0.5*base*height)+" cm2");
     }
}
