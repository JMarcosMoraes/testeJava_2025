package com.kata.app;

import java.util.ArrayList;
import java.util.List;

/*
1. Write a Java program to solve the following problem:
    You are tasked with creating a utility function for a text-processing application.
    The function must generate all possible anagrams from a given group of distinct letters.
    For example, the input {a, b, c} should return the output: abc, acb, bac, bca, cab, cba.

Additional Requirements:
    1. The program should accept any group of distinct letters as input and produce the
    correct result.
    2. Optimize for readability and clarity.
    3. Include basic validation (e.g., ensure the input is non-empty and contains only
    letters).
    4. Write unit tests to validate your function with at least three different test cases,
    including edge cases (e.g., input with a single letter or empty input).
    5. Document your code clearly, explaining the logic for generating anagrams.
*/

/*
    Este é um programa Java que gera todos os anagramas possíveis a partir de um
    determinado grupo de letras distintas.
    Ele inclui validação para garantir que a entrada esteja correta,
    otimiza a legibilidade e contém testes unitários para verificar a exatidão.
 */

public class Anagram {
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

