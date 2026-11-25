
import java.util.*;

public class Main {

    static LinkedList<Character> text = new LinkedList<>();
    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();

    static String getText() {
        StringBuilder sb = new StringBuilder();

        for (char ch : text) {
            sb.append(ch);
        }

        return sb.toString();
    }

    static void setText(String s) {
        text.clear();

        for (char ch : s.toCharArray()) {
            text.add(ch);
        }
    }

    static void insert(String s) {
        if (s.isEmpty()) {
            System.out.println("Nothing to insert!");
            return;
        }

        undoStack.push(getText());
        redoStack.clear();

        for (char ch : s.toCharArray()) {
            text.add(ch);
        }

        System.out.println("Text inserted successfully!");
    }

    static void delete() {
        if (text.isEmpty()) {
            System.out.println("Nothing to delete!");
            return;
        }

        undoStack.push(getText());
        redoStack.clear();

        text.removeLast();

        System.out.println("Last character deleted!"); 
    }

    static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
            return;
        }

        redoStack.push(getText());
        setText(undoStack.pop());

        System.out.println("Undo successful!");
    }

    static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo!");
            return;
        }

        undoStack.push(getText());
        setText(redoStack.pop());

        System.out.println("Redo successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== UNDO/REDO TEXT EDITOR =====");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Last Character");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Display Text");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");

            String input = sc.nextLine().trim();

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1-6).");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String s = sc.nextLine();
                    insert(s);
                    break;

                case 2:
                    delete();
                    break;

                case 3:
                    undo();
                    break;

                case 4:
                    redo();
                    break;

                case 5:
                    System.out.println("Current Text: " + getText());
                    break;

                case 6:
                    System.out.println("Thank you for using Text Editor!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Enter between 1 and 6.");
            }
        }
    }
}
