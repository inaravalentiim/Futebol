
public class Time {
	private String nome2;
    private Socio[] arraySocio;
    
    public Time(String nome2,int qntdMaxSoc){
        this.nome2 = nome2;
        this.arraySocio = new Socio[qntdMaxSoc];
    }
    
    public String getNome2(){
        return this.nome2;
    }
    
    public Socio[] getArraySocio(){
        return this.arraySocio;
    }
    
    public void setNome2(String nome2){
        this.nome2 = nome2;
    }
    
    public void setArraySocio(Socio[] arraySocio){
        this.arraySocio = arraySocio;
    }
    
    public String toString(){
        return " Nome:  " + nome2 + "  Sócio:  " + arraySocio.length;
    }
    
    public boolean insereSocio(Socio socioNovo){
        for (int i = 0; i < arraySocio.length; i++) {
            if (arraySocio[i] == null) {
                arraySocio[i] = socioNovo;
                return true;
            }
        }
        return false;
    } 
    
    public String socioMaisVelho(){
        Socio velho = arraySocio[0];
        for (int i = 0; i < arraySocio.length ; i++){
            if (arraySocio[i].getIdade() > velho.getIdade()){
                velho = arraySocio[i]; 
            }
        }
    
        return " O sócio mais velho é: " + velho.getNome1();
    }
    
    public void imprimeSocio(){
        for (int i = 0; i < arraySocio.length; i++)
            System.out.println(arraySocio[i].toString());
    }
}
