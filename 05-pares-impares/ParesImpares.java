import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int a = leia.nextInt();

        System.out.println("Digite o segundo numero:");
        int b = leia.nextInt();

        System.out.println(); 
        
        // mostra os PARES
        System.out.println("Numeros pares:");
        for (int i = a; i <= b; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(); 

        // mostra os IMPARES
        System.out.println("Numeros impares:");
        for (int i = a; i <= b; i = i + 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}