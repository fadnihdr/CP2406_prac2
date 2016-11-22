import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input length(inches)");
        int length = scanner.nextInt();
        int foot = length/12;
        int remainder = length % 12;

        System.out.println(length + " inches is " + foot + " feet and " + remainder + " inches");
    }
}
