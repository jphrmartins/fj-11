package br.com.ubots.sockets.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("porta 12345 aberta");
        Socket cliente = servidor.accept();
        System.out.println("conecado ao cliente " + cliente.getInetAddress().getHostAddress());

        Scanner teclado = new Scanner(cliente.getInputStream());
        while (teclado.hasNextLine()){
            System.out.println(teclado.nextLine());
        }
        teclado.close();
        cliente.close();
        servidor.close();
    }
}
