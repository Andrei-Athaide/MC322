public abstract class Arma {
    private int dano;
    private int minNivel;
    private String nome;

    public Arma(int dano, int minNivel, String nome){
        this.dano = dano;
        this.minNivel = minNivel;
        this.nome = nome;
    }

    public int getDano(){
        return dano;
    }

    public void setDano(int dano){
        this.dano = dano;
    }

    public int getMinNivel(){
        return minNivel;
    }

    public void setMinNivel(int minNivel){
        this.minNivel = minNivel;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}