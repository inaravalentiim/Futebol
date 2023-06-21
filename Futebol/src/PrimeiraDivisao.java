
public class PrimeiraDivisao extends Time{
	private int posicao;
    
    public PrimeiraDivisao(String nome2,int qntdMaxSocint ,int posicao){
        super(nome2,qntdMaxSocint);
        this.posicao = posicao;
    }
    
    public int getPosicao(){
        return this.posicao;
    }
    
    public int setPosicao(){
        return this.posicao = posicao; 
    }
    
    public String toString(){
        return super.toString() + " Posição do seu time no ranking nacional é: " + posicao + "º";
    }
}
