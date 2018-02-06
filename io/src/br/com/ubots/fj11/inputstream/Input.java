package br.com.ubots.fj11.inputstream;

import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        while (s != null){
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }
}
