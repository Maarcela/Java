public class Metade {
    public  static void main (String[] args){
        int contador = 10;
        double num = 2, metade;
        while (contador <= 20){
            metade = contador / num;
            System.out.println( "A metade de " + contador + "é" + metade);
            contador++;
        }
    }
}
