import java.util.Scanner;
public class questão6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a altura: ");
        float altura = teclado.nextFloat();
        System.out.println("informe o comprimento: ");
        float  comprimento = teclado.nextFloat();
        System.out.println("informe a largura: ");
        float largura = teclado.nextFloat();
        teclado.close();
        float volume = comprimento * largura * altura;
        System.out.printf("o volume da caixa é: %f", volume);
    }
}
