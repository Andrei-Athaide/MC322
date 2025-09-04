/*A classe Atirador é um tipo específico de Herói. Ela herda atributos e comportamentos da classe Heroi.*/

public class Atirador extends Heroi{
    private int foco;

    public Atirador(String nome, int pontosDeVida, int forca, int nivel, int experiencia, int foco){
        super(nome, pontosDeVida, forca, nivel, experiencia);
        this.foco = foco;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(foco == 2){
            usarHabilidadeEspecial(Alvo);
        }
        else{
            Alvo.receberDano(forca);
            foco += 1;
            System.out.println(nome + " acerta o monstro com a sua besta.");
        }
    }

     @Override
    public void ganharExperiencia(int exp_recebido){
        experiencia += exp_recebido;
        while(experiencia >= 10){
            experiencia -= 10;
            nivel += 1;
            forca += 10;
            pontosDeVida += 5;
            foco += 1;
            System.out.println(nome + " subiu de nível, agora ele está no level " + nivel + ".");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem PersonagemAlvo){
        PersonagemAlvo.receberDano(2*forca);
        System.out.println(nome + " acerta um ataque crítico no monstro com a sua besta.");
        foco = 0;
    }
}