package org.howard.edu.lspfinal.question2;

/**
 * This exception is thrown when attempting to add a task with a duplicate name ie a name that already exists in the system.
 */
public class DuplicateTaskException extends Exception {
	private static final long serialVersionUID = 1L; //since it is a custom exception class
    public DuplicateTaskException(String message) {
        super(message);
    }
}
