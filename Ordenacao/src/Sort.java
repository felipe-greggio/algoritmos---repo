
public class Sort {
	
		
	//M�todo Selection Sort de ordenamento
	public static void selectionSort(int[] vetor) {
		
		//Vari�veis para guardar o menor n�mero do vetor e o �ndice dele no vetor
		int indice=0;
		int menorNumero;
		
		//Este for percorre o vetor
		for (int i=0; i<vetor.length-1; i++) {
			//
			indice = i;
			//Este � um for aninhado para percorrer o vetor novamente, comparando os n�meros, para localizar o menor n�mero dentro do vetor e qual o seu �ndice
			for(int j=i; j<vetor.length; j++) {
				if (vetor[indice]>vetor[j])
					//localizado o menor n�mero no vetor, ele guarda o �ndice dele na vari�vel
					indice=j;
			}
			// Faz-se a troca entre o n�mero comparado com o menor n�mero localizado, colocando o menor n�mero na frente, ordenando o vetor a cada passada no loop
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
	
	//M�todo Bubble Sort de ordenamento
	public static void bubbleSort(int[] vetor) {
		
		//vari�vel secund�ria para permitir a troca entre os n�meros
		int troca;
		
		// For para percorrer o vetor
		for (int i = 0; i<vetor.length-1; i++) {
			// For para permitir a compara��o entre os n�meros e permitir a troca
			for (int j=0; j<vetor.length-1; j++) {
				//Checa a condi��o, se o n�mero anterior no vetor for menor do que o n�mero imediatamente pr�ximo, ent�o estes dois n�meros est�o desordenados 
				// e � feita a troca entre eles, com os maiores n�meros "borbulhando" para as �ltimas posi��es (da� o nome bubblesort)
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

