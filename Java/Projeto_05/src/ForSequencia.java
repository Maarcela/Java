import java.util.Scanner;
public class ForSequencia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num, contador;

        System.out.print("Me informe um número, por favor:");
        num = entrada.nextInt();

        for ( contador = 1; contador <= num; contador++)
            System.out.print( contador + "");
    }
}
