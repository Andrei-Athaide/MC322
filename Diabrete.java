/*A classe Diabrete é um tipo específico de Monstro. Ela herda atributos e comportamentos da classe Monstro.*/

public class Diabrete extends Monstro{
    private int Mana;

    public Diabrete(String nome, int pontosDeVida, int forca, int xpConcedido, int Mana){
        super(nome, pontosDeVida, forca,  xpConcedido);
        this.Mana = Mana;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(Mana >= 1){
            Alvo.receberDano(forca + 3);
            Mana -= 1;
            System.out.println("O Diabrete cospe uma bola de fogo em " + Alvo.nome + ".");
        }
        else{
            Alvo.receberDano(forca);
            Mana += 1;
            System.out.println("O Diabrete avança em " + Alvo.nome + ", dilacerando sua pele.");
        }
    }
}