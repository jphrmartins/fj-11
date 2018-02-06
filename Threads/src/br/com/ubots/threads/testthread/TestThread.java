package br.com.ubots.threads.testthread;

import br.com.ubots.threads.programa.Programa;

public class TestThread {
    public static void main(String[] args) {
        Programa programa1 = new Programa();
        Programa programa2 = new Programa();
        Thread thread1 = new Thread(programa1);
        Thread thread2 = new Thread(programa2);

        thread1.start();
        thread2.start();
    }
}
