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
