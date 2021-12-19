import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior, menor, l, soma = 0;
        double media = 0;
        int[] num = new int[10];
        int tamanho = num.length;
        for (l = 0; l < tamanho; l++) {
            System.out.print("Me informe um número:");
            num[l] = entrada.nextInt();
        }
        maior = num[0];
        menor = num[0];

        for (l = 0; l < tamanho; l++) {
            if (num[l] > maior) {
                maior = num[l];
            }
            if (num[l] < menor) {
                menor = num[l];
            }
            soma = soma + num[l];
            media = (soma / 10);

            System.out.println("------------------------------------");
            System.out.println("O maior número do vetor é: " + maior);
            System.out.println("O menor número do vetor é: " + menor);
            System.out.println("A média dos números do vetor é: " + media);
        }
    }
}


