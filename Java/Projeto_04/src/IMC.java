import java.util.Scanner;

public class IMC {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        float peso, altura;
        double imc;
        int obesidade = 0, pessoas = 1;

        while (pessoas <= 3){
            System.out.print("Por favor informe a sua altura: ");
            altura = entrada.nextFloat();
            altura ++;
            System.out.print("Por favor informe o seu peso: ");
            peso = entrada.nextFloat();
            peso ++;
            pessoas ++;
            imc = peso / (altura * altura);
            if (imc >= 20 && imc <= 27)
                obesidade += 1;
            System.out.print("Temos no total: " + obesidade + " pessoas que não são considerados como obeso");
        }
        entrada.close();
    }
}
