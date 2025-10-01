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



        if (age <= 0 || age>120) {
            System.out.println("Edad invalida");
        } else {
                if (username.length() < 2 || username.length()> 25 ) {
                    System.out.println("Nombre invalido");

                } else {
                    

                if (emailValido )  {
                System.out.println("Usuario creado: ");

                Usuario usuario = new Usuario(username, age, mail) ;
                usuario.mostrarInformacion();
            } 
            

             }
            
           


        }

        
        else {

            System.out.println("El usuario no puede ser creado porque el email introducido no es válido, espabila");
        }




        sc.close();

        


        
     }


    }



