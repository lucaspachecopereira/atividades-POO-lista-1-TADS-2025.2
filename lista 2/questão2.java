import java.util.Scanner;
public class questão2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a base: ");
        short base = teclado.nextShort();
        System.out.println("informe a altura: ");
        short altura = teclado.nextShort();
        teclado.close();
        int area = (base * altura)/2;
        System.out.printf("a area do triangulo é: %d", area);
    }
}
