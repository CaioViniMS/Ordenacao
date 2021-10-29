package ordenacao;

public class HeapSort {

	public static int tempo(int[] vetor) {
		
		double inicio = System.nanoTime();
		
		heapSort(vetor.length, vetor);
		
		double fim = System.nanoTime();
		
		int tempo = (int) (fim - inicio);
		
		System.out.println("\nTempo de execução: " + tempo + " ns");
		return tempo;
	}
	
	//**********************************************************************************
	// HEAP SORT
	//**********************************************************************************
	public static void heapSort(int tamanho, int vetor[]) {
	    int tam = tamanho;
	    
	    for(int i = tam/2 - 1; i >= 0; i--){
	    	appHeap(vetor, tam, i);
	    }
	    
	    for(int i = tam-1; i > 0; i--){
	        int aux = vetor[0];
	        vetor[0] = vetor[i];
	        vetor[i] = aux;
	        
	        appHeap(vetor, i, 0);
	    }
	    
	    System.out.println("\nValores ordenados pelo Heapsort: ");
	    for(int i = 0; i < vetor.length; i++){
	        System.out.print(vetor[i] + ", ");
	    }
	}
	
	//**********************************************************************************
    // APLICAR HEAP
	//**********************************************************************************
	private static void appHeap(int[] vetor, int tam, int i) {
		int raiz = i;
		int esq = 2*i + 1;
		int dir = 2*i + 2;
		
		if (esq < tam && vetor[esq] > vetor[raiz]) {
			raiz = esq;
		}
		if (dir < tam && vetor[dir] > vetor[raiz]) {
			raiz = dir;
		}
		
		if (raiz != i) {
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz] = aux;
			
			appHeap(vetor, tam, raiz);
		}
	}
}
