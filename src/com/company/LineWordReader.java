package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineWordReader {
    public void lineReader() throws IOException {
        BufferedReader f_ent = new BufferedReader(new FileReader("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\texto\\texto.txt"));
        int numLineas = 0;
        while (f_ent.readLine()!=null){
            numLineas++;
        }
        f_ent.close();
        System.out.println(numLineas);
    }

    public void wordReader() throws IOException {
        BufferedReader f_ent = new BufferedReader(new FileReader("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\texto\\texto.txt"));
        int numWords = 0;
        String linea =f_ent.readLine();
        while (linea!=null){
            String [] words = linea.split(" ");
            numWords+=words.length;
            linea=f_ent.readLine();
        }
        f_ent.close();
        System.out.println(numWords);
    }

}


