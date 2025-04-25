package org.howard.edu.lspfinal.question2;

/**
 * This represents a task with a name, priority, and status.
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * Constructs a Task with a given name, priority, and status.
     * @param name is for the unique name of the task
     * @param priority is for the priority of the task (whether lower or higher)
     * @param status is for the status of the task: 'TODO', 'IN_PROGRESS' or 'DONE'
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}

