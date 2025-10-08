public abstract class ConstrutorDeCenario extends Fase{

    public ConstrutorDeCenario(int nivel, String ambiente, Monstro monstros[]){
            super(nivel, ambiente, monstros);
        }

    public static Fase[] gerarFase(int nFases){
        Fase[] listaFases = new Fase[nFases];
        
        Espada espadaCurta = new Espada(5, 1, "seu Gládio");
        Arco arcoCurto = new Arco(3, 1, "seu Arco");
        Anel anelDeBronze = new Anel(4, 1, "seu Anel de Bronze");

        Espada espadaMedia = new Espada(7, 3, "sua Rapiera");
        Arco arcoMedia = new Arco(9, 3, "seu Arco Longo");
        Anel anelDePrata = new Anel(8, 3, "seu Anel de Prata");

        Espada espadaLonga = new Espada(12, 5, "sua Claymore");
        Arco arcoLongo = new Arco(14, 5, "sua Besta");
        Anel anelDeOuro = new Anel(15, 5, "seu Anel de Ouro");
 
        Espada espadaLongaLonga = new Espada(1000, 13 /*referencia a zelda \_(^_^)_/*/, "sua Excalibur");
        Arco arcoLongoLongo = new Arco(28, 7, "sua Longus Longus maximus");
        Anel anelDeDiamante = new Anel(30, 7, "seu Anel de Diamante");

        Arma drop1[] = new Arma[6];
        Arma drop2[] = new Arma[6];
        Arma drop3[] = new Arma[6];

        drop1[0] = espadaCurta;
        drop1[1] = arcoCurto;
        drop1[2] = anelDeBronze;
        drop1[3] = espadaMedia;
        drop1[4] = arcoMedia;
        drop1[5] = anelDePrata;

        drop2[0] = espadaMedia;
        drop2[1] = arcoMedia;
        drop2[2] = anelDePrata;
        drop2[3] = espadaLonga;
        drop2[4] = arcoLongo;
        drop2[5] = anelDeOuro;

        drop3[0] = espadaLonga;
        drop3[1] = arcoLongo;
        drop3[2] = anelDeOuro;
        drop3[3] = espadaLongaLonga;
        drop3[4] = arcoLongoLongo;
        drop3[5] = anelDeDiamante;  

        for(int i = 0; i < nFases; i++){
            int nivel = i + 1;
            String ambiente = "";

            Espada mordida = new Espada(4*nivel, 1*nivel, "mordida");
            Espada tridenteCurto = new Espada(4*nivel, 1*nivel, "tridente");
            Espada laminaCorrente = new Espada(4*nivel, 1*nivel, "correntes laminadas");

            Monstro monstrosFase[] = new Monstro[3];

            if(nivel == 1){
                monstrosFase[0] = new RatoGigante("Rato Gigante", 6, 3, 3, 0, mordida, drop1);
                monstrosFase[1] = new Diabrete("Diabrete", 12, 6, 7, 1, tridenteCurto, drop1);
                monstrosFase[2] = new DiaboAcorrentado("Salazar", 25, 10, 25, 5, 1, laminaCorrente, drop1);
                ambiente = "Entrada do Inferno";
            }
            else if(nivel == 2){
                monstrosFase[0] = new RatoGigante("Rato Infernal", 10, 5, 6, 0, mordida, drop2);
                monstrosFase[1] = new Diabrete("Diabrete Furioso", 16, 10, 14, 1, tridenteCurto, drop2);
                monstrosFase[2] = new DiaboAcorrentado("Balamar", 40, 15, 50, 10, 1, laminaCorrente, drop2);
                ambiente = "Planícies do Inferno";
            }
                
            else if(nivel == 3){ 
                monstrosFase[0] = new RatoGigante("Carniceiro", 20, 10, 12, 1, mordida, drop3);
                monstrosFase[1] = new Diabrete("Diabo Alado", 24, 12, 28, 2, tridenteCurto, drop3);
                monstrosFase[2] = new DiaboAcorrentado("Zohanir", 65, 22, 100, 15, 1, laminaCorrente, drop3);
                ambiente = "Profundezas do Inferno";
            }

        listaFases[i] = new Fase(nivel, ambiente, monstrosFase); 
    }    
        return listaFases;
    }

}
