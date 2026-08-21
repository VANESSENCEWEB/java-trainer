import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo:");
        int numero = leia.nextInt();

        long resultado = 1;   // comeca em 1 (vamos multiplicando)
        int i = 1;

        while (i <= numero) {
            resultado = resultado * i;   // multiplica pelo i atual
            i = i + 1;                // passo: sobe o i
        }

        System.out.println("O fatorial de " + numero + " e: " + resultado);
    }
}