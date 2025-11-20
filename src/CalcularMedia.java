
public  class CalcularMedia {
    public static void   mediacalculator (int [][] notas) {
        double mx = 0; 
        double media = 0;
        int bestalumno = 0 ;
        for (int i = 0; i < notas.length;i ++){
            for (int j = 0; j < notas[i].length; j++) {

                 media += notas[i][j];
                 
            }

            media =  (double) media / notas[i].length ; 
            if ( media > mx ) {
                mx = media ; 
                bestalumno = i ;
            } 
            media = 0;
            
        }
        double [] resultado = {mx,bestalumno };
        
        
    
         System.out.printf("El alumno con mejor  es el numero %d, con una media de %.1f" ,bestalumno,mx);
    }
    







public static void main(String[] args) {
    int[][] notas = new int[][]{
            {3,4,5},
            {3,6,5},
            {7,8,5},
            {7,7,5}
    };
   mediacalculator(notas);

}

}