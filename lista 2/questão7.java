import java.util.Scanner;
public class questão7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor da prestação: ");
        float valor = teclado.nextFloat();
        System.out.println("informe a percentagem da taxa por atraso: ");
        float taxa = teclado.nextFloat();
        System.out.println("informe o tempo de atraso: ");
        int tempo = teclado.nextInt();
        teclado.close();
        float multa = valor + (valor*(taxa/100)*tempo);
        System.out.printf("o valor final será de: %.2f R$", multa);
    }
}
