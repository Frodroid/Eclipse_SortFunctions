
public class Sort_logic {

	public Sort_logic() {
		
	}
	
	public void Ausgabe(int a[]) {
		for(int i:a){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println();
		System.out.println();
		
		
	}
	
	public void Sort_QuickSort(int Sort_Zahlen[]) {
		QuickSort qs = new QuickSort(); 
		System.out.println("Zahlen sortiert mit QuickSort:");
		qs.sort(Sort_Zahlen);
		Ausgabe(Sort_Zahlen); 
	}
	
	public void Sort_MergeSort(int Sort_Zahlen[]) {
		MergeSort ms = new MergeSort(); 
		System.out.println("Zahlen sortiert mit MergeSort:");
		ms.sort(Sort_Zahlen);
	    Ausgabe(Sort_Zahlen);
	}
	
	public void Sort_SelectionSort(int Sort_Zahlen[]) {
		SelectionSort sels = new SelectionSort(); 
		System.out.println("Zahlen sortiert mit SelectionSort:");
		sels.doSelectionSort(Sort_Zahlen); 
		Ausgabe(Sort_Zahlen); 
		
	}
	
	public void Sort_InsertionSort(int Sort_Zahlen[]) {
		InsertionSort ins = new InsertionSort(); 
		System.out.println("Zahlen sortiert mit InsertionSort:");
		ins.doInsertionSort(Sort_Zahlen); 
		Ausgabe(Sort_Zahlen); 
	}
	
	public void Sort_BubbleSort(int Sort_Zahlen[]) {
		BubbleSort bs = new BubbleSort(); 
		System.out.println("Zahlen sortiert mit BubbleSort:");
		bs.bubble_srt(Sort_Zahlen);
		Ausgabe(Sort_Zahlen); 
	}

}
