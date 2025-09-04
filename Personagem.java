/*A classe Personagem é abstrata. Ela serve como modelo para outros tipos de personagens (Heróis, Monstros).*/

public abstract class Personagem{
    String nome;
    int pontosDeVida;
    int forca;

    public Personagem(String nome, int pontosDeVida, int forca){
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
    }

    public void receberDano(int dano){
        pontosDeVida = pontosDeVida - dano;
    }

    public void exibirStatus(){
        System.out.println(nome + " tem "  + pontosDeVida + " pontos de vida.");
        System.out.println(nome + " tem " + forca + " pontos de força.");
    }

    public abstract void atacar(Personagem PersonagemAlvo);
}