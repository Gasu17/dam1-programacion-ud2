import java.util.Arrays;

public class EliminarDuplicados {

    public static int [] eliminardupeados(int[] a) {
        int contador = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                contador++;

            }
            

        }
        int[] resultado = new int[contador];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if ( i == a.length - 1 || a[i] != a[i + 1]) {

                resultado [c] = a[i];
                c++;
                
            }

            
        } 
            return resultado;

    }

    

    public static void main(String[] args) {

        int[] a = {2, 1, 1, 2, 2, 2, 3, 3, 2, 2, 1, 2};

        System.out.println (Arrays.toString(eliminardupeados(a)));

    }

}
