public class Principal {
    public static void main(String[] args){
        Filme  meuFilme = new Filme();//tipo referencia (caracteristica de atributo)
        ///a parte da direita esta criando e a da esquerda ta puxando
meuFilme.nome = "homem aranha";
meuFilme.anoDeLancamento = 2009;
meuFilme.nomeincluidoNoPlano = "master";
meuFilme.avaliacao = 5;
meuFilme.totalDeAvaliacoes = 25;
meuFilme.duracaoEmMinutos = "1 hora";

System.out.println(meuFilme.nome);
System.out.println(meuFilme.anoDeLancamento);
System.out.println(meuFilme.nomeincluidoNoPlano);
System.out.println(meuFilme.avaliacao);
System.out.println(meuFilme.totalDeAvaliacoes );
System.out.println(meuFilme.duracaoEmMinutos );


    }
}
