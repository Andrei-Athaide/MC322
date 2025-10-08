import java.util.Random;

public class Main {
    public static void main(String []args){
        Random Aleatorizador = new Random();
        int numeroHeroi = Aleatorizador.nextInt(2);
        int sorte = Aleatorizador.nextInt(2);

        Espada espadaCurta = new Espada(4, 0, "sua Espada");
        Arco arcoCurto = new Arco(2, 0, "seu Arco Curto");
        
        Fase[] fases = ConstrutorDeCenario.gerarFase(3);

        Heroi classesHerois[] = new Heroi[2];
        classesHerois[0] = new Guerreiro("Jorge", 30, 6, 1, 0, 10, sorte, 0, espadaCurta);
        classesHerois[1] = new Atirador("Giusseppe", 25, 8, 1, 0, 10, sorte, 0, arcoCurto);
        
        
        Heroi heroiSelecionado = classesHerois[numeroHeroi];
        System.out.println(heroiSelecionado.getNome() + " surge para enfrentar o inferno."); 
        

        listaExterna:
        for(int j = 0; j < 3; j++){
            Fase fase = fases[j];
            System.out.println("------------------------------------------------------");               
            System.out.println("Estágio " + fase.nivel + " - " + fase.ambiente);
            System.out.println("------------------------------------------------------");               
            System.out.println("Status de " + heroiSelecionado.getNome());               
            System.out.println("------------------------------------------------------");               
            heroiSelecionado.exibirStatus();
            for(int i = 0; i < 3;i++){
                Monstro monstroSelecionado = fase.monstros[i];
                System.out.println("------------------------------------------------------");               
                System.out.println("INÍCIO DA BATALHA");
                System.out.println("------------------------------------------------------");               
                System.out.println(monstroSelecionado.getNome() + " surge para acabar com o " + heroiSelecionado.getNome() + ".");
                while(heroiSelecionado.getPontosDeVida() > 0 && monstroSelecionado.getPontosDeVida() > 0){
                    heroiSelecionado.atacar(monstroSelecionado);
                    if(monstroSelecionado.getPontosDeVida() > 0){
                        monstroSelecionado.atacar(heroiSelecionado);
                    }
                }
                if(heroiSelecionado.getPontosDeVida() > 0){  
                    heroiSelecionado.subirDeNível(monstroSelecionado.xpConcedido);
                    System.out.println(monstroSelecionado.getNome() + " foi morto pelo " + heroiSelecionado.getNome() + ".");
                    System.out.println("------------------------------------------------------");     
                    System.out.println("FIM DA BATALHA");    
                    System.out.println("------------------------------------------------------");
                    sorte = Aleatorizador.nextInt(2);
                    if(sorte == 1){
                        Arma armaPassada = heroiSelecionado.getArma();
                        heroiSelecionado.equiparArma(monstroSelecionado.largaArma());
                        if(armaPassada != heroiSelecionado.getArma()){
                        System.out.println(heroiSelecionado.getNome() + " guarda " + armaPassada.getNome() + " equipa " + heroiSelecionado.getArma().getNome() + ".");} 
                    }
                    else{
                            System.out.println("O monstro dropa uma arma, mas não é boa o suficiente para " + heroiSelecionado.getNome() + ".");
                    }
                    System.out.println("------------------------------------------------------");     
                    heroiSelecionado.exibirStatus();
                    monstroSelecionado.exibirStatus();
                    if(j == 2 && i == 2){
                        System.out.println("------------------------------------------------------");               
                        System.out.println("O inferno foi destruído e " + heroiSelecionado.getNome() + " é o salvador da humanidade!"); 
                    }
                    
                }
                else{
                    System.out.println("------------------------------------------------------");               
                    heroiSelecionado.exibirStatus();
                    monstroSelecionado.exibirStatus();
                    System.out.println("------------------------------------------------------");               
                    System.out.println(monstroSelecionado.getNome() + " acaba com " + heroiSelecionado.getNome() + ".");
                    System.out.println(heroiSelecionado.getNome() + " se afundou nas profundezas do inferno.");
                    System.out.println("------------------------------------------------------");               
                    System.out.println("GAME OVER");
                    System.out.println("------------------------------------------------------");               
                    break listaExterna;
                        }
                }
        }
    }
}
