import java.util.Scanner;

class CalculateSimpleInterest {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input the principal amount in Taka: ");
        int principal = Input.nextInt();
        System.out.print("Input the time you want to keep: ");
        int time = Input.nextInt();
        System.out.print("Input the rate of interest in percentage: ");
        float rate = Input.nextFloat();

        System.out.println("The simple interest is: "+(principal * time * rate)/100);
    }
}
