package br.com.alura.screenmatch.modelos;

/// extends serve para fazer heranca titulo serve para filme
public class Filme extends Titulo{
private  String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}