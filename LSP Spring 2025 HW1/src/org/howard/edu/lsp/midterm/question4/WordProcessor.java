package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

//The WordProcessor class processes a sentence to find the longest words.
public class WordProcessor {
    private String sentence; // Stores the sentence to be processed

    //Constructor to initialize the WordProcessor with a sentence.
    //sentence - The sentence that needs to be processed.
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    //Finds and returns the longest words in the sentence.
    //Returns a list of the longest words in the sentence.
    public List<String> findLongestWords() {
        List<String> longestWords = new ArrayList<>();
        
        //Handles empty or null sentence
        if (sentence == null || sentence.trim().isEmpty()) {
            return longestWords;
        }

        //Splits the sentence into words and trims spaces so only words are evaluated
        String[] words = sentence.trim().split("\\s+");
        
        int maxLength = 0;
        
        //First, find the maximum word length
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        //Then, collect all words that have the maximum length
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }
}
