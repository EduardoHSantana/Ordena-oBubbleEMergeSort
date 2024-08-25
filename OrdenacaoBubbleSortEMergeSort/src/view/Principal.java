package view;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		OrdenacaoController  oCont = new OrdenacaoController();
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};                  //ECERCÍCIO 1
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};		                      //ECERCÍCIO 2
		int[] vetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};        //ECERCÍCIO 3
		oCont.ordenacaoBubblesort(vetor1);
		oCont.ordenacaoMergesort(vetor1, 0, vetor1.length - 1);
		oCont.ordenacaoBubblesort(vetor2);
		oCont.ordenacaoMergesort(vetor1, 0, vetor2.length - 1);
		oCont.ordenacaoBubblesort(vetor3);
		oCont.ordenacaoMergesort(vetor1, 0, vetor3.length - 1);
		

	}

}
