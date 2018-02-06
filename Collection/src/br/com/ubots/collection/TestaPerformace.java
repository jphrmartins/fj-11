package br.com.ubots.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {
    public static void main(String[] args) {
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i <total; i++){
            teste.add(i);
        }
        for (int i = 0; i<total; i++){
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto com ArrayList: " + tempo);

        System.out.println("----------------------");

        Collection<Integer> teste2 = new HashSet<>();
        long inicioHash = System.currentTimeMillis();
        int totalHash = 30000;
        for (int i = 0; i <totalHash; i++){
            teste.add(i);
        }
        for (int i = 0; i<totalHash; i++){
            teste.contains(i);
        }
        long fimHash = System.currentTimeMillis();
        long tempoHash = fimHash - inicioHash;
        System.out.println("Tempo gasto com HashSet: " + tempoHash);

    }
}
