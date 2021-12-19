import java.util.Scanner;
public class Inverso {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        int tamanho = nomes.length;

        for ( int l = 0; l < tamanho; l++){
            System.out.print(" Informe um nome:");
            nomes[l] = entrada.next();
        }
        System.out.println("-----------------------------");
        System.out.println("Os nomes em ordem inversa seria:");
        for (int l = nomes.length - 1; l >= 0; l--){
            System.out.println(nomes[l]);
        }
        entrada.close();
    }
}
