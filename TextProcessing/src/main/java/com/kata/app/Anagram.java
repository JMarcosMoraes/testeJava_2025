package com.kata.app;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    /**
     * Generates all possible anagrams for a given string.
     *
     * @param input A string containing distinct letters
     * @return A list of anagram permutations
     * @throws IllegalArgumentException if input is invalid
     */
    public static List<String> generateAnagrams(String input) {
        if (input == null || input.isEmpty() || !input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Entrada inválida. Deve conter apenas letras e não pode estar vazia.");
        }
        List<String> anagrams = new ArrayList<>();
        permute("", input, anagrams);
        return anagrams;
    }

    /**
     * Recursive method to generate permutations.
     *
     * @param prefix Current prefix of the permutation
     * @param remaining Remaining characters to permute
     * @param anagrams List to store generated anagrams
     */
    private static void permute(String prefix, String remaining, List<String> anagrams) {
        if (remaining.isEmpty()) {
            anagrams.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        anagrams);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> anagrams = generateAnagrams(input);
        System.out.println("Anagramas de " + input + ": " + anagrams);
    }
}

