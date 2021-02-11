import java.util.Scanner;

public class WhileLoopTest {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements to iterate:");
        int maxElements;
        Scanner scanner = new Scanner(System.in); //Creation of the Scanner object to read data
        maxElements = scanner.nextInt(); //We read the value provided by the user
        int counter = 0;//Initialize the counter
        while (counter < maxElements) {
            System.out.println("counter = " + counter);
            counter++;
        }
    }
}
