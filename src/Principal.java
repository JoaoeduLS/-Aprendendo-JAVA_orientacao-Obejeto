import br.com.alura.screematch.modelos.Filme.Filme;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();//tipo referencia (caracteristica de atributo)
        ///a parte da direita esta criando e a da esquerda ta puxando

        meuFilme.setNome("homem aranha");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setNomeincluidoNoPlano( "master");
        meuFilme.setDuracaoEmMinutos(2);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println("total de avaliacao do filme: "+meuFilme.gettotalDeAvaliacoes());
        System.out.println("media do filme: "+meuFilme.pegaMedia());

    }
}
