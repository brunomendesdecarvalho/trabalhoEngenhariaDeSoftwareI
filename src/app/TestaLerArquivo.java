package app;

// Para teste das classes já feitas

import entities.Sorteio;
import entities.LerArquivo;

public class TestaLerArquivo {
    public static void main(String[] args) {
        Sorteio sorteio = new Sorteio();
        int sorteado = sorteio.realizarSorteio(45);
        LerArquivo turma = new LerArquivo();
        turma.leitura();
        turma.alunoSorteado(sorteado);


    }

}
