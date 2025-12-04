import java.util.Scanner;

class SumOfTheDigits {
    static void main(String[] args) {

        System.out.println("The sum of the digits is: "+sumOfTheDigits());
    }
    public static int sumOfTheDigits(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int num = number , store = 0 , sum = 0;
        while (num > 0){
            store = num % 10;
            sum = sum + store;
            num = num / 10;
        }
        return sum;
    }
}
