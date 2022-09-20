package questao1;

public class Lista {

	private Senha primeiraPosicao;
    private Senha ultimaPosicao;
    private int tamanho;

    public Lista(){
        this.tamanho = 0;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void adicionar(int novoVal){
    	Senha newSenha = new Senha(novoVal);
        if (this.primeiraPosicao == null && this.primeiraPosicao == null){
            this.primeiraPosicao = newSenha;
            this.ultimaPosicao = newSenha;
        }
        
        else {
            this.ultimaPosicao.setProximo(newSenha);
            this.ultimaPosicao = newSenha;
        }
        this.tamanho++;
    }
    public int get_valor_na_posicao(int posicao){
    	Senha atual = this.primeiraPosicao;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual.getValor_senha();
    }
}