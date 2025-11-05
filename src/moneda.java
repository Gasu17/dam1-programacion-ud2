import java.util.Scanner ; 

public class moneda {
    public static void devolver(int cantidad) {
        if (cantidad >= 0 ) {
            System.out.println(cantidad);
            cantidad -- ;
            devolver(cantidad) ; 
        } 

        

    }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Dime que numero quieres ");
        int cantidad = sc.nextInt() ;  
        devolver(cantidad);
        

        
        
        
    }
    

    
    
}
