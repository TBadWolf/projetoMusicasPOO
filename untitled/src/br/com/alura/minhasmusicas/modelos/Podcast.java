package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;
    private String Apresentador;

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String apresentador) {
        Apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}
