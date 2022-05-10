package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LongestWord {
    public void longestWord() throws FileNotFoundException {
        String longest_word="";
        String current_word;
        Scanner reader = new Scanner(new File("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\texto\\texto.txt"));
        while (reader.hasNext()){
            current_word=reader.next();
            if (current_word.length()>longest_word.length()){
                longest_word=current_word;
            }
        }
        System.out.println(longest_word);
    }
}
