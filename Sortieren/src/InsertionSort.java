// http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
 
public class InsertionSort {
 
     
    public void doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){ //Um hier die Zahlen anders herum zu sortieren nur das > Zeichen tauschen.
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
    }
}