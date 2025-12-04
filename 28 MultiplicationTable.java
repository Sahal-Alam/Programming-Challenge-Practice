import java.util.Scanner;

class MultiplicationTable {
    static void main(String[] args) {


        int result = multiplicationTable();
    }
    public static int multiplicationTable(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int i = 1 , number1 = 1;
        while (i <= 10){
            number1 = number * i;
            System.out.println(number+" * "+i+" = "+number1);
            i++;
        }
        return number1;
    }
}
