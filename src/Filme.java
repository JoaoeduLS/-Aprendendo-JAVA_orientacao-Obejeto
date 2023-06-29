//Obejetos

public class Filme{
     String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDaAvaliacoes;
    int totalDeAvaliacoes;
    String nomeincluidoNoPlano;
    String duracaoEmMinutos;


    void exibeFichaTecnica(){
        System.out.println("nome do filme:" + nome);
        System.out.println("ano de lancamento:" + anoDeLancamento);
        System.out.println( "o filme tem duracao de:" + duracaoEmMinutos);
        System.out.println("voce possui o plano:" + nomeincluidoNoPlano);

    }


    void avalia(double nota){
        somaDaAvaliacoes += nota;//somando a quantidade de avaliacao    
        totalDeAvaliacoes ++;//contando quantas avaliacoes teve
    }

    ///retorno da media
    double pegaMedia(){
        return somaDaAvaliacoes/ totalDeAvaliacoes;
    }
}