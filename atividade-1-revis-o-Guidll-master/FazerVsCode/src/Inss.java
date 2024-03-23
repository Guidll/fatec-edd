import java.text.DecimalFormat;
import java.util.Scanner;

public class Inss {
    public static double calcularINSS(double salario) {
        double inss = 0;

        if (salario <= 1412.00) {
            inss = salario * 0.075;
        } else if (salario <= 2666.68) {
            inss = salario * 0.09;
        } else if (salario <= 4000.03) {
            inss = salario * 0.12;
        } else {
            inss = salario * 0.14;
        }

        return inss;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o Salário (formato:1.000,00):");
        double salario = scanner.nextDouble();
        
        double inss = calcularINSS(salario);
        double salarioDesconto = salario - inss;

        DecimalFormat moedaReal = new DecimalFormat("#,##0.00");
        String salarioFormatado = moedaReal.format(inss);
        String salarioDescontoFormatado = moedaReal.format(salarioDesconto);

        System.out.println("Funcionário " + nome + " Salário com desconto: " + salarioDescontoFormatado + " | Desconto do INSS: " + salarioFormatado);
    }
}
