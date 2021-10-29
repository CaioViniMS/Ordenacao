package ordenacao;

public class Quicksort {
	
	public static int tempo(int[] v) {
	 long tempoInicial = System.nanoTime();
        
	    quickSort(v,0,v.length-1);
        
	    long tempoFinal = System.nanoTime();
	    System.out.println("\n\nValores ordenados pelo quicksort: ");
	    for (int i = 0; i < v.length; i++) {
            System.out.printf(v[i] + ", ");
    }
	    int tempo = (int) (tempoFinal - tempoInicial);
	    System.out.println("\nTempo de execução: " + tempo + " ns");
	    return tempo;
	}
	public static void quickSort(int[] vetor, int inicio, int fim) {
	
        if (inicio < fim) {
               int posicaoPivo = particionar(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
  }

  private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else {
                      int troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }

}
