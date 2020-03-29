import java.util.Scanner;

public class Inventory {
    public static void main(String args[]) {
        String choice;
        String goAgain = "Yes";
        Boolean correct = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Howdy Rowdy Inventory System");
            System.out.println("------------------------------");
            System.out.println(
                    "1) Create New Inventory\n2) View Inventory\n3) Delete Inventory\n4) Update Inventory\nq) Quit");
            System.out.println("------------------------------");
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("\nYou chose 1\n");
                    goAgain = repeat(goAgain, correct);
                    break;
                case "2":
                    System.out.println("\nYou chose 2\n");
                    goAgain = repeat(goAgain, correct);
                    break;
                case "3":
                    System.out.println("\nYou chose 3\n");
                    goAgain = repeat(goAgain, correct);
                    break;
                case "4":
                    System.out.println("\nYou chose 4\n");
                    goAgain = repeat(goAgain, correct);
                    break;
                case "q":
                    goAgain = leave(goAgain, correct);
                    break;
                default:
                    System.out.println("ERROR: Invalid Choice [1-5]\n");
                    break;
            }
        } while (goAgain.equalsIgnoreCase("yes"));
        System.out.println("Alright\nThank you for using the Howdy Rowdy Inventory System\nHave a nice day!\n");
        scan.close();
    }

    public static String leave(String goAgain, Boolean correct) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\nAre you sure? (yes/no)");
            String leave = scan.nextLine();
            if (leave.equalsIgnoreCase("yes")) {
                correct = true;
                goAgain = "no";
                // scan.close();
                System.out.print("\n");
                return goAgain;
            } else if (leave.equalsIgnoreCase("no")) {
                correct = true;
                System.out.print("\n");
            } else {
                System.out.println("ERROR: Invalid Response (yes/no)\n");
            }
        } while (correct = false);
        // scan.close();
        return goAgain;
    }

    public static String repeat(String goAgain, Boolean correct) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Would you like to do more? (yes/no)");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no")) {
                correct = true;
                goAgain = response;
                // scan.close();
                System.out.print("\n");
                return goAgain;
            } else {
                System.out.println("ERROR: Invalid response (yes/no)");
            }
        } while (correct = false);
        // scan.close();
        return goAgain;
    }

}