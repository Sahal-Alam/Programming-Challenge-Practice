import java.util.Scanner;

class FahrenheitToCelsius {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input temperature in Fahrenheit: ");
        float temperature = Input.nextFloat();

        System.out.println("The temperature in Celsius is: "+((temperature-32) * 5/9));
    }
}
