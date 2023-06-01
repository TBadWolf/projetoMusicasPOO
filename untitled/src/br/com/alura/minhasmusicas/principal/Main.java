package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Bohemian Rhapsody");
        minhaMusica.setArtista("Queen");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.curtir();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 100 ; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 50 ; i++) {
            meuPodcast.curtir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}