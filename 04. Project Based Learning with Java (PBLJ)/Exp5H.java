import java.util.HashSet;
import java.util.Scanner;

public class Exp5H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Character> symbols = new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        int count = 0;
        while (count < 4) {
            System.out.print("Enter card: ");
            String input = scanner.next();
            char symbol = input.charAt(0);
            int number = Integer.parseInt(input.substring(1));

            if (!symbols.contains(symbol)) {
                symbols.add(symbol);
                numbers.add(number);
                count++;
            }
        }

        System.out.println("First card for every symbol:");
        for (int i = 0; i < symbols.size(); i++) {
            System.out.println(symbols.toArray()[i] + " " + numbers.get(i));
        }
    }
}
