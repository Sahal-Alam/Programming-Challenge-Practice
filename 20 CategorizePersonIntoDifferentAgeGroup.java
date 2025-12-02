import java.util.Scanner;

class CategorizePersonIntoDifferentAgeGroup {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input your age: ");
        int age = Input.nextInt();
        
        if (age < 13){
            System.out.println("You are Child");
        } else if (age < 20) {
            System.out.println("You are Teen");
        } else if (age < 60) {
            System.out.println("You are Adult");
        }else {
            System.out.println("You are Senior");
        }
    }
}
