import java.util.Scanner;

public class Inventory {
    public static void main(String args[]) {
        System.out.println("Howdy Rowdy Inventory System");
        System.out.println("------------------------------");
        System.out.println(
                "1) Create New Inventory\n2) View Inventory\n3) Delete Inventory\n4) Update Inventory\n5) Quit");
        System.out.println("------------------------------");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        scan.close();

        switch (choice) {
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            case 3:
                System.out.println("You choise 3");
                break;
            case 4:
                System.out.println("You chose 4");
                break;
            case 5:
                System.out.println("You chose 5");
                break;
            default:
                System.out.println("ERROR: Invalid Choice [1-5]");
                break;
        }
    }

}