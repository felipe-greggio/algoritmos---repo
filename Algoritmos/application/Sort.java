
public class Sort {
	
	

	//Método Selection Sort de ordenamento - O(n²)
	public static void selectionSort(int[] vetor) {
		
		
		int indice;
		int menorNumero;
		
		
		for (int i=0; i<vetor.length-1; i++) {
			
			indice = i;
			
			for(int j=i; j<vetor.length; j++) {
				if (vetor[indice]>vetor[j])
					
					indice=j;
			}
			
			menorNumero = vetor[indice];
			vetor[indice] = vetor[i];
			vetor[i] = menorNumero;
			
		}
		
		
			for(int z = 0; z<vetor.length;z++) {
				System.out.print(vetor[z]+" ");
			}
			System.out.println();
	}
	
	//Método Bubble Sort de ordenamento - O(n²)
	public static void bubbleSort(int[] vetor) {
			
		
		int troca;
		
		
		for (int i = 0; i<vetor.length-1; i++) {
			
			for (int j=0; j<vetor.length-1; j++) {
				
				if (vetor[j]>vetor[j+1]) {
					troca=vetor[j];
					vetor[j]=vetor[j+1];
					vetor[j+1]=troca;
				}
			}
		}
		
				 
				for(int z = 0; z<vetor.length;z++) {
					System.out.print(vetor[z]+" ");
				}
				System.out.println();
	}
}
	

