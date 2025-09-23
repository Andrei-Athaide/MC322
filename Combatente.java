public interface Combatente {
    public String getNome();
    public int estaVivo();
    public void receberDano(int dano);
    public void receberCura(int cura);
    public void escolherAcao(Combatente alvo);
}
