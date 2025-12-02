import java.util.Scanner;

class CalculateCompoundInterest {
     static void main(String[] args) {
         Scanner Input = new Scanner(System.in);

         System.out.print("Input the amount of Principal in Taka: ");
         int principal = Input.nextInt();
         System.out.print("Input the time you want to keep in year: ");
         float time = Input.nextFloat();
         System.out.print("Input the rate of interest in percentage: ");
         double interest = Input.nextDouble();

         System.out.println("The compound interest is: "+(principal * (1 + interest / 100) * time)+" Taka");
     }
}
