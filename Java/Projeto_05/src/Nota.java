import java.util.Scanner;
public class Nota {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double num1, num2, mediaAri, acuMediaAri = 0, mediaClasse = 0;  int totalAprov = 0, totalReprov= 0, totalExam=0, aluno;
    for (aluno = 0; aluno <=0; aluno++){
        System.out.print("Informe a primeira nota:");
        num1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota:");
        num2 = entrada.nextDouble();

        mediaAri =((num1 + num2)/ 2);
        acuMediaAri++;
        if (mediaAri <= 3){
            System.out.println("Reprovado");
        } else if (mediaAri > 3 && mediaAri < 10){
        System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
        mediaClasse = acuMediaAri / 6;
        System.out.println("A média da turma é:" + mediaClasse);
    }
    entrada.close();
    }
}
