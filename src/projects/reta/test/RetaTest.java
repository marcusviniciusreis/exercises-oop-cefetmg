package projects.reta.test;
import projects.reta.domain.Reta;
import java.util.Scanner;

public class RetaTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de m: ");
        double m = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        Reta reta = new Reta(m, b);
        reta.mostrarPontos();
        scanner.close();
    }
}
