import java.util.Scanner;

class CalculateGradesBasedOnMarks {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input your mark: ");
        int mark = Input.nextInt();

        if (mark >= 90){
            System.out.println("You got 'A'");
        } else if (mark >= 75) {
            System.out.println("You got 'B'");
        } else if (mark >= 60) {
            System.out.println("You got 'C'");
        } else if (mark >= 30) {
            System.out.println("You got 'D'");
        }else {
            System.out.println("You got 'F'");
        }
    }
}
