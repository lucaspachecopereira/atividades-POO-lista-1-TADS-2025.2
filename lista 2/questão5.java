import java.util.Scanner;
public class questão5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o preço do produto: ");
        float preçoOriginal = teclado.nextFloat();
        System.out.println("informe o percentual do desconto: ");
        float percentDesc = teclado.nextFloat();
        teclado.close();
        float ValorDesc = preçoOriginal * (percentDesc/100);
        float novoPreço = preçoOriginal - ValorDesc;
        System.out.printf("o preço final será de: %.2f", novoPreço);
    }
}
