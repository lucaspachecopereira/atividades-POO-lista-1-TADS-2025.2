import java.util.Scanner;

public class questão3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor em reais: ");
        float reais = teclado.nextFloat();
        System.out.println("informe a cotação atual do dolar: ");
        float cotação = teclado.nextFloat();
        teclado.close();
        float conversão = reais/cotação;
        System.out.printf("o valor em dólares é: %.2f", conversão);
    }
}
