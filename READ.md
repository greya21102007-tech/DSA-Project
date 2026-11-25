# Undo/Redo Text Editor

## 📌 Project Overview

The **Undo/Redo Text Editor** is a simple text editing application developed using Java. It allows users to insert text, delete characters, undo previous operations, and redo undone operations.

This project demonstrates the practical implementation of fundamental Data Structures, especially **Stack and Linked List**.

## 🎯 Objectives

- To understand the working of Stack and Linked List.
- To implement Undo and Redo operations.
- To manage text editing operations efficiently.
- To understand the practical applications of Data Structures.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **IDE:** VS Code
- **Java Library:** Java Collections Framework

## 📚 Data Structures Used

| Data Structure | Application |
|---|---|
| Stack (Undo) | Stores previous text states |
| Stack (Redo) | Stores undone text states |
| Linked List | Stores individual characters |

## ✨ Features

1. **Insert Text:** Allows users to enter text into the editor.
2. **Delete Text:** Deletes the last character from the current text.
3. **Undo Operation:** Restores the previous text state.
4. **Redo Operation:** Restores the text state after an undo.
5. **Display Text:** Displays the current content of the editor.
6. **Input Validation:** Handles invalid menu inputs without crashing.
7. **Exit:** Allows users to close the application.

## ⚙️ How It Works

The application maintains three main data structures:

- A LinkedList stores the current text.
- An Undo Stack stores previous text states before modifications.
- A Redo Stack stores states that have been undone.

Whenever a user inserts or deletes text, the current state is saved in the Undo Stack. When Undo is performed, the current state moves to the Redo Stack and the previous state is restored.

When Redo is performed, the most recently undone state is restored.

A new editing operation clears the Redo Stack.

## ▶️ How to Run the Project

**Step 1:** Install Java JDK on your computer.

**Step 2:** Clone the repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

**Step 3:** Open the project folder in VS Code.

**Step 4:** Compile the Java program:

```bash
javac Main.java
```

**Step 5:** Run the application:

```bash
java Main
```

## 📋 Menu Options

```text
===== UNDO/REDO TEXT EDITOR =====

1. Insert Text
2. Delete Last Character
3. Undo
4. Redo
5. Display Text
6. Exit

Enter choice:
```

## 🧪 Sample Output

```text
Enter choice: 1
Enter text: Hello

Text inserted successfully!

Enter choice: 5
Current Text: Hello

Enter choice: 2
Last character deleted!

Enter choice: 5
Current Text: Hell

Enter choice: 3
Undo successful!

Enter choice: 5
Current Text: Hello
```

## ⏱️ Time Complexity

Let `n` represent the number of characters in the text.

| Operation | Time Complexity |
|---|---|
| Insert Text | O(n) |
| Delete Last Character | O(1) |
| Undo | O(n) |
| Redo | O(n) |
| Display Text | O(n) |

## 🚀 Future Improvements

- Add a graphical user interface (GUI).
- Support deleting selected text.
- Add copy, cut, and paste functionality.
- Implement file saving and loading.
- Support multiple undo and redo operations.

## 👥 Project Information

**Project Name:** Undo/Redo Text Editor

**Project Type:** Data Structures and Algorithms (DSA)

**Difficulty Level:** Easy

**Team Member:** Greya Mahant

## 📖 Conclusion

The Undo/Redo Text Editor demonstrates how Stack and Linked List data structures can be used to develop a basic text editing system. It provides practical knowledge of stack operations, linked list manipulation, and state management using Java.

---

⭐ If you find this project useful, feel free to explore and improve it!