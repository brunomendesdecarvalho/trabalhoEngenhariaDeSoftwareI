package entities;

// ESSA CLASSE FARÁ A LEITURA DO ARQUIVO CSV E ARMAZENARÁ TODOS OS NOMES NO VETOR ALUNOS

import java.io.BufferedReader;
import java.io.*;


public class LerArquivo {
    int num;
    String arquivo = "alunosESI.csv";
    String[] alunos = new String[45];
    BufferedReader leitor = null;
    String linha = "";
    String divisor = ",";

    // FUNÇÃO PARA LEITURA DO ARQUIVO

    public void leitura(){
        try {
            int i = 0;
            leitor = new BufferedReader(new FileReader(this.arquivo));
            while ((linha = leitor.readLine()) != null) {
                alunos[i] = linha;
                i++;
            }

            // TRATAMENTO DE EXCEÇÕES PARA QUE O CÓDIGO FUNCIONE

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (leitor != null) {
                try{
                    leitor.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // ESSA FUNÇÃO RETORNARÁ O NOME DO ALUNO SORTEADO, RECEBENDO O NÚMERO SORTEADO EM SORTEIO.JAVA

    public void alunoSorteado(int num){
        System.out.printf("Aluno sorteado: %s", alunos[num]);
    }



}
