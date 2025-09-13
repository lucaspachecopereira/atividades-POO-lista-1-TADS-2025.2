import java.util.Scanner;
public class questão10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("tempo: ");
        float tempo=teclado.nextFloat();
        System.out.println("velocidade: ");
        float velocidade=teclado.nextFloat();
        teclado.close();
        float distancia=tempo*velocidade;
        float consumo=distancia/16;
        System.out.printf("o combustivel consumido foram: %.2f litros", consumo);
    }
}
