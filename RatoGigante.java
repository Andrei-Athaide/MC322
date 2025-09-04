public class RatoGigante extends Monstro{
    private int Fraqueza;

    public RatoGigante(String nome, int pontosDeVida, int forca, int xpConcedido, int Fraqueza){
        super(nome, pontosDeVida, forca, xpConcedido);
        this.Fraqueza = Fraqueza;
    }

    @Override
    public void atacar(Personagem Alvo){
        Alvo.receberDano(forca);
        System.out.println("O Rato Gigante avança, mordendo " + Alvo.nome + ".");
        Fraqueza += 1;
        if(Fraqueza > 1){
            Alvo.pontosDeVida -= 1;
            System.out.println(Alvo.nome + "está se sentindo fraco");            
        }
        }
}