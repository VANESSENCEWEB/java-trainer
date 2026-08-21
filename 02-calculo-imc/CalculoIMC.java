import java.util.Scanner;
 
public class CalculoIMC {
public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

System.out.println("Vamos calcular o seu IMC?");

System.out.println("Digite o seu peso (kg):");
double peso = leia.nextDouble();

System.out.println("Digite a sua altura (m):");
double altura = leia.nextDouble();

double imc = peso / (altura * altura);
// VALORES IMC
// Abaixo de 18.5 - Abaixo do Peso
// 18.5 a 24.9 - Peso normal
// 25 a 29.9 - Sobrepeso
// 30 a 34.9 - Obesidade grau I
// 35 a 39.9 - Obesidade grau II
// 40 ou mais - Obesidade grau III

System.out.println("Seu IMC é: "+ imc);
 if (imc < 18.5) {
    System.out.println("Você está abaixo do peso");

 } else if (imc < 25) {
    System.out.println("Peso normal");

} else if (imc < 30) {
    System.out.println("Sobrepeso");

} else if (imc < 35) {
    System.out.println("Obesidade grau I");

} else if (imc < 40) {
    System.out.println("Obesidade grau II");

} else {
    System.out.println("Obesidade grau III");

}
  }

}
