import java.util.ArrayList;
import java.util.Scanner;

public class Exp6 {
    public static void main(String[] args) {
        ArrayList<String> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Add All");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter item to add :");
                    String item = scanner.nextLine();
                    itemList.add(item);
                    System.out.println("Added");
                    break;
                    case 2:
                    ArrayList<String> newList = new ArrayList<>(itemList);
                    newList.addAll(itemList);
                    System.out.println("New list :");
                    for (String newItem : newList) {
                        System.out.println(newItem);
                    }          
                    System.out.println("All elements added");
                    break;
                    case 3:
                    System.out.println("Enter the item to search :");
                    String searchItem = scanner.nextLine();
                    if (itemList.contains(searchItem)) {
                        int index = itemList.indexOf(searchItem);
                        System.out.println("Found at index: " + index);
                    } else {
                        System.out.println("Not Found.");
                    }
                    break;                
                case 4:
                    System.out.println("Enter item to delete ");
                    String deleteItem = scanner.nextLine();
                    if (itemList.remove(deleteItem)) {
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Not Found.");
                    }
                    break;
                case 5:
                    System.out.println("Items in the list ");
                    for (String itemString : itemList) {
                        System.out.println(itemString);
                    }
                    break;
                case 6:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Incorrect");
            }
        } while (choice != 6);
    }
}
