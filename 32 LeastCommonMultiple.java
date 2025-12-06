import java.util.Scanner;

class LeastCommonMultiple {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = Input.nextInt();
        System.out.print("Input second number: ");
        int num2 = Input.nextInt();

        int result = leastCommonMultiple(num1 , num2);
        System.out.println("The Least Common Multiple is: "+result);
    }
    public static int leastCommonMultiple(int num1 , int num2){

        int i = 1;
        while (i <= (num1 * num2)){
            if (i % num1 == 0 && i % num2 == 0){
                return i;
            }
            i++;
        }
        return 0;
    }
}
