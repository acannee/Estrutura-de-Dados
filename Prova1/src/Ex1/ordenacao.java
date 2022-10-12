package Ex1;

public class ordenacao {

	public static void main(String[] args) {
		
			int []vetor = new int[10];
	                vetor [0] = 3;
					vetor [1] = 8;
					vetor [2] = 7;
					vetor [3] = 9;
					vetor [4] = 10;
					vetor [5] = 11;
					vetor [6] = 80;
					vetor [7] = 2;
					vetor [8] = 1;
					vetor [9] = 50;
					
			
			int aux;
			
			for(int i=0; i<10; i++){
				for(int j=0; j<9; j++){
					if(vetor[j]> vetor[j+1]){
						aux = vetor[j];
						vetor[j] = vetor[j+1];
						vetor[j+1] = aux;
					}
				}
			}

			System.out.println("Segue a ordenação crescente:");
			for(Integer t:vetor) 
	            System.out.printf("%d \t",t);
			}
	}