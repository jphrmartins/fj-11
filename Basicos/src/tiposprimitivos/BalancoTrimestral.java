package tiposprimitivos;

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        int gastoTrimestral = gastoFevereiro + gastoJaneiro + gastoMarco;
        System.out.println("Gasto Trimestral: " + gastoTrimestral);
        int mediaTrimestral = gastoTrimestral / 3;
        System.out.println("Gasto Media Trimestral: " + mediaTrimestral);
    }
}
