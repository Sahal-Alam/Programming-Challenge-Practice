import java.util.Scanner;

class InputNameFromUserAndPrint {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Enter your name: ");
         String name = Input.next();

         System.out.println("Welcome Mr."+name);
     }
}
