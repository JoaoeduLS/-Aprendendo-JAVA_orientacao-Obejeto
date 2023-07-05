package br.com.alura.screematch.modelos.Filme;

public class Filme{
    private String nome;
    private int anoDeLancamento;
    private  boolean incluidoNoPlano;
    private double somaDaAvaliacoes;
    private int totalDeAvaliacoes;
    private String nomeincluidoNoPlano;
    private int duracaoEmMinutos;

    /*Private para esconder algumas variaveis e transfotma em get */


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNomeincluidoNoPlano() {
        return nomeincluidoNoPlano;
    }

    public int gettotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNomeincluidoNoPlano(String nomeincluidoNoPlano) {
        this.nomeincluidoNoPlano = nomeincluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do filme:" + nome);
        System.out.println("ano de lancamento:" + anoDeLancamento);
        System.out.println( "o filme tem duracao de:" + duracaoEmMinutos + "horas");
        System.out.println("voce possui o plano:" + nomeincluidoNoPlano);

    }


    public void avalia(double nota){
        somaDaAvaliacoes += nota;//somando a quantidade de avaliacao
        totalDeAvaliacoes ++;//contando quantas avaliacoes teve
    }

    ///retorno da media
    public double pegaMedia(){
        return somaDaAvaliacoes/ totalDeAvaliacoes;
    }
}
