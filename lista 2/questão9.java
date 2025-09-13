import java.util.Scanner;
public class questão9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("informe a base maior do trapézio: ");
        float baseMa=teclado.nextFloat();
        System.out.println("informe a area menor do trapézio: ");
        float baseMe=teclado.nextFloat();
        System.out.println("informe a altura do trapézio: ");
        float altura=teclado.nextFloat();
        teclado.close();
        float area=((baseMa+baseMe)*altura)/2;
        System.out.printf("a area do trapézio é: %.2f", area);
    }
}
