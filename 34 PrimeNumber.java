import java.util.Scanner;

class PrimeNumber {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();
        boolean result = isPrimeNumber(number);
        if (isPrimeNumber(number)){
            System.out.println(number+" is prime");
        }else {
            System.out.println(number+" is not prime");
        }
    }
    public static boolean isPrimeNumber(int num){

        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
