import java.util.List;

public abstract class Heroi extends Personagem{
    private int nivel;
    private int experiencia;
    private int expProximoNivel;
    private int sorte;

    public Heroi(String nome, int pontosDeVida, int forca, int nivel, int experiencia, int expProximoNivel, int sorte, Arma arma){
        super(nome, pontosDeVida, forca, arma);
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.expProximoNivel = expProximoNivel;
        this.sorte = sorte;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public int getExperiencia(){
        return experiencia;
    }

    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }

    public int getExpProximoNivel(){
        return expProximoNivel;
    }

    public void setExperienciaProximoNivel(int expProximoNivel){
        this.expProximoNivel = expProximoNivel;
    }

    public int getSorte(){
        return sorte;
    }

    public void setSorte(int sorte){
        this.sorte = sorte;
    }

    protected void subirDeNível(int exp_recebido){
        experiencia += exp_recebido;
        while(experiencia >= expProximoNivel * nivel){
            experiencia -= expProximoNivel * nivel;
            nivel += 1;
            setForca(getForca() + 5);
            setPontosDeVida(getPontosDeVida()+ 15);
            System.out.println(getNome() + " subiu de nível, agora ele está no level " + nivel + ".");
        }
    }
    
    @Override
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println(getNome() + " está no nível " + nivel + ".");
        System.out.println(getNome() + " tem " + nivel + " de experiência.");
    }

    public void equiparArma(Arma novaArma){
        if(nivel >= getArma().getMinNivel()){ 
            if(novaArma.getDano() > getArma().getDano()){
                setArma(novaArma);
                }
        }
    }
    
    public abstract void usarHabilidadeEspecial(Personagem PersonagemAlvo);

    List<AcaoDeCombate> acoes;
}

