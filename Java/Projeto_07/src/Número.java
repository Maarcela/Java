import java.util.Scanner;
public class Número {
    public  static  void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int palpite;
        System.out.println("Informe seu palpite:");
        palpite = entrada.nextInt();
        if (palpite == 15){
            System.out.println("Você acertou!");
        } else {
            if (palpite < 15){
                System.out.println("Seu palpite está menor, tente novamente!");
            } else {
                System.out.println("Seu palpite está acima, tente novamente");
            }
            entrada.close();
        }
    }
}
