import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados

        int numero_com3_digitos;

        int centena, dezena, unidade;

        System.out.println(" digite aqui um numero com 3 digitos (100 - 999: ");
        numero_com3_digitos = sc.nextInt();

        centena = numero_com3_digitos / 100;

        dezena = numero_com3_digitos % 100 / 10;

        unidade = numero_com3_digitos % 10;


        System.out.println( " o valor invertido fica " + unidade + dezena + centena);




    }
}
