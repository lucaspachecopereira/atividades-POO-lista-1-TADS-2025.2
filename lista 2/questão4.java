import java.util.Scanner;
public class questão4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe seu peso: ");
        float peso = teclado.nextFloat();
        System.out.println("informe sua altura: ");
        float altura = teclado.nextFloat();
        teclado.close();
        float IMC = peso /(altura * altura);
        System.out.printf("seu IMC é: %.2f", IMC);
    }
}
