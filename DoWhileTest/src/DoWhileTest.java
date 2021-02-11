import java.util.Scanner;

public class DoWhile10Test {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements to iterate:");
        int maxElements;
        Scanner scanner = new Scanner(System.in); //Creation of the Scanner object to read data
        maxElements = scanner.nextInt(); //We read the value provided by the user
        int counter = 0;
        do {
            //At least executed the first time
            System.out.println("counter = " + counter);
            counter++;
        } while (counter < maxElements);
    }
}
