public class RatoGigante extends Monstro{
    private int Fraqueza;

    public RatoGigante(String nome, int pontosDeVida, int forca, int xpConcedido, int Fraqueza, Arma arma, Arma listaDeArmasParaLagar[]){
        super(nome, pontosDeVida, forca, xpConcedido, arma, listaDeArmasParaLagar);
        this.Fraqueza = Fraqueza;
    }

    public int getFraqueza(){
        return Fraqueza;
    }

    public void setFraqueza(int Fraqueza){
        this.Fraqueza = Fraqueza;
    }

    @Override
    public void atacar(Personagem Alvo){
        Alvo.receberDano(getForca());
        System.out.println("O Rato Gigante avança, mordendo " + Alvo.getNome() + ".");
        Fraqueza += 1;
        if(Fraqueza > 1){
            Alvo.setPontosDeVida(Alvo.getPontosDeVida() - 1);
            System.out.println(Alvo.getNome() + "está se sentindo fraco");            
        }
        }
}