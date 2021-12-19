import java.util.Scanner;
public class ImparePares {
    public static void main (String[] args){
        int numPar = 0, numImpar = 0, num = 1,numDigite;
        Scanner entrada = new Scanner(System.in);
        while (num <= 10){
            System.out.print("Me Informe um número:");
            numDigite = entrada.nextInt();
            num++;

            if (numDigite%2 != 0)
                numImpar = numImpar + 1;
            if (numDigite%2 == 0)
                numPar = numPar + 1;
        }
        System.out.println("Temos: " + numImpar + "números Impares");
        System.out.println("Temos:" + numPar + "npumero Pares");
        entrada.close();
    }
}
