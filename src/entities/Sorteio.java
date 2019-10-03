package entities;

// ESSA CLASSE REALIZARÁ O SORTEIO

import java.util.Random;

public class Sorteio {
    Random sorteio = new Random();

    public int realizarSorteio(int qtdAlunos) {
        int alunoSorteado = sorteio.nextInt(qtdAlunos) + 1;
        return alunoSorteado;
    }

}
