package org.howard.edu.lsp.assignment5;

public class Driver {
	/**
     * The main method serves as the entry point for testing the IntegerSet class.
     * It creates and manipulates IntegerSet objects and prints the results to the console.
     * 
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Test 1: Basic operations on IntegerSet
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Test 2: Operations with another set
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2 is: " + set2.toString());

        System.out.println("Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Test 3: Set intersection
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        // Test 4: Set difference
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString());

        // Test 5: Set complement
        set1.complement(set2);
        System.out.println("Result of complement of Set1 and Set2: " + set1.toString());
    }
}

