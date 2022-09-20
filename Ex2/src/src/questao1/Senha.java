package questao1;

public class Senha {
	
	private int valSenha;
    private Senha proximo;

    public Senha(int novoVal){
        this.valSenha = novoVal;
    }
    public int getValor_senha() {
        return valSenha;
    }
    public void setValor_senha(int valSenha) {
        this.valSenha = valSenha;
    }
    public Senha getProximo() {
        return proximo;
    }
    public void setProximo(Senha proximo) {
        this.proximo = proximo;
    }
}