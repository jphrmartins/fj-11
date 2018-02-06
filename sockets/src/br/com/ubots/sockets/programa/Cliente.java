package br.com.ubots.sockets.programa;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket("127.0.0.1", 12345);
        System.out.println("cliente conectado");

        Scanner teclado = new Scanner(System.in);
        PrintStream ps = new PrintStream(cliente.getOutputStream());
        while (teclado.hasNext()){
            ps.println("cliente: " + teclado.nextLine());
        }
        ps.close();
        teclado.close();
        cliente.close();
    }

}
