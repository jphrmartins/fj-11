package br.com.ubots.fj11.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivoPrintStream.txt");
        while (s.hasNextLine()){
            ps.println(s.nextLine());
        }
    }
}
