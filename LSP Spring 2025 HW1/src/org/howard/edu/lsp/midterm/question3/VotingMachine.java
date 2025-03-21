package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

//The VotingMachine class represents a simple electronic voting machine
public class VotingMachine {
    private Map<String, Integer> candidates; // A map to store candidate names and their corresponding vote counts.

    //Constructor to initialise the VotingMachine with no candidates.
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    //Adds a candidate to the voting machine.
    //candidateName - The name of the candidate to be added.
    public void addCandidate(String candidateName) {
        if (!candidates.containsKey(candidateName)) { // Add the candidate with 0 votes initially.
            candidates.put(candidateName, 0);
        }
    }

    //Allows for casting a vote for a candidate.
    //candidateName - The name of the candidate who is receiving a vote.
    //Returns true if the vote was successfully cast, false if the candidate doesn't exist.
    public boolean castVote(String candidateName) {
        if (candidates.containsKey(candidateName)) { // If the candidate exists, increment their vote count.
            candidates.put(candidateName, candidates.get(candidateName) + 1);
            return true;
        }
        // If the candidate does not exist, return false.
        return false;
    }

    
    //Determines the winner of the election based on the total votes.
    //Returns the name of the candidate who has the most votes.
    public String getWinner() {
        String winner = null;
        int maxVotes = 0;

        //Goes over the candidates and their votes to find the one with the most votes.
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        //Returns the winner.
        if (winner != null) {
            return winner + " WINS with " + maxVotes + " votes!!";
        }

        return "No candidates available.";
    }
}
