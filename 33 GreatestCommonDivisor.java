import java.util.Scanner;

class GreatestCommonDivisor {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = Input.nextInt();
        System.out.print("Input second number: ");
        int num2 = Input.nextInt();

        int result = greatestCommonDivisor(num1 , num2);
        System.out.println("The Greatest Common Divisor is: "+result);
    }
    public static int greatestCommonDivisor(int num1 , int num2){

        int small = 0;
        if (num1 < num2){
            small = num1;
        }else {
            small = num2;
        }

        while (small >= 1){
            if (num1 % small == 0 && num2 % small == 0){
                return small;
            }
            small--;
        }
        return 1;
    }
}
