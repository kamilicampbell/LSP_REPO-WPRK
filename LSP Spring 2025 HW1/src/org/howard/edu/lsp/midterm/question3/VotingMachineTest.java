package org.howard.edu.lsp.midterm.question3;

//The VotingMachineTest class is a tests the functionality of the VotingMachine class.
public class VotingMachineTest {

    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine(); //Creates a new instance of VotingMachine

        //Adding candidates
        vm.addCandidate("Alice");
        vm.addCandidate("Bob");
        vm.addCandidate("Charlie");

        //Casting votes for candidates
        vm.castVote("Alice");
        vm.castVote("Alice");
        vm.castVote("Bob");
        vm.castVote("Charlie");
        vm.castVote("Charlie");
        vm.castVote("Charlie");

        //Testing for attempts to vote for a non-existent candidate
        boolean success = vm.castVote("Eve");
        System.out.println("Vote for Eve successful? " + success);  // Expected: false

        //Displaying results
        System.out.println("Winner: " + vm.getWinner());  // Expected: Charlie WINS with 3 votes!!
    }
}

