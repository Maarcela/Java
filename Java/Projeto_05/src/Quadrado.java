public class Quadrado {
    public static void main(String[] args) {
        int num;
        double quadrado;

        for (num = 15; num <= 100; num++) ;
        {
            quadrado = Math.pow(num, 2);
            System.out.println("O quadrado de" + num + "é" + quadrado);
        }
    }
}
