import java.util.Scanner;
public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dozenPrice = 3.25;
        double eachPrice = 0.45;
        System.out.println("How many eggs do you want");
        int eggs = scanner.nextInt();
        int dozen = eggs/12;
        int remainder = eggs % 12;
        double dozenCost = dozenPrice * dozen;
        double eachCost = eachPrice * remainder;
        double totalCost = dozenCost + eachCost;
        System.out.println("You ordered " + eggs + " eggs. Thats " + dozen + " dozen at $3.25 per dozen and " + remainder + " loose eggs at 45 cents each for a total of $" + totalCost);


    }
}
