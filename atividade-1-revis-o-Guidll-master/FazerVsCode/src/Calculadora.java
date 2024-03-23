import java.util.Scanner;

public class Calculadora {
    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public static double dividir(double num1, double num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        
        return num1 / num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        resultado = somar(num1, num2);
        System.out.println("O resultado da soma é: " + resultado);

        resultado = subtrair(num1, num2);
        System.out.println("O resultado da subtração é: " + resultado);

        resultado = dividir(num1, num2);
        System.out.println("O resultado da divisão é: " + resultado);

        resultado = multiplicar(num1, num2);
        System.out.println("O resultado da multiplicação é: " + resultado);
    }
}
