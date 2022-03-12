
public class Search {
	
	
	
	//Método de busca binária - O(n*log(n))
	public static void bynarySearch (int[] lista, int numero) {
		
		int indiceInferior = 0;
		int indiceSuperior = lista.length - 1;
				
		while (indiceInferior <= indiceSuperior) {
			
			int indiceMeio = (indiceInferior + indiceSuperior)/2;
			
			if(numero > lista[indiceMeio]) {
				
				indiceInferior = indiceMeio + 1;
			}			
			
			else if (numero < lista[indiceMeio]) {
				
				indiceSuperior = indiceMeio - 1;
			}
			else if (numero == lista[indiceMeio]){
				
				System.out.println("O número "+ numero+" está no índice "+indiceMeio +".");
				return;
			}	
		}
		System.out.println("O número não se encontra no array");
	}
}
