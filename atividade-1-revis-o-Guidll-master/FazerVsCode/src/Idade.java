import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade em dias:");
        int idadeDias = scanner.nextInt();

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento = dataAtual.minusDays(idadeDias);

        Period periodo = Period.between(dataNascimento, dataAtual);

        System.out.println("A idade é: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    }
}
