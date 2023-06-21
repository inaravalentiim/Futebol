
public class Socio {
	private String nome1;
    private int idade;
    
    public Socio(String nome1, int idade){
        this.nome1 = nome1;
        this.idade = idade;
    }
    
    public String getNome1(){
        return this.nome1;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String toString(){
        return " Nome: " + this.nome1 + " Idade: " + this.idade;
    }
}
