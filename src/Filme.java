//Obejetos

public class Filme{
     String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibeFichaTecnica(){
        System.out.println("nome do filme:" + nome);
        System.out.println("ano de lancamento:" + anoDeLancamento);
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