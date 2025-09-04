import java.util.Random;

public class Main {
    public static void main(String []args){
        // Sistema de aleatorizacao
        Random Aleatorizador = new Random();
        int numeroHeroi = Aleatorizador.nextInt(2);

        // Aloca as classes de herois em um vetor 
        Heroi classesHerois[] = new Heroi[2];
        classesHerois[0] = new Guerreiro("Jorge", 30, 5, 1, 0, 0);
        classesHerois[1] = new Atirador("Giusseppe", 20, 10, 1, 0, 0);
        
        //Aloca as classes de monstros em um vetor
        Monstro classesMonstros[] = new Monstro[3];
        classesMonstros[0] = new RatoGigante("Rato Gigante", 6, 3, 3, 0);
        classesMonstros[1] = new Diabrete("Diabrete", 12, 6, 7, 1);
        classesMonstros[2] = new DiaboAcorrentado("Salazar", 25, 10, 100, 5, 1);
    
        //Randomiza o heroi
        Heroi heroiSelecionado = classesHerois[numeroHeroi];
        System.out.println(heroiSelecionado.nome + " surge para enfrentar o inferno.");

    // Inicio do loop de turnos
    for(int i = 0; i < 3;i++){              
        Monstro monstroSelecionado = classesMonstros[i];
        System.out.println("------------------------------------------------------");               
        System.out.println("INÍCIO DA BATALHA");
        System.out.println("------------------------------------------------------");               
        System.out.println(monstroSelecionado.nome + " surge para acabar com o " + heroiSelecionado.nome + ".");
        // Loop para alternancia de ataques 
        while(heroiSelecionado.pontosDeVida > 0 && monstroSelecionado.pontosDeVida > 0){
            heroiSelecionado.atacar(monstroSelecionado);
            if(monstroSelecionado.pontosDeVida > 0){
                monstroSelecionado.atacar(heroiSelecionado);
            }
        }
        // Condicional para vitoria no turno
        if(heroiSelecionado.pontosDeVida > 0){  
            heroiSelecionado.ganharExperiencia(monstroSelecionado.xpConcedido);
            System.out.println(monstroSelecionado.nome + " foi morto pelo " + heroiSelecionado.nome + ".");
            System.out.println("------------------------------------------------------");     
            System.out.println("FIM DA BATALHA");    
            System.out.println("------------------------------------------------------");               
            heroiSelecionado.exibirStatus();
            monstroSelecionado.exibirStatus();
            System.out.println("------------------------------------------------------");
            // Condicional para se o heroi vencer todos os turnos          
            if(i == 2){
                System.out.println("O inferno foi destruído e " + heroiSelecionado.nome + " é o salvador da humanidade!"); 
            }
        }
        // Condicional para derrota no turno
        else{
            System.out.println("------------------------------------------------------");               
            heroiSelecionado.exibirStatus();
            monstroSelecionado.exibirStatus();
            System.out.println("------------------------------------------------------");               
            System.out.println(monstroSelecionado.nome + " acaba com " + heroiSelecionado.nome + ".");
            System.out.println(heroiSelecionado.nome + " se afundou nas profundezas do inferno.");
            System.out.println("------------------------------------------------------");               
            System.out.println("GAME OVER");
            System.out.println("------------------------------------------------------");               
            break;
            }
        }
    }
}
