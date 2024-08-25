package controller;

import br.edu.fatec.bubblesort.BubbleSortController;
import br.edu.fateczl.mergesort.MergeSortController;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
		
	}
    public void ordenacaoBubblesort(int [] vetor) {
    	BubbleSortController oCont = new BubbleSortController();

    	vetor = oCont.bubbleSort(vetor);	
		
		System.out.println("====================================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("====================================");

    }
    public void ordenacaoMergesort(int[]vetor, int inicio, int fim) {
    	MergeSortController oCont = new MergeSortController();
    	vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
    }
}


