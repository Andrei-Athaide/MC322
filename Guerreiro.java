/*A classe Guerreiro é um tipo específico de Herói. Ela herda atributos e comportamentos da classe Heroi.*/

public class Guerreiro extends Heroi{
    private int furia;

    public Guerreiro(String nome, int pontosDeVida, int forca, int nivel, int experiencia, int furia){
        super(nome, pontosDeVida, forca, nivel, experiencia);
        this.furia = furia;
    }

    @Override
    public void atacar(Personagem Alvo){
        if(furia == 50){
            usarHabilidadeEspecial(Alvo);
        }
        else{
        Alvo.receberDano(forca);
        furia += 25;
        System.out.println(nome + " ataca o monstro com sua espada.");
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
            furia += 25;
            System.out.println(nome + " subiu de nível, agora ele está no level " + nivel + ".");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem PersonagemAlvo){
        PersonagemAlvo.receberDano(forca + 10);
        System.out.println(nome + " acerta um ataque crítico no monstro com a sua espada.");
        furia = 0;
    }
}