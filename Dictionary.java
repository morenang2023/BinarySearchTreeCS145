import java.util.Scanner;

public class Dictionary {
    private static Scanner scanner = new Scanner(System.in);
    private static BST bst = new BST();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Employee Dictionary!");
            System.out.println("1. Add an employee record");
            System.out.println("2. Delete an employee record");
            System.out.println("3. Lookup employee records");
            System.out.println("4. Quit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    deleteRecord();
                    break;
                case 3:
                    lookupRecords();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addRecord() {
        System.out.println("\nAdd an employee record");

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter street address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter state: ");
        String state = scanner.nextLine();

        System.out.print("Enter ZIP code: ");
        String zip = scanner.nextLine();

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        Employee employee = new Employee(id, firstName, lastName, streetAddress, city, state, zip, email, phone);
        bst.add(employee);

        System.out.println("\nRecord added: " + employee);
    }

    private static void deleteRecord() {
        System.out.println("\nDelete an employee record");

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you sure you want to delete this record? (y/n): ");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("y")) {
            bst.delete(id);
            System.out.println("Record deleted.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    private static void lookupRecords() {
        System.out.println("\nLookup employee records");
        System.out.println("1. Pre-order traversal");
        System.out.println("2. In-order traversal");
        System.out.println("3. Post-order traversal");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\nPre-order traversal:");
                bst.printPreOrder();
                break;
            case 2:
                System.out.println("\nIn-order traversal:");
                bst.printInOrder();
                break;
            case 3:
                System.out.println("\nPost-order traversal:");
                bst.printPostOrder();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}

//This file defines the Dictionary class, which provides a command-line interface for interacting with the BST class. It has methods