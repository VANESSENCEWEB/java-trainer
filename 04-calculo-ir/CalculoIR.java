public class CalculoIR {
    
}
import java.util.Scanner;

public class CalculoIR {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu salario bruto:");
        double salario = leia.nextDouble();

        double imposto = 0;

        // Isencao 2026: ate 5000 nao paga nada
        if (salario <= 5000.00) {
            imposto = 0;
        } else {
            // limites das faixas do IR
            double i1 = 2428.80;
            double i2 = 2826.65;
            double i3 = 3751.05;
            double i4 = 4664.68;

            // Fatia 7,5%: de i1 ate i2
            if (salario > i2) {
                imposto = imposto + (i2 - i1) * 0.075;
            } else if (salario > i1) {
                imposto = imposto + (salario - i1) * 0.075;
            }

            // Fatia 15%: de i2 ate i3
            if (salario > i3) {
                imposto = imposto + (i3 - i2) * 0.15;
            } else if (salario > i2) {
                imposto = imposto + (salario - i2) * 0.15;
            }

            // Fatia 22,5%: de i3 ate i4
            if (salario > i4) {
                imposto = imposto + (i4 - i3) * 0.225;
            } else if (salario > i3) {
                imposto = imposto + (salario - i3) * 0.225;
            }

            // Fatia 27,5%: o que passar de i4
            if (salario > i4) {
                imposto = imposto + (salario - i4) * 0.275;
            }
        }

        System.out.println("Imposto de Renda: R$ " + imposto);
    }
}