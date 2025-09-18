public abstract class Personagem{
    private String nome;
    private int pontosDeVida;
    private int forca;
    private Arma arma;

    public Personagem(String nome, int pontosDeVida, int forca, Arma arma){
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.arma = arma;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPontosDeVida(){
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;
    }

    public int getForca(){
        return forca;
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public Arma getArma(){
        return arma;
    }

    public void setArma(Arma arma){
        this.arma = arma;
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