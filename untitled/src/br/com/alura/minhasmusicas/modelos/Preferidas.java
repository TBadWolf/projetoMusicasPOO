package br.com.alura.minhasmusicas.modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
            System.out.println("Total de curtidas: "+ audio.getTotalCurtidas() );
        }else{
            System.out.println(audio.getTitulo() + " também é um dos que todos estão curtindo");
            System.out.println("Total de curtidas: "+ audio.getTotalCurtidas() );
        }
    }
}
