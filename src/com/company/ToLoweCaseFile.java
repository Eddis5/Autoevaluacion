package com.company;

import java.io.*;
import java.util.Locale;

public class ToLoweCaseFile {
    public void toLowerCaseFile() throws IOException {
        BufferedReader f_in = new BufferedReader(new FileReader("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\texto\\texto.txt"));
        BufferedWriter f_out = new BufferedWriter(new FileWriter("C:\\Users\\Propietario\\IdeaProjects\\Autoevaluacion\\texto\\textoLowerCase.txt"));
        String texto= f_in.readLine();

        while (texto!=null){
            String textoToLower=texto.toLowerCase(Locale.ROOT);
            f_out.write(textoToLower+"\n");
            texto= f_in.readLine();
        }
        f_out.close();
        f_in.close();
    }
}
