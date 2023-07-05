## Java orientacao a obejto

### Aprendendo a puxa variaveis de outra classes

<p>classe e um arquetipo tipo um modelo e o objeto sao varios Filme=class </p>

<p>nesse trecho do codigo vamos estamos puchando as variaveis do Arquivo Filme </p>

```java
public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();//tipo referencia (caracteristica de atributo)
        ///a parte da direita esta criando e a da esquerda ta puxando
meuFilme.nome = "homem aranha";
System.out.println(meuFilme);
    }
}
```

<p>Ao voce da run no codigo ira aparece no seu terminal um trexo escrito "Filme@4617c264" no caso se referindo a classe principal que e Filme e os numeros o endereço</p>

<p>Para puxa a aplicao no caso a variavel de Filmes com o nome que voce deu precisa coloca assim:</p>

```java
public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();//tipo referencia (caracteristica de atributo)
        ///a parte da direita esta criando e a da esquerda ta puxando
meuFilme.nome = "homem aranha";
System.out.println(meuFilme.nome);//instanciando objetos
    }
}
```

#### Configuerando oque pode ser visto no modificado e visualizando caracteristicas privadas

<p>/*Private para esconder algumas variaveis e transfotma em get */</p>

```
//Obejetos

public class Filme{
     String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDaAvaliacoes;
    private int totalDeAvaliacoes;
    String nomeincluidoNoPlano;
    String duracaoEmMinutos;



    int gettotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


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
```

```
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


        System.out.println("total de avaliacao do filme: "+meuFilme.gettotalDeAvaliacoes()); <---------------
        System.out.println("media do filme: "+meuFilme.pegaMedia());


        }
}

```

### Documentacao JAVA

        https://docs.oracle.com/en/java/

        https://docs.oracle.com/en/java/javase/19/docs/api/index.html
