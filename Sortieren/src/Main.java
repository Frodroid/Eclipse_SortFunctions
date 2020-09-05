
public class Main {

	public static void main(String[] args) {
		//von hier soll dann die Sortierung vorgenommen werden!
		Sort_logic Sortieren = new Sort_logic();
		
		int[] Zahlen = { 14, 8, 47, 1, 69, 187, 56, 2, 6, 140, 84, }; 
		System.out.println("Die unsortierten Zahlen sind:");
		Sortieren.Ausgabe(Zahlen); //Gibt die zahlen einmal unsortiert aus!
		
		//Hier ein parametrisierter Aufruf des Programms!
		//Man soll per Parameter sagen, welche Sortierung aufgerufen wird und nur diese wird dann ausgeführt.
		for (int i = 0; i <= args.length - 1; i++) {
			String Sort_Art = args[i]; 
			switch(Sort_Art) {
				case "QuickSort":
					//Ausgabe mit QuickSort 
					Sortieren.Sort_QuickSort(Zahlen); 
					break; 
				case "MergeSort":
					//Ausgabe mit MergeSort
					Sortieren.Sort_MergeSort(Zahlen);
					break; 
				case "SelectionSort":
					//Ausgabe mit SelectionSort
					Sortieren.Sort_SelectionSort(Zahlen);
					break; 
				case "InsertionSort":
					//Ausgabe mit InsertionSort
					Sortieren.Sort_InsertionSort(Zahlen);
					break; 
				case "BubbleSort":
					//Ausgabe mit BubbleSort
					Sortieren.Sort_BubbleSort(Zahlen);
					break;
				case "All": 
					Sortieren.Sort_QuickSort(Zahlen);
					Sortieren.Sort_MergeSort(Zahlen);
					Sortieren.Sort_SelectionSort(Zahlen);
					Sortieren.Sort_InsertionSort(Zahlen);
					Sortieren.Sort_BubbleSort(Zahlen);
					System.out.println("Test");
					break;		
			}	
		}
	}
}
