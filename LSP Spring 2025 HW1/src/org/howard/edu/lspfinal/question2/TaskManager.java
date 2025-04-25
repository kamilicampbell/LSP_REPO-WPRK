package org.howard.edu.lspfinal.question2;

import java.util.*;

/**
 * Manages tasks by allowing add, retrieve, update, and print operations.
 */
public class TaskManager {
    private Map<String, Task> taskMap = new HashMap<>(); //utilizes Hash map as the appropriate design/data structure to implement TaskManager

    /**
     * Adds a new task to the system.
     * @param name is for the name of the task (must be unique)
     * @param priority is for the priority of the task
     * @param status is for the initial status of the task
     * @throws DuplicateTaskException if a task with the same name already exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (taskMap.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        taskMap.put(name, new Task(name, priority, status));
    }

    /**
     * Retrieves a task by name.
     * @param name is for the name of the task
     * @return the Task object
     * @throws TaskNotFoundException if the task does not exist
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        if (!taskMap.containsKey(name)) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return taskMap.get(name);
    }

    /**
     * Updates the status of an existing task.
     * @param name is for the name of the task
     * @param newStatus is for the new status to set
     * @throws TaskNotFoundException if the task does not exist
     */
    public void updateStatus(String name, String newStatus) throws TaskNotFoundException {
        Task task = getTaskByName(name);  //this will throw TaskNotFoundException if not found
        task.setStatus(newStatus);
    }

    /**
     * Prints all tasks grouped by their status.
     */
    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");

        Map<String, List<Task>> grouped = new HashMap<>();
        grouped.put("TODO", new ArrayList<>());
        grouped.put("IN_PROGRESS", new ArrayList<>());
        grouped.put("DONE", new ArrayList<>());

        for (Task task : taskMap.values()) {
            grouped.get(task.getStatus()).add(task);
        }

        for (String status : Arrays.asList("TODO", "IN_PROGRESS", "DONE")) {
            System.out.println(status + ":");
            for (Task task : grouped.get(status)) {
                System.out.println("  " + task);
            }
        }
    }
}
