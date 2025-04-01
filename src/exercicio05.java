import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");


        //entrada de dados
        double valor_da_hora, numero_de_horas_trabalhadas, porcentagem_de_desconto, salario_bruto, desconto, salario_liquido;


        System.out.println("o valor da hora é de ");
        valor_da_hora = sc.nextDouble();

        System.out.println(" as horas trabalhadas são de ");
        numero_de_horas_trabalhadas = sc.nextDouble();

        System.out.println(" o desconto é de ");
        porcentagem_de_desconto = sc.nextDouble();

        //processamento de dados
        salario_bruto = valor_da_hora*numero_de_horas_trabalhadas;
        desconto = salario_bruto * porcentagem_de_desconto / 100;
        salario_liquido = salario_bruto - desconto;

        //saida de dados
        System.out.println(" o valor do salario bruto é de " + salario_bruto);
        System.out.println(" Desconto do INSS " + df.format(desconto));
        System.out.println(" salario liquido é de " + df.format(salario_liquido));








    }
}
