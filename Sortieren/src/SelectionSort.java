// http://www.java2novice.com/java-sorting-algorithms/selection-sort/

public class SelectionSort {
 
    public void doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) //Um hier die Zahlen anders herum zu sortieren nur das > Zeichen tauschen. 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}