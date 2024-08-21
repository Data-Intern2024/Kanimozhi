import java.util.PriorityQueue;
import java.util.Comparator;

// Step 1: Define the Task class
class Task {
    String name;
    int priority;

    // Constructor
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + '}';
    }
}

// Step 2: Define the Comparator for Task
class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        // Higher priority tasks should come first
        return Integer.compare(t2.priority, t1.priority);
    }
}

// Step 3: Implement the Priority Queue with custom Comparator
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Step 4: Initialize the priority queue with custom comparator
        PriorityQueue<Task> queue = new PriorityQueue<>(new TaskComparator());

        // Step 5: Add tasks to the queue
        queue.offer(new Task("Task 1", 3));
        queue.offer(new Task("Task 2", 5));
        queue.offer(new Task("Task 3", 1));
        queue.offer(new Task("Task 4", 4));

        // Step 6: Retrieve and remove tasks based on priority
        while (!queue.isEmpty()) {
            Task task = queue.poll();
            System.out.println("Processing " + task);
        }
    }
}
