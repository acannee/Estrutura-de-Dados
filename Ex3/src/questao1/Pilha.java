package questao1;

import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Pilha {

		public static void main(String[] args) throws FileNotFoundException {
			Stack<String> pilha = new Stack<String>(); 
			String vetor[] = new String[10]; 
				
			Scanner scanner;
			scanner = new Scanner(new File("C:\\Users/Suporte 02/Documents/Teste.txt")) ;

			while(scanner.hasNextLine()) {
				pilha.push(scanner.nextLine());
			}
				
			for(int i = 0; i < vetor.length; i++) {
				vetor [i] = (String) pilha.pop();
				System.out.println(vetor[i]);
			}
			while(!pilha.empty()) {
				System.out.println(pilha.pop());
			}
					
		}
	}

	