import java.util.Scanner;

 class BitwiseOr {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int first = Input.nextInt();
        System.out.print("Input second number: ");
        int second = Input.nextInt();

        int result = first | second ;

        System.out.println("The result is: "+result);
    }
}
