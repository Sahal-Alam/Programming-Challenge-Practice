import java.util.Scanner;

class BitwiseComplement {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int compliment = ~number;
        System.out.println("The compliment of "+number+" is: "+compliment);
    }
}
