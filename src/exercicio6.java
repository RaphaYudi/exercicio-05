import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Entrada de dados

        double y, x;

        //processamento

        System.out.println("informe o valor de X ");

        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 1.0 / 2));

        System.out.println(" y = " + y);

    }
}
