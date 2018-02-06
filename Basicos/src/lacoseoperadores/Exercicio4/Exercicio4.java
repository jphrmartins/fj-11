package lacoseoperadores.Exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        int resultado = 1;
        for (int i = 1; i <= 10; i++){
            System.out.println("Fatorial de " + i + ": " + resultado * i);
            resultado *= i;
        }
        System.out.println("----------------------------------");
        long resultadoLong = 1;
        for (int i = 1; i <= 20; i++){
            System.out.println("Fatorial de " + i + ": " + resultadoLong * i);
            resultadoLong *= i;
        }
    }
}
