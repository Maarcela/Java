public class Decremento {
    public static void main(String[] args){
        int contador;
        for ( contador = 100; contador > 0; contador--){
            System.out.print(contador + "");
            if(contador% 30 == 0)
                System.out.print("");
        }
    }
}
