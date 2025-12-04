import java.util.Scanner;

class SumOfAllOddNumbers {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int result = sumOfodd(number);
        System.out.println("The sum of all odd numbers till "+number+" is: "+result);
    }
    public static int sumOfodd(int num){

        int i = 1 , sum =0;
        while (i <= num){
            if (i % 2 != 0){
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
}
