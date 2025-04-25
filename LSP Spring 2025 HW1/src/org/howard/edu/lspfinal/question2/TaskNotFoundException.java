package org.howard.edu.lspfinal.question2;

/**
 * This exception is thrown when a requested task is not found ie the task doesn't exist in the system.
 */
public class TaskNotFoundException extends Exception {
	private static final long serialVersionUID = 1L; //since it is a custom exception class
    public TaskNotFoundException(String message) {
        super(message);
    }
}

