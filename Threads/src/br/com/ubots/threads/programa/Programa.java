package br.com.ubots.threads.programa;

public class Programa implements Runnable {
    private static int numPrograma;
    private int id;

    public Programa() {
        this.id = Programa.aumentarNumeroPrograma();
    }

    private static int aumentarNumeroPrograma() {
        numPrograma++;
        return numPrograma;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 300; i++){
            System.out.println("Programa " + Programa.numPrograma + " Volta: " + i);
        }
    }
}
