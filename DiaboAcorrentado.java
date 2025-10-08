public class DiaboAcorrentado extends Monstro{
    private int pontosDeEscudo;
    private int Armado;

    public DiaboAcorrentado(String nome, int pontosDeVida, int forca, int xpConcedido, int pontosDeEscudo, int Armado, Arma arma, Arma lisArmasDeArmasParaLagar[]){
        super(nome, pontosDeVida, forca,  xpConcedido, arma, lisArmasDeArmasParaLagar);
        this.pontosDeEscudo = pontosDeEscudo;
        this.Armado = Armado;
    }

    public int getPontosDeEscudo(){
        return pontosDeEscudo;
    }

    public void setPontosDeEscudo(int pontosDeEscudo){
        this.pontosDeEscudo = pontosDeEscudo;
    }

    public int getArmado(){
        return Armado;
    }

    public void setArmado(int Armado){
        this.Armado = Armado;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(Armado == 1){
            System.out.println("O Demônio ascende de seu sono, desecandeado pelo ataque de " + Alvo.getNome() + ".");
            Alvo.receberDano(getForca());
            System.out.println("Sua corrente agora gira, sua lâmina na ponta corta a carne de " + Alvo.getNome() + ".");
            Armado += 1;
            System.out.println("A criatura aproveita a agonia de " + Alvo.getNome() + " e trança o restante do metal em seu outro braço, empunhando mais uma lâmina." );
        }
        else{
            Alvo.receberDano(getForca() * 2);
            System.out.println("As lâminas atingem " + Alvo.getNome() + " duas vezes.");
        }
    }

    @Override
    public void receberDano(int dano){
        if(pontosDeEscudo > dano){
            pontosDeEscudo = pontosDeEscudo - dano;
        }
        else if(pontosDeEscudo < dano){
            setPontosDeVida(getPontosDeVida() - (dano - pontosDeEscudo));
        }
        else{
            pontosDeEscudo = 0;
        }        
    }
}