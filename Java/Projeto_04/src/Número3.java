import java.util.Scanner;
public class Número3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, l=1;
        do {
            System.out.print("Digite um número:");
            num = entrada.nextInt();
            l++;
            if (num < num)
                System.out.print(" O menor seria:" + num);
        } while ( l <= 10);
        entrada.close();
    }
}
