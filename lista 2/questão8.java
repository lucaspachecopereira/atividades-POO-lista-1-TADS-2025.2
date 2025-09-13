import java.util.Scanner;
public class questão8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("informe a temperatura em fahrenheit: ");
        float F = teclado.nextFloat();
        teclado.close();
        float C = (F - 32) * 5/9;
        System.out.printf("a temperatura convertida para celsius é: %.2f", C);
    }
}
