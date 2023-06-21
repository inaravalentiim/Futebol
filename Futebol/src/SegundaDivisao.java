
public class SegundaDivisao extends Time{
private int anosSeguidos;
    
    public SegundaDivisao(String nome2,int qntdMaxSocint , int anosSeguidos){
        super(nome2,qntdMaxSocint);
        this.anosSeguidos = anosSeguidos;
    }
    
    public int getAnosSeguidos(){
        return this.anosSeguidos;
    }
    
    public int setAnosSeguidos(){
        return this.anosSeguidos = anosSeguidos;
    }
    
    public String toString(){
        return super.toString() + " Anos seguidos na segunda divisão: " + anosSeguidos;
    }
}
