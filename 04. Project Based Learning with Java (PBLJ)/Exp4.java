import java.util.*;

class Card {
    String s;
    int n;

    public Card(String s, int n) {
        this.s = s;
        this.n = n;
    }
}

public class Exp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Cards:");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Card> allCards = new ArrayList<>();
        Map<String, List<Card>> cardMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("enter card " + (i+1) + ":");
            String symbol = scanner.nextLine();
            int number = scanner.nextInt();
            scanner.nextLine();

            Card card = new Card(symbol, number);
            allCards.add(card);

            if (!cardMap.containsKey(symbol)) {
                cardMap.put(symbol, new ArrayList<>());
            }
            cardMap.get(symbol).add(card);
        }

        Collections.sort(allCards, Comparator.comparing(card -> card.s));

        System.out.println("Entered Cards : ");
        for (Card card : allCards) {
            System.out.println(card.s + " " + card.n);
        }

        System.out.println("\nSum : ");
        for (Map.Entry<String, List<Card>> entry : cardMap.entrySet()) {
            List<Card> cards = entry.getValue();

            int sum = cards.stream().mapToInt(card -> card.n).sum();
            System.out.println(entry.getKey() + " : " + sum);
        }
    }
}
