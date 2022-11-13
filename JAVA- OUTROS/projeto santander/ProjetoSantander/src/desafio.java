import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();

        if (valor < 0 || valor > 100) {

            System.out.println("Fora de intervalo");
        } else if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo (0,25)");
        } else if (valor >= 25 && valor <= 50) {
            System.out.println("Intervalo (25,50)");
        } else if (valor >= 50 && valor <= 75) {
            System.out.println("Intervalo (50,75)");
        } else if (valor >= 75 && valor <= 100) {
            System.out.println("Intervalo (75,100)");
        }

    }
}
