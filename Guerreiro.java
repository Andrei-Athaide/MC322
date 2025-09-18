public class Guerreiro extends Heroi{
    private int furia;

    public Guerreiro(String nome, int pontosDeVida, int forca, int nivel, int experiencia, int expProximoNivel, int sorte, int furia, Arma arma){
        super(nome, pontosDeVida, forca, nivel, experiencia, expProximoNivel, sorte, arma);
        this.furia = furia;
    }

    public int getFuria(){
        return furia;
    }

    public void setFuria(int furia){
        this.furia = furia;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(furia == 50){
            usarHabilidadeEspecial(Alvo);
        }
        else{
        Alvo.receberDano(getForca());
        furia += 25;
        System.out.println(getNome() + " acerta o monstro com " + getArma().getNome() + ".");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem PersonagemAlvo){
        if(getSorte() == 1){
            PersonagemAlvo.receberDano((getForca() + 10) * 2);
            furia = 25;
            System.out.println(getNome() + " acerta um ataque perfeito com " + getArma().getNome() + ".");
            System.out.println(getNome() + " sente que a fúria ainda não se esvaiu de seu corpo.");
        }
        else{
            PersonagemAlvo.receberDano(getForca() + 10);
            furia = 0;
            System.out.println(getNome() + " acerta um ataque crítico " + getArma().getNome() + ".");

        }
    }
}