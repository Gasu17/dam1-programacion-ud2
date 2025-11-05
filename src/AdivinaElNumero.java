import java.util.Random;
import java.util.Scanner ; 
public class AdivinaElNumero {

    public static boolean  adivinar(int elegido ,int secreto  ) {
        if (elegido == secreto) {
            return true;
        }
         return false ;  
    } 
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        String x  = "" ; 
        final int MIN = 0 ; 
        final int MAX = 5 ;
        int contador = 1 ;
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        System.out.println("Tienes que adivinar un numero del 0 al 100.");
        
        while (true) {
            System.out.printf("Tu intento: ");
            int intentos = sc.nextInt();
            System.out.println(x);
        if (adivinar(intentos, secreto)) {
            System.out.printf("Felicidades acertaste en %d intentos!", contador);
            break;
        } else if (intentos < secreto) {
            x = "Menor";
        } else {
            x = "Mayor";
        }
        contador ++ ; 
        }
        

        
    }
}
