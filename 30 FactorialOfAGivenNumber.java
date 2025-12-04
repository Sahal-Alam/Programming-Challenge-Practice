import java.util.Scanner;

class FactorialOfAGivenNumber {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

//        int result = factorial(number);
        System.out.println("The factorial of "+number+" is: "+factorial(number));
    }
    public static int factorial(int num){

        int i = 1 , fact = 1;
        while (i <= num){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
