import java.util.Scanner;
public class questão1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a primeira nota: ");
        byte nota1 = teclado.nextByte();
        System.out.println("informe a segunda nota: ");
        byte nota2 = teclado.nextByte();
        System.out.println("informe a terceira nota: ");
        byte nota3 = teclado.nextByte();
        System.out.println("informe a quarta nota: ");
        byte nota4 = teclado.nextByte();
        teclado.close();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println(media);
    }
}