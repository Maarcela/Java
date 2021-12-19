
public class Sequencia {
    public static void main (String[] args){
        int contador = 100;

        while (contador <= 200){
            System.out.println( contador + "");
            if (contador%50 == 0) System.out.println("");
            contador++;
        }
    }
}
