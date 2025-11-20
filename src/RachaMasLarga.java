public class RachaMasLarga {
    public static int maxRacha(int [] a){
        int maxracha = 1;
        int rachaactual = 1;
        
        if (a.length == 0){
            return 0;
        }
        
        for (int i = 0; i< a.length -1 ;i++) {
            
            if ( a[i] == a[i + 1]) {
                rachaactual ++; 
            if(rachaactual > maxracha) {
                maxracha = rachaactual ;
            }
                
            } else if(a[i] != a[i + 1]) {
                rachaactual = 1;
                
            }
            

           
        }
        


        return maxracha;
    }

    public static void main(String[] args) {
        int [] numero = {1,2,2,2,2,2,2,3,4,1,1,1,1,1,1,1,1} ; 
        System.out.println(maxRacha(numero));
    }
    
}
