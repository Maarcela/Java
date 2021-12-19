import java.util.Scanner;
public class Numero2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1, num;
        System.out.print("Informe um número:");
        num = entrada.nextInt();

        while (contador <= num) {
            System.out.print(contador + "");
            contador += contador;
        }
        entrada.close();
    }
}
