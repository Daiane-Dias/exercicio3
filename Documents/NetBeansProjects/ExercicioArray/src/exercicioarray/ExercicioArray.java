/*
 * Este programa exibe valores repetidos de uma array.
 */
package exercicioarray;
/**
 *
 * @author Daiane Dias
 */
public class ExercicioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        int[] arr = new int[]{2,3,4,5,2,1};
        int[] a = new int[]{3};
        int i;
        
       for(i=0;i<=arr.length;i++){
          
            if(arr[i] == arr[i+i]){
            System.out.println("O primeiro vetor repetiu:" +arr[i]);
            
        }
       }
        for(i=0;i<=a.length;i++){
      
            if(a[i] == a[i+i]){ 
            System.out.println("O segundo vetor repetiu:" +a[i]);
            
}
}
       }
}
