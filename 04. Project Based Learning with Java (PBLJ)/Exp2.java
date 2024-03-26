class Video {
    private String title; 
    private boolean checkedOut; 
    private int rating; 
  
    public Video(String title) {
      this.title = title;
      this.checkedOut = false;
      this.rating = 0;
    }
  
    public String getTitle() {
      return title;
    }
  
    public boolean isCheckedOut() {
      return checkedOut;
    }
  
    public int getRating() {
      return rating;
    }
  
    public void setCheckedOut(boolean checkedOut) {
      this.checkedOut = checkedOut;
    }
  
    public void setRating(int rating) {
      this.rating = rating;
    }
  }
  
class VideoStore extends Video {
    private Video[] inventory;
    public VideoStore() {
      super(""); // call super class
      inventory = new Video[10];
    }
    public void addVideo(String title) {
      for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] == null) {
          inventory[i] = new Video(title);
          System.out.println("Video " + title + " added to the inventory.");
          break;
        }
      }
    }
    public void checkOutVideo(String title) {
      for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] != null && inventory[i].getTitle().equals(title)) {
          if (!inventory[i].isCheckedOut()) {
            inventory[i].setCheckedOut(true);
            System.out.println("Video " + title + " checked out successfully.");
            break;
          } else {
            System.out.println("Video " + title + " is already checked out.");
            break;
          }
        }
      }
    }
  
    public void returnVideo(String title) {
      for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] != null && inventory[i].getTitle().equals(title)) {
          if (inventory[i].isCheckedOut()) {
            inventory[i].setCheckedOut(false);
            System.out.println("Video " + title + " returned successfully.");
            break;
          } else {
            System.out.println("Video " + title + " is not checked out.");
            break;
          }
        }
      }
    }
  
    public void receiveRating(String title, int rating) {
    for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] != null && inventory[i].getTitle().equals(title)) {
        inventory[i].setRating(rating);
        System.out.println("Video " + title + " rated " + rating + ".");
        break;
        }
    }
    }

    public void listInventory() {
    System.out.println("Video Inventory:");
    for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] != null) {
        System.out.println("Title: " + inventory[i].getTitle());
        System.out.println("Checked Out: " + inventory[i].isCheckedOut());
        System.out.println("Rating: " + inventory[i].getRating());
        System.out.println();
        }
    }
    }
}

class VideoLauncher {
    public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      VideoStore vs = new VideoStore();
      int choice, rating;
      String title;
      System.out.println("Welcome to the Video Store!");
      while (true) {
        System.out.println("Menu:");
        System.out.println("1. Add Video");
        System.out.println("2. Check Out Video");
        System.out.println("3. Return Video");
        System.out.println("4. Receive Rating");
        System.out.println("5. List Inventory");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
          case 1:
            System.out.print("Enter the video title: ");
            title = sc.nextLine();
            vs.addVideo(title);
            break;
          case 2:
            System.out.print("Enter the video title: ");
            title = sc.nextLine();
            vs.checkOutVideo(title);
            break;
          case 3:
            System.out.print("Enter the video title: ");
            title = sc.nextLine();
            vs.returnVideo(title);
            break;
          case 4:
            System.out.print("Enter the video title: ");
            title = sc.nextLine();
            System.out.print("Enter the rating (1-5): ");
            rating = sc.nextInt();
            sc.nextLine();
            vs.receiveRating(title, rating);
            break;
          case 5:
            vs.listInventory();
            break;
          case 6:
            System.out.println("Thank you for using the Video Store!");
            System.exit(0);
            break;
          default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
      }
    }
  }