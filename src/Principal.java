//pegando os obejetos


public class Principal {
    public static void main(String[] args){
        Filme  meuFilme = new Filme();//tipo referencia (caracteristica de atributo)
        ///a parte da direita esta criando e a da esquerda ta puxando
        meuFilme.nome = "homem aranha";
        meuFilme.anoDeLancamento = 2009;
        /*meuFilme.nomeincluidoNoPlano = "master";
        meuFilme.avaliacao = 5;
        meuFilme.totalDeAvaliacoes = 25;
        meuFilme.duracaoEmMinutos = "1 hora"; */

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDaAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

    }
}
