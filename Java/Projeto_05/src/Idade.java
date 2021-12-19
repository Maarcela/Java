import java.security.PublicKey;
import java.util.Scanner;
public class Idade {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade, pessoa; double altura, acumuladorAlt = 0, mediaAlt=0;
        for (pessoa=0; pessoa <10; pessoa++){
            System.out.print("Informe a idade, por favor: ");
            idade = entrada.nextInt();
            System.out.print("Agora informe altura, por favor:");
            altura = entrada.nextDouble();
            acumuladorAlt += altura;
        }
        mediaAlt = ( acumuladorAlt / 10);
        System.out.print("A média de altura é:" + mediaAlt);
    }
}
