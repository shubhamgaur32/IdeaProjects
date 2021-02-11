import java.util.Scanner;

public class ForLoopTest {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements to iterate:");
        int maxElements;
        Scanner scanner = new Scanner(System.in); //Creation of the Scanner object to read data
        maxElements = scanner.nextInt(); //We read the value provided by the user
        for (int counter = 0; counter < maxElements; counter++) {
            System.out.println("counter = " + counter);
        }
    }
}
