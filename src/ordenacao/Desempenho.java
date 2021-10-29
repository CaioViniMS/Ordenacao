package ordenacao;

public class Desempenho {
	public static void compara(int qt, int ht, int it, int mt) {
       if(qt > ht && qt > it && qt > mt) 
    	   System.out.println("\nMenor desempenho: Quicksort");
       else if (ht > it && ht > mt) 
		   System.out.println("\nMenor desempenho: HeapSort");
       else if (it > mt)
    	   System.out.println("\nMenor desempenho: InsertSort");
       else 
    	   System.out.println("\nMenor desempenho: MergeSort");
       
       
       if(qt < ht && qt < it && qt < mt) 
    	   System.out.println("\nMaior desempenho: Quicksort");
       else if (ht < it && ht < mt) 
		   System.out.println("\nMaior desempenho: HeapSort");
       else if (it < mt)
    	   System.out.println("\nMaior desempenho: InsertSort");
       else 
    	   System.out.println("\nMaior desempenho: MergeSort");
       
       
	}
}