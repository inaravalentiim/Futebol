
public class Main {
public static void main(String[] args){
        
        System.out.println(" Digite aqui uma quantidade de times que deseja inserir: ");
        int numTime = Teclado.leInt();
        
        while (numTime <= 0 || numTime > 50){    
            System.out.println(" Por favor, digite uma quantidade válida de times (entre 1 e 50). ");
            numTime = Teclado.leInt();
        }
        Time times[] = new Time[numTime];
        
        String nome2;
        int qntdMaxSoc;
        int posicao;
        int anosSeguidos;
        
        for (int i=0; i < numTime; i++){
            
            int sorteio = (int)(Math.random() * 2) + 1;
            
            if (sorteio == 1){
                nome2 = Teclado.leString(" Coloque aqui o nome do seu time: ");
                
                System.out.println(" Seu time faz parte da primeira divisão!");
                
                qntdMaxSoc = Teclado.leInt(" Coloque aqui a quantidade de sócios do clube: ");
                posicao = Teclado.leInt(" Coloque aqui a posição no ranking nacional do time: ");
                
                times[i] = new PrimeiraDivisao (nome2,qntdMaxSoc,posicao);
            }
            else if(sorteio ==2){
                nome2 = Teclado.leString(" Coloque aqui o nome do seu time: ");
                
                System.out.println(" Seu time faz parte da segunda divisão!");
                
                qntdMaxSoc = Teclado.leInt(" Coloque aqui a quantidade de sócios do clube: ");
                anosSeguidos = Teclado.leInt (" Coloque aqui a quantidade de anos que seu time se encontra na segunda divisão: ");
                
                times[i] = new SegundaDivisao(nome2,qntdMaxSoc,anosSeguidos);
            }
        }
    
        
        for (int i = 0; i < times.length; i++){
            System.out.println(" Insira aqui os sócios do time: " + times[i].getNome2());
            
            for (int cont = 0; cont < 20; cont++){
                String nome1 = Teclado.leString(" Coloque aqui o nome do seu sócio: ");
                int idade = Teclado.leInt(" Coloque a idade do seu sócio: ");
                
                Socio novoSocio = new Socio(nome1, idade);
                if (times[i].insereSocio(novoSocio))
                    System.out.println(" Seu sócio foi inserido com sucesso! ");
                else
                    System.out.println(" Seu sócio não foi inserido com sucesso :( ");
            }
        }
        
        System.out.println("As informações dos seus times são:\n");
        for (int i = 0; i < times.length; i++){
            System.out.println(times[i].toString());
        }
        
        System.out.println(" As informações dos seus sócios são:\n ");
        for (int i = 0; i < times.length; i++){
            System.out.println(" Os sócios do time: " + times[i].getNome2() + " são:\n");
            times[i].imprimeSocio();
        }  
        
        for (int i = 0; i < times.length; i++){
            System.out.println(times[i].getNome2() + ": " + times[i].socioMaisVelho() + " é o sócio mais velho.");
        }
        
        
        Time[] timesPrimeira = new Time[numTime];
        
        for (int i = 0; i < times.length; i++){
            if (times[i] instanceof PrimeiraDivisao){
                timesPrimeira[i] = times[i];
            }
        }
        
        Time melhor = timesPrimeira[0];
        for(int i = 1; i < times.length; i++){
            if (((PrimeiraDivisao)timesPrimeira[i]).getPosicao() < ((PrimeiraDivisao)melhor).getPosicao()){
                melhor = timesPrimeira[i];
            }
        }
        
        System.out.println(" O time melhor colocado é: " + melhor.toString()); 
    }
}
