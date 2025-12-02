import java.util.Scanner;

class DetermineGreatestNumber {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int first = Input.nextInt();
        System.out.print("Input second number: ");
        int second = Input.nextInt();
        System.out.print("Input third number: ");
        int third = Input.nextInt();

        if (first > second && first > third){
            System.out.println(first+" is the greatest number.");
        } else if (second > third) {
            System.out.println(second+" is the greatest number.");
        }else{
            System.out.println(third+" is the greatest number.");
        }
    }
}
