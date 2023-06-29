//pegando os obejetos


public class Principal {
    public static void main(String[] args){
        Filme  meuFilme = new Filme();//tipo referencia (caracteristica de atributo)
        ///a parte da direita esta criando e a da esquerda ta puxando
        
        meuFilme.nome = "homem aranha";
        meuFilme.anoDeLancamento = 2009;
        meuFilme.nomeincluidoNoPlano = "master";
        meuFilme.duracaoEmMinutos = "2 horas e 40 minutos"; 

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("soma de avaliacao: "+meuFilme.somaDaAvaliacoes);
        System.out.println("total de avaliacao do filme: "+meuFilme.totalDeAvaliacoes);
        System.out.println("media do filme: "+meuFilme.pegaMedia());

        }
}
