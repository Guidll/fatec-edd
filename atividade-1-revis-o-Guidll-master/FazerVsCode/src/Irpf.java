import java.text.DecimalFormat;
import java.util.Scanner;

public class Irpf {
    public static double calcularIrpf(double salario) {
        double irpf = 0;

        if (salario <= 2259.20) {
            irpf = salario;
        } else if (salario <= 2826.65) {
            irpf = salario * 0.075;
        } else if (salario <= 3751.05) {
            irpf = salario * 0.15;
        } else if (salario <= 4664.68) {
            irpf = salario * 0.2255;
        } else {
            irpf = salario * 0.275;
        }

        return irpf;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o Salário (formato:1.000,00):");
        double salario = scanner.nextDouble();
        
        double irpf = calcularIrpf(salario);
        double salarioDesconto = salario - irpf;

        DecimalFormat moedaReal = new DecimalFormat("#,##0.00");
        String salarioFormatado = moedaReal.format(irpf);
        String salarioDescontoFormatado = moedaReal.format(salarioDesconto);

        System.out.println("Funcionário " + nome + " | Salário com desconto: " + salarioDescontoFormatado + " | Desconto do irpf: " + salarioFormatado);
    }
}
