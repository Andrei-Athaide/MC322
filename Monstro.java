/*A classe Monstro é abstrata. Ela herda de Personagem e adiciona o conceito de XP concedido ao ser derrotado.*/

public abstract class Monstro extends Personagem{
    int xpConcedido;

    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido){
        super(nome, pontosDeVida, forca);
        this.xpConcedido = xpConcedido;
    }

    public void exibirStatus(){
        super.exibirStatus();
        System.out.println(nome + " concede " + xpConcedido + " de XP para o aventureiro.");
    }
}