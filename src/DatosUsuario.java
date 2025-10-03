    import java.util.Scanner ;
    import utilidades.ProcesadorTexto ; 
    import utilidades.Usuario ; 
    
    public class DatosUsuario {

        public static void main(String[] args) {

        Scanner sc = new Scanner (System.in) ; 
        System.out.print("Introduce tu nombre de Usuario: ");
        String username = sc.nextLine() ; 
       
        System.out.print("Introduce tu edad: ");
        int age = sc.nextInt() ;

        if (age <= 0 || age>120) {
            System.out.println("Error maquina");
        } 
        sc.nextLine();
        System.out.print("Introduce tu correo electronico: ");
        String mail = sc.nextLine() ;
        
        boolean emailValido = ProcesadorTexto.esEmailValido (mail);
        boolean age
        boolean username 
        


        sc.close();

        


        
     }


    }



