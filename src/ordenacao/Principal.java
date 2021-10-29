package ordenacao;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {

		int x = 1000;
		int[] vetor = new int[x];
		System.out.println("Valores não ordenados: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * x);
			System.out.printf(+vetor[i] + ", ");
		}
		int Qtempo = Quicksort.tempo(vetor);
        int Htempo = HeapSort.tempo(vetor);
	    int Itempo = InsertionSort.tempo(vetor);
	    int Mtempo = MergeSort.tempo(vetor);
	    
	    Desempenho.compara(Qtempo, Htempo, Itempo, Mtempo);
	    
	    
	
	}

}
