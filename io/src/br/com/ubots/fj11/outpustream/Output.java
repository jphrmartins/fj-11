package br.com.ubots.fj11.outpustream;

import java.io.*;

public class Output {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("TesteOutputStream");
        bw.close();
    }
}
