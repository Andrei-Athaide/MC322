
import java.util.List;
import java.util.Random;

public abstract class Monstro extends Personagem implements Lootavel{
    int xpConcedido;
    Arma listaDeArmasParaLargar[];

    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido, Arma arma, Arma listaDeArmasParaLagar[]){
        super(nome, pontosDeVida, forca, arma);
        this.xpConcedido = xpConcedido;
        this.listaDeArmasParaLargar = listaDeArmasParaLagar;
    }

    public int getXpConcedido(){
        return xpConcedido;
    }

    public void setXpConcedido(int xpConcedido){
        this.xpConcedido = xpConcedido;
    }

    public Arma[] getListaDeArmasParaLargar(){
        return listaDeArmasParaLargar;
    }

    public void setListaDeArmasParaLargar(Arma[] listaDeArmasParaLargar){
        this.listaDeArmasParaLargar = listaDeArmasParaLargar;
    }

    public void exibirStatus(){
        super.exibirStatus();
        System.out.println(getNome() + " concede " + xpConcedido + " de XP para o aventureiro.");
    }

    public Arma largaArma(){
        Random Aleatorizador = new Random();
        int numArma = Aleatorizador.nextInt(6);
        return listaDeArmasParaLargar[numArma];
    }

    public void droparLoot(){
        
    }

    List<AcaoDeCombate> acoes;
}