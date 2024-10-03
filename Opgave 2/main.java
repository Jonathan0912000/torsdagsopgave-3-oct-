import java.util.Scanner;

public class main {  // Class name should be capitalized
    public static void main(String[] args) {

        System.out.println("Please type your name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();  // Correct capitalization of nextLine()

        System.out.println("Hello " + name + ", please type your age");

        int age = scanner.nextInt();  // No need for 'new' here, just use scanner.nextInt()

        System.out.println("You are " + age + " years old");

        int YUR = 67;
        int whenYUR = YUR - age;

        System.out.println("You have " + whenYUR + " years until retirement");

        scanner.close();  // Good practice to close the scanner
    }
}
