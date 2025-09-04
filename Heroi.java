/*A classe Heroi é abstrata.  Ela herda da classe Personagem e adiciona novos atributos e métodos.*/

public abstract class Heroi extends Personagem{
    public int nivel;
    public int experiencia;

    public Heroi(String nome, int pontosDeVida, int forca, int nivel, int experiencia){
        super(nome, pontosDeVida, forca);
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public void ganharExperiencia(int exp_recebido){
        experiencia += exp_recebido;
        if(experiencia >= 10){
            experiencia -= 10;
            nivel += 1;
            forca += 10;
            pontosDeVida += 5;
            System.out.println(nome + " subiu de nível, agora ele está no level " + nivel + ".");
        }
    }

    @Override
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println(nome + " está no nível " + nivel + ".");
        System.out.println(nome + " tem " + experiencia + " de experiência.");
    }

    public abstract void usarHabilidadeEspecial(Personagem PersonagemAlvo);
}

