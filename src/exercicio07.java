import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.000");

        //Entrada de dados

        double y, x, aux;

        System.out.println(" Coloque o valor de X ");

        x = sc.nextDouble();

        aux = (Math.pow(x, 4) - 1) / (2 * Math.pow(x, 2));

        y = Math.sqrt(1 + aux * aux) - Math.pow(x,2) / 2;

        System.out.println(" O valor de Y é de " + df.format(y));
    }
}
