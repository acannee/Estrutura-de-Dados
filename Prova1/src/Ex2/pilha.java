package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class pilha {

	public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1;
        Scanner scanner2;
        Scanner scanner3;
        
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        
        String assistente1 [] = new String [20];
        String assistente2 [] = new String [20];
        String assistente3 [] = new String [20];
        
        scanner1 = new Scanner(new File("C:\\Users/annec/Documents/pilha1.txt"));
        scanner2= new Scanner(new File("C:\\Users/annec/Documents/pilha2.txt"));
        scanner3 = new Scanner(new File("C:\\Users/annec/Documents/pilha3.txt"));
        
        while (scanner1.hasNextLine() && scanner2.hasNextLine() && scanner3.hasNextLine()) {
            stack1.push(scanner1.nextLine());
            stack2.push(scanner2.nextLine());
            stack3.push(scanner3.nextLine());
        }
        
        while(!stack1.empty() && !stack2.empty() && !stack3.empty()) {
			System.out.println("Assistente 1 prato: "+stack1.pop());
			System.out.println("Assistente 2 prato: "+stack2.pop());
			System.out.println("Assistente 3 prato: "+stack3.pop());
		}
	}
	}