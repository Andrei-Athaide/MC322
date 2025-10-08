public class Diabrete extends Monstro{
    private int Mana;

    public Diabrete(String nome, int pontosDeVida, int forca, int xpConcedido, int Mana, Arma arma, Arma listaDeArmasParaLagar[]){
        super(nome, pontosDeVida, forca,  xpConcedido, arma, listaDeArmasParaLagar);
        this.Mana = Mana;
    }

    public int getMana(){
        return Mana;
    }
    
    public void setMana(int mana){
        this.Mana = mana;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(Mana >= 1){
            Alvo.receberDano(getForca() + 3);
            Mana -= 1;
            System.out.println("O Diabrete cospe uma bola de fogo em " + Alvo.getNome() + ".");
        }
        else{
            Alvo.receberDano(getForca());
            Mana += 1;
            System.out.println("O Diabrete avança em " + Alvo.getNome() + ", dilacerando sua pele.");
        }
    }
}