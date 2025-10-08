public class Atirador extends Heroi{
    private int foco;

    public Atirador(String nome, int pontosDeVida, int forca, int nivel, int experiencia, int expProximoNivel, int sorte, int foco, Arma arma){
        super(nome, pontosDeVida, forca, nivel, experiencia, expProximoNivel, sorte, arma);
        this.foco = foco;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(foco >= 2){
            usarHabilidadeEspecial(Alvo);
        }
        else{
            Alvo.receberDano(getForca());
            foco += 1;
            System.out.println(getNome() + " acerta o monstro com " + getArma().getNome() + ".");
        }
    }
    
    @Override
    public void usarHabilidadeEspecial(Personagem PersonagemAlvo){
        if(getSorte() == 1){ 
            PersonagemAlvo.receberDano(getForca());
            PersonagemAlvo.setPontosDeVida( (PersonagemAlvo.getPontosDeVida()) / 2);
            System.out.println(getNome() + " acerta um ataque perfeito no monstro com " + getArma().getNome() + ".");
            System.out.println(PersonagemAlvo.getNome() + " jorra sangue pela sua ferida.");
            foco = 1;
        }
        else{
            PersonagemAlvo.receberDano(2*getForca());
            System.out.println(getNome() + " acerta sua habilidade especial no monstro com " + getArma().getNome() + ".");
            foco = 0;
        }
    }
}