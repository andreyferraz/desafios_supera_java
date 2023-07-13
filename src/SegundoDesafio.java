import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double value = sc.nextDouble();
        int cents = (int)(value * 100);
        int[] values = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        int[] quantity = new int[values.length];
        for(int i=0; i<values.length; i++){
            quantity[i] = cents / values[i];
            cents %= values[i];
        }

        System.out.println("Notas: ");
        System.out.println(quantity[0] + " nota(s) de R$ 100.00");
        System.out.println(quantity[1] + " nota(s) de R$ 50.00");
        System.out.println(quantity[2] + " nota(s) de R$ 20.00");
        System.out.println(quantity[3] + " nota(s) de R$ 10.00");
        System.out.println(quantity[4] + " nota(s) de R$ 5.00");
        System.out.println(quantity[5] + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(quantity[6] + " moeda(s) de R$ 1.00");
        System.out.println(quantity[7] + " moeda(s) de R$ 0.50");
        System.out.println(quantity[8] + " moeda(s) de R$ 0.25");
        System.out.println(quantity[9] + " moeda(s) de R$ 0.10");
        System.out.println(quantity[10] + " moeda(s) de R$ 0.05");
        System.out.println(quantity[11] + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
