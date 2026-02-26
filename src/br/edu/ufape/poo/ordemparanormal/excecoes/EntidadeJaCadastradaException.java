package br.edu.ufape.poo.ordemparanormal.excecoes;

public class EntidadeJaCadastradaException extends Exception {

    public EntidadeJaCadastradaException(String id) {
        super("Operação negada. Entidade com ID:" + id + "já existe no Outro Lado.");
    }

}
