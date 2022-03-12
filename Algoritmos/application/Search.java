
public class Search {
	
	
	
	//M�todo de busca bin�ria - O(n*log(n))
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
				
				System.out.println("O n�mero "+ numero+" est� no �ndice "+indiceMeio +".");
				return;
			}	
		}
		System.out.println("O n�mero n�o se encontra no array");
	}
}
