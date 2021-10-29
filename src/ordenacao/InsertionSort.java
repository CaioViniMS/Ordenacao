package ordenacao;

public class InsertionSort {  
   
	
	
	public static int tempo(int[] v) {
	 long tempoInicial = System.nanoTime();
     
	    insertionSort(v);
     
	    long tempoFinal = System.nanoTime();
	    System.out.println("\n\nValores ordenados pelo InsertSort: ");
	    for (int i = 0; i < v.length; i++) {
         System.out.printf(v[i] + ", ");
 }
	    int tempo = (int) (tempoFinal - tempoInicial);
	    System.out.println("\nTempo de execução: " + tempo + " ns");
	    return tempo;
	}
	
	public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }
}
