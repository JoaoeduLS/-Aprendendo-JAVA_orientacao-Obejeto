package br.com.alura.sreenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal=0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal+= f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal+= s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo Titulo){
        System.out.println("Adiciona a duracao em minutos de "+ Titulo);
        this.tempoTotal+= Titulo.getDuracaoEmMinutos();
    }
}
