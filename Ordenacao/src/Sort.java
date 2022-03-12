
public class Sort {
	
		
	//Método Selection Sort de ordenamento
	public static void selectionSort(int[] vetor) {
		
		//Variáveis para guardar o menor número do vetor e o índice dele no vetor
		int indice=0;
		int menorNumero;
		
		//Este for percorre o vetor
		for (int i=0; i<vetor.length-1; i++) {
			//
			indice = i;
			//Este é um for aninhado para percorrer o vetor novamente, comparando os números, para localizar o menor número dentro do vetor e qual o seu índice
			for(int j=i; j<vetor.length; j++) {
				if (vetor[indice]>vetor[j])
					//localizado o menor número no vetor, ele guarda o índice dele na variável
					indice=j;
			}
			// Faz-se a troca entre o número comparado com o menor número localizado, colocando o menor número na frente, ordenando o vetor a cada passada no loop
			menorNumero = vetor[indice];
			vetor[indice] = vetor[i];
			vetor[i] = menorNumero;
			
		}
		
		// Imprime o vetor ordenado agora
			for(int z = 0; z<vetor.length;z++) {
				System.out.print(vetor[z]+" ");
			}
			System.out.println();
	}
	
	//Método Bubble Sort de ordenamento
	public static void bubbleSort(int[] vetor) {
		
		//variável secundária para permitir a troca entre os números
		int troca;
		
		// For para percorrer o vetor
		for (int i = 0; i<vetor.length-1; i++) {
			// For para permitir a comparação entre os números e permitir a troca
			for (int j=0; j<vetor.length-1; j++) {
				//Checa a condição, se o número anterior no vetor for menor do que o número imediatamente próximo, então estes dois números estão desordenados 
				// e é feita a troca entre eles, com os maiores números "borbulhando" para as últimas posições (daí o nome bubblesort)
				if (vetor[j]>vetor[j+1]) {
					troca=vetor[j+1];
					vetor[j+1]=vetor[j];
					vetor[j]=troca;
				}
			}
		}
		
		// Imprime o vetor ordenado agora
		for(int z = 0; z<vetor.length;z++) {
			System.out.print(vetor[z]+" ");
		}
		System.out.println();
	}
}

