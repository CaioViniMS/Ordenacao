package ordenacao;

public class MergeSort {

	public static int tempo(int[] v) {
		 long tempoInicial = System.nanoTime();
	     
		  mergeSort(v.length, v);
	     
		    long tempoFinal = System.nanoTime();
		    System.out.println("\n\nValores ordenados pelo MergeSort: ");
		    for (int i = 0; i < v.length; i++) {
	         System.out.printf(v[i] + ", ");
	 }
		    int tempo = (int) (tempoFinal - tempoInicial);
		    System.out.println("\nTempo de execução: " + tempo + " ns");
		    return tempo;
		}
	
	  private static void mergeSort(int tamanho, int[] vetor) 
	  {

	    int elementos = 1;
	    int inicio, meio, fim;
	    
	    while(elementos < tamanho) 
	    {
	      
	      inicio = 0;
	      
	      while(inicio + elementos < tamanho) 
	      {
	        
	        meio = inicio + elementos;
	        fim = inicio + 2 * elementos;
	        
	        if(fim > tamanho)
	          fim = tamanho;
	        
	        intercala(vetor, inicio, meio, fim);
	        
	        inicio = fim;
	      }
	     
	      elementos = elementos * 2;
	    }
	  }
	  
	
	  private static void intercala(int[] vetor, int inicio, int meio, int fim) 
	  {
	    
	    int novoVetor[] = new int[fim - inicio];
	    int i = inicio;
	    int m = meio;
	    
	    int pos = 0;
	
	    while(i < meio && m < fim)
	    {
	   
	      if(vetor[i] <= vetor[m])
	      {
	        novoVetor[pos] = vetor[i];
	        pos = pos + 1;
	        i = i + 1;
	      
	      } 
	      else 
	      {
	        novoVetor[pos] = vetor[m];
	        pos = pos + 1;
	        m = m + 1;
	      }
	    }
	
	    while(i < meio)
	    {
	      novoVetor[pos] = vetor[i];
	      pos = pos + 1;
	      i = i + 1;
	    }


	    while(m < fim) 
	    {
	      novoVetor[pos] = vetor[m];
	      pos = pos + 1;
	      m = m + 1;
	    }
	
	    for(pos = 0, i = inicio; i < fim; i++, pos++) 
	    {
	      vetor[i] = novoVetor[pos];
	    }
	    
	  }
	
}
