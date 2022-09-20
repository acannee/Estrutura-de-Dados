package questao1;

public class Main {

	public static void main(String[] args) {
		
		Lista fila_normal = new Lista();
        Lista fila_prioridade = new Lista();



        for(int i=0; i < 200; i++) {
            if(i%2==0){
                fila_normal.adicionar(i);
            }else{
                fila_prioridade.adicionar(i);
            }
        }

        for(int i=0; i < fila_prioridade.getTamanho(); i++) {
            System.out.println(fila_prioridade.get_valor_na_posicao(i));
        }


    }


}