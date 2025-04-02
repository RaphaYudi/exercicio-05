import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados

        int valor_com3_digitos, numero_da_dezena;

        //processamento

        System.out.println(" digite o numero com 3 digitos (100 - 999): ");
        valor_com3_digitos = sc.nextInt();

        numero_da_dezena = valor_com3_digitos/10%10;

        //saida

        System.out.println(" a dezena do numero digitado é " + numero_da_dezena);





    }
}
