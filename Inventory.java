//A terrminal based version of the project

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    // ArrayList<ItemEntry> itemList;
    // File dataFile;

    // // constructor
    // public Inventory(String iName) throws FileNotFoundException {
    // this.dataFile = new File(iName + ".txt");
    // BufferedReader br = new BufferedReader(new FileReader(this.dataFile));
    // String rawText;
    // String[] tokens;
    // try {
    // while ((rawText = br.readLine()) != null) {
    // tokens = rawText.split(",");
    // this.itemList.add(new ItemEntry(tokens[0], Integer.parseInt(tokens[1])));
    // }
    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }

    // // creates new inventory file
    // public static boolean createInventory(String name) {
    // String fileAddress = new String(name + ".txt");
    // try {
    // File newFile = new File(fileAddress);
    // if (newFile.createNewFile()) {
    // System.out.println("New Inventory File: " + newFile.getName());
    // return true;
    // } else {
    // System.out.println("File already exists.");
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // return false;
    // }

    // // opens inventory file and reads contents to memory

    // // adds new item to inventory file
    // void newInventoryItem() {
    // }

    // // updates values of existing inventory item

    // // prints contents of existing inventory item

    // // deletes inventory item

    // // deletes inventory file

    public static void main(String args[]) {
        String choice;
        String goAgain = "Yes";
        Boolean correct = false;
        String filenm;
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
                    System.out.println("\nWhat would you like to name the inventory?:");
                    filenm = scan.nextLine();
                    System.out.println("Creating " + filenm + ".txt");
                    // Inventory.createInventory(filenm);
                    goAgain = repeat(goAgain, correct);
                    break;
                case "2":
                    System.out.println("\nWhich Inventory would you like to open?\n");
                    filenm = scan.nextLine();
                    System.out.println("Opening " + filenm + ".txt");
                    // Inventory gonnaOpen = new Inventory(filenm);
                    // for (int i = 0; i < gonnaOpen.dataFile.length(); i++) {
                    // System.out.println(gonnaOpen.itemList[i].name);
                    // }
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