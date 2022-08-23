package questao1;

import java.util.Scanner;
import java.util.Random;	

public class buscaSequencial {

public static void main(String[] args) {
	
				Scanner ler = new Scanner (System.in);
				int controle = -1; 
				
				int [] vetor  = new int [10]; 				
				
				Random randomico = new Random ();
				
				 for(int i=0;i< 10;i++){
			            vetor[i]= randomico.nextInt(999);
			        }
				 
				 for(int i : vetor) {
					 System.out.print(i +" , ");
				        }
				 
				 System.out.println("\nDigite Posicao");
				 int num = ler.nextInt();	
				 
			        
				for(int i=0; i<10; i++) {
						
					if(vetor[i]==num) {
						System.out.println("Valor encontrado na posição "+ i);
						controle = 7;
						break;	
					}
						
			        }

				if(controle == -1){
					System.out.printf("Valor não identificado");
					}
			        
			        
			    }
			}