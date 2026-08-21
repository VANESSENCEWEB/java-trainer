import java.util.Scanner;

public class CalculoINSS {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu salario bruto:");
        double salario = leia.nextDouble();

        // limites das faixas de 2026
        double f1 = 1621.00;
        double f2 = 2902.84;
        double f3 = 4354.27;
        double teto = 8475.55;

        double inss = 0;
        double base = salario;

        // se ganhar acima do teto, so conta ate o teto
        if (base > teto) {
            base = teto;
        }

        // Fatia 1: ate f1, paga 7,5%
        if (base > f1) {
            inss = inss + f1 * 0.075;
        } else {
            inss = inss + base * 0.075;
        }

        // Fatia 2: de f1 ate f2, paga 9%
        if (base > f2) {
            inss = inss + (f2 - f1) * 0.09;
        } else if (base > f1) {
            inss = inss + (base - f1) * 0.09;
        }

        // Fatia 3: de f2 ate f3, paga 12%
        if (base > f3) {
            inss = inss + (f3 - f2) * 0.12;
        } else if (base > f2) {
            inss = inss + (base - f2) * 0.12;
        }

        // Fatia 4: de f3 ate o teto, paga 14%
        if (base > f3) {
            inss = inss + (base - f3) * 0.14;
        }

        double liquido = salario - inss;

        System.out.println("Contribuicao INSS: R$ " + inss);
        System.out.println("Salario liquido: R$ " + liquido);
    }
}