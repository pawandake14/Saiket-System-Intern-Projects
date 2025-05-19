
import java.util.ArrayList;
import java.util.Scanner;

// Creating the class to representing the tasks
class Task {

    private String title;
    private boolean isDone;

    public Task(String title) {
        this.title = title;
        this.isDone = false;
    }

    public void markComplete() {
        this.isDone = true;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return (isDone ? "Done" : "Not Done") + ": " + title;
    }
}

public class ToDoApplication {

    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nTo-Do Tasks:");
            System.out.println("1. Add a new task");
            System.out.println("2. View the tasks");
            System.out.println("3. Mark task as completed");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }

    private static void addTask() {
        System.out.print("Enter task: ");
        String title = sc.nextLine();
        Task newTask = new Task(title);
        tasks.add(newTask);

        System.out.println("Task added successfully...");
    }

    private static void viewTasks() {
        System.out.println("\nTask List");
        if (tasks.isEmpty()) {
            System.out.println("Task List is empty");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void markTaskAsCompleted() {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to mark as complete: ");
            int taskNumber = sc.nextInt();
            sc.nextLine();

            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                tasks.get(taskNumber - 1).markComplete();
                System.out.println("Task Marked as completed");
            } else {
                System.out.println("you entered an invalid task number");
            }
        }
    }

}
