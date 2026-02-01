import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList<Student> db = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome");

        do {
            System.out.println("\n1. Add Student details");
            System.out.println("2. Remove Student details");
            System.out.println("3. Display a Student details");
            System.out.println("4. Display all Student details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    int[] marks = new int[5];
                    System.out.print("Enter Tamil marks: ");
                    marks[0] = sc.nextInt();
                    System.out.print("Enter English marks: ");
                    marks[1] = sc.nextInt();
                    System.out.print("Enter Maths marks: ");
                    marks[2] = sc.nextInt();
                    System.out.print("Enter Science marks: ");
                    marks[3] = sc.nextInt();
                    System.out.print("Enter Social marks: ");
                    marks[4] = sc.nextInt();

                    db.add(new Student(id, name, marks));
                    System.out.println("Student added successfully");
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removed = false;

                    for (int i = 0; i < db.size(); i++) {
                        if (db.get(i).getId() == removeId) {
                            db.remove(i);
                            removed = true;
                            System.out.println("Student removed successfully");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Student s : db) {
                        if (s.getId() == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    if (db.isEmpty()) {
                        System.out.println("No students available");
                    } else {
                        System.out.println("\nID | Name | Max | Min | Avg");
                        for (Student s : db) {
                            s.displaySummary();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
