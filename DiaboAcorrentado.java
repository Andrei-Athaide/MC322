/*A classe DiaboAcorrentado é um tipo específico de Monstro. Ela herda atributos e comportamentos da classe Monstro.*/

public class DiaboAcorrentado extends Monstro{
    private int pontosDeEscudo;
    private int Armado;

    public DiaboAcorrentado(String nome, int pontosDeVida, int forca, int xpConcedido, int pontosDeEscudo, int Armado){
        super(nome, pontosDeVida, forca,  xpConcedido);
        this.pontosDeEscudo = pontosDeEscudo;
        this.Armado = Armado;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(Armado == 1){
            System.out.println("O Demônio ascende de seu sono, desecandeado pelo ataque de " + Alvo.nome + ".");
            Alvo.receberDano(forca);
            System.out.println("Sua corrente agora gira, sua lâmina na ponta corta a carne de " + Alvo.nome + ".");
            Armado += 1;
            System.out.println("A criatura aproveita a agonia de " + Alvo.nome + " e trança o restante do metal em seu outro braço, empunhando mais uma lâmina." );
        }
        else{
            Alvo.receberDano(forca * 2);
            System.out.println("As lâminas atingem " + Alvo.nome + " duas vezes.");
        }
    }

    @Override
    public void receberDano(int dano){
        if(pontosDeEscudo > dano){
            pontosDeEscudo = pontosDeEscudo - dano;
        }
        else if(pontosDeEscudo < dano){
            pontosDeVida = pontosDeVida - (dano - pontosDeEscudo);
        }
        else{
            pontosDeEscudo = 0;
        }        
    }
}